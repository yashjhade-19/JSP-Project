<!--inserting subjects dynamically into markss table-->


<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    boolean success = false;

    try {
        // 1. Database Connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false", "root", "yjserver19");
        con.setAutoCommit(false); // Start transaction

        // 2. Insert Student
        String rollNumber = request.getParameter("roll_number");
        String studentName = request.getParameter("name");

        pstmt = con.prepareStatement(
            "INSERT INTO students (roll_number, name) VALUES (?, ?)", 
            Statement.RETURN_GENERATED_KEYS
        );
        pstmt.setString(1, rollNumber);
        pstmt.setString(2, studentName);
        pstmt.executeUpdate();

        // Get generated student_id
        int studentId = 0;
        rs = pstmt.getGeneratedKeys();
        if (rs.next()) studentId = rs.getInt(1);
        rs.close();
        pstmt.close();

        // 3. Process ALL Subjects & Marks (dynamic parameters)
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();

            // Look for subjectName parameters
            if (paramName.startsWith("subjectName")) {
                String subjectName = request.getParameter(paramName);
                String marksParam = paramName.replace("subjectName", "marks");
                String marksStr = request.getParameter(marksParam);

                if (subjectName == null || marksStr == null || 
                    subjectName.isEmpty() || marksStr.isEmpty()) {
                    continue; // Skip invalid entries
                }

                int marks = Integer.parseInt(marksStr);

                // 4. Insert/Get Subject
                int subjectId;
                pstmt = con.prepareStatement(
                    "SELECT subject_id FROM subjects WHERE subject_name = ?"
                );
                pstmt.setString(1, subjectName);
                rs = pstmt.executeQuery();

                if (rs.next()) { // Subject exists
                    subjectId = rs.getInt("subject_id");
                } else { // Insert new subject
                    rs.close();
                    pstmt.close();
                    pstmt = con.prepareStatement(
                        "INSERT INTO subjects (subject_name) VALUES (?)", 
                        Statement.RETURN_GENERATED_KEYS
                    );
                    pstmt.setString(1, subjectName);
                    pstmt.executeUpdate();
                    rs = pstmt.getGeneratedKeys();
                    rs.next();
                    subjectId = rs.getInt(1);
                }
                rs.close();
                pstmt.close();

                // 5. Insert Marks
                pstmt = con.prepareStatement(
                    "INSERT INTO marks (student_id, subject_id, marks) VALUES (?, ?, ?)"
                );
                pstmt.setInt(1, studentId);
                pstmt.setInt(2, subjectId);
                pstmt.setInt(3, marks);
                pstmt.executeUpdate();
                pstmt.close();
            }
        }

        con.commit(); // Commit transaction
        success = true;
        response.sendRedirect("ShowAll.jsp");

    } catch (Exception e) {
        if (!success) {
            try { con.rollback(); } catch (SQLException ex) {}
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
        e.printStackTrace();
    } finally {
        // Cleanup resources
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>