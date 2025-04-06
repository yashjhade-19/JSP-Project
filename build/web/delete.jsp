<%@page import="java.sql.*" %>
<%
String s1 = request.getParameter("u1");
boolean invalidRollNo = false; // Flag for error message

if (s1 != null && !s1.trim().isEmpty()) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true", "root", "yjserver19");
        Statement st = con.createStatement();

        int rollNo = Integer.parseInt(s1);

        // Check if roll_no exists
        ResultSet rs = st.executeQuery("SELECT * FROM insmarks WHERE roll_no='" + rollNo + "'");
        
        if (rs.next()) {
            // Roll No exists, proceed with deletion
            int x = st.executeUpdate("DELETE FROM insmarks WHERE roll_no='" + rollNo + "'");
            response.sendRedirect("ShowAll.jsp");
        } else {
            invalidRollNo = true; // Set flag for displaying error
        }
        con.close();
    } catch (NumberFormatException e) {
        invalidRollNo = true; // Handle invalid input (non-numeric roll number)
    } catch (Exception e) {
        out.println(e);
    }
}
%>

<html>
<head>
    <link rel="stylesheet" href="abc.css?v=3"/>
</head>
<body>

    <%@include file="menudemo3.jsp" %>

    <div id="mydata">
        <center>
            <form action="delete.jsp" method="post">
                <table cellpadding="12">
                    <tr>
                        <td> Enter Roll No </td>
                        <td> <input type="text" name="u1" id="t1" placeholder="Enter Roll No.." required> </td>
                    </tr>
                    <tr>
                        <th colspan="2"> <input type="submit" class="B" value="Delete"> </th>
                    </tr>
                </table>
            </form>

            <% if (invalidRollNo) { %>
                <font class="error">Invalid RNO.</font>
            <% } %>
        </center>
    </div>
</body>
</html>
