<%@page import="java.sql.*" %>
<html>
<head>
    <link rel="stylesheet" href="abc.css"/>
</head>
<body>  

<%@include file="studentmenu2.jsp" %>

<div id="mydata">
<center>
<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true", "root", "yjserver19");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM insmarks");
%>

<table border="1" cellpadding="12">
<tr>
    <th>Roll No</th>
    <th>Name</th>
    <th>Subject 1</th><th>Marks</th>
    <th>Subject 2</th><th>Marks</th>
    <th>Subject 3</th><th>Marks</th>
</tr>

<%
    while (rs.next()) {
        out.print("<tr>");
        out.print("<td>" + rs.getString("roll_no") + "</td>");
        out.print("<td>" + rs.getString("name") + "</td>");
        out.print("<td>" + rs.getString("sub1") + "</td><td>" + rs.getString("marks1") + "</td>");
        out.print("<td>" + rs.getString("sub2") + "</td><td>" + rs.getString("marks2") + "</td>");
        out.print("<td>" + rs.getString("sub3") + "</td><td>" + rs.getString("marks3") + "</td>");
        out.print("</tr>");
    }

    con.close();
} catch (Exception e) {
    out.println("Error: " + e);
}
%>

</table>
</center>
</div>

</body>
</html>
