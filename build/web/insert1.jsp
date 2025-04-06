<%@page import="java.sql.*" %>
<%
String roll_no = request.getParameter("roll_no");
String name = request.getParameter("name");
String sub1 = request.getParameter("sub1");
String marks1 = request.getParameter("marks1");
String sub2 = request.getParameter("sub2");
String marks2 = request.getParameter("marks2");
String sub3 = request.getParameter("sub3");
String marks3 = request.getParameter("marks3");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true", "root", "yjserver19");

    // Step 1: Check if the roll number already exists
    PreparedStatement checkStmt = con.prepareStatement("SELECT COUNT(*) FROM insmarks WHERE roll_no = ?");
    checkStmt.setString(1, roll_no);
    ResultSet rs = checkStmt.executeQuery();
    rs.next();
    int count = rs.getInt(1);

    if (count > 0) {
        // If roll number exists, show an alert and redirect back
        out.println("<script>alert('Error: Roll number already exists!'); window.history.back();</script>");
    } else {
        // Step 2: Insert new record only if roll number does not exist
        PreparedStatement pst = con.prepareStatement("INSERT INTO insmarks (roll_no, name, sub1, marks1, sub2, marks2, sub3, marks3) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        pst.setString(1, roll_no);
        pst.setString(2, name);
        pst.setString(3, sub1);
        pst.setString(4, marks1);
        pst.setString(5, sub2);
        pst.setString(6, marks2);
        pst.setString(7, sub3);
        pst.setString(8, marks3);

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            response.sendRedirect("ShowAll.jsp"); // Redirect to success page
        } else {
            out.println("<script>alert('Error inserting record!'); window.history.back();</script>");
        }
    }

    con.close();
} catch (Exception e) {
    out.println("<script>alert('Database error: " + e.getMessage() + "'); window.history.back();</script>");
}
%>
