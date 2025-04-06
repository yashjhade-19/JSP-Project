<%@page import="java.sql.*" %>
<%
String s2 = request.getParameter("b2");
if (s2 != null) {
    String rollNo = request.getParameter("n1");
    String name = request.getParameter("n2");
    String marks1 = request.getParameter("n3");
    String marks2 = request.getParameter("n4");
    String marks3 = request.getParameter("n5");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true", "root", "yjserver19");
        Statement st = con.createStatement();

        // Update query
        String query = "UPDATE insmarks SET name='" + name + "', marks1='" + marks1 + "', marks2='" + marks2 + "', marks3='" + marks3 + "' WHERE roll_no='" + rollNo + "'";
        int x = st.executeUpdate(query);

        response.sendRedirect("ShowAll.jsp");
        con.close();
    } catch (Exception e) {
        out.println(e);
    }
}
%>    

<html>
<head>
    <link rel="stylesheet" href="abc.css?v=3"/>
    <script>
        function validateForm() {
            let marks1 = document.getElementById("marks1").value;
            let marks2 = document.getElementById("marks2").value;
            let marks3 = document.getElementById("marks3").value;

            // Validation for marks (0-100)
            if (marks1 < 0 || marks1 > 100 || isNaN(marks1)) {
                alert("Marks for Subject 1 must be between 0 and 100");
                return false;
            }
            if (marks2 < 0 || marks2 > 100 || isNaN(marks2)) {
                alert("Marks for Subject 2 must be between 0 and 100");
                return false;
            }
            if (marks3 < 0 || marks3 > 100 || isNaN(marks3)) {
                alert("Marks for Subject 3 must be between 0 and 100");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>

<%@include file="menudemo3.jsp" %>

<div id="mydata">
    <center>
        <form action="update.jsp" method="post">
            <table cellpadding="12">
                <tr>
                    <td>Enter Roll No.</td>
                    <td><input type="text" name="u1" id="t1" placeholder="Enter Roll No.." required></td>
                </tr>
                <tr>
                    <th colspan="2">
                        <input type="submit" name="b1" class="B" value="Search">
                    </th>
                </tr>
            </table>
        </form>

        <%
        String s1 = request.getParameter("b1");
        if (s1 != null) {
            String s11 = request.getParameter("u1");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true", "root", "yjserver19");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM insmarks WHERE roll_no='" + s11 + "'");

                if (rs.next()) {
        %>
        <form action="update.jsp" method="post" onsubmit="return validateForm()">
            <table border="1" cellpadding="10">
                <tr>
                    <th>Roll No</th>
                    <td><input type="text" name="n1" value="<%= rs.getString(1) %>" readonly></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="n2" value="<%= rs.getString(2) %>" required></td>
                </tr>
                <tr>
                    <td><%= rs.getString(3) %></td>
                    <td><input type="text" name="n3" id="marks1" value="<%= rs.getString(4) %>" required></td>
                </tr>
                <tr>
                    <td><%= rs.getString(5) %></td>
                    <td><input type="text" name="n4" id="marks2" value="<%= rs.getString(6) %>" required></td>
                </tr>
                <tr>
                    <td><%= rs.getString(7) %></td>
                    <td><input type="text" name="n5" id="marks3" value="<%= rs.getString(8) %>" required></td>
                </tr>
                <tr>
                    <th colspan="2">
                        <input type="submit" name="b2" class="B" value="Update">
                    </th>
                </tr>
            </table>
        </form>
        <%
                } else {
        %>
        <font class="error">Invalid Roll No.</font>
        <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        }
        %>

    </center>
</div>
</body>
</html>
