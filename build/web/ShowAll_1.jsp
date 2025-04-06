<%@page import="java.sql.*" %>
<html>
<head>
<link rel="stylesheet" href="abc.css"/>
</head>
<body>  

<%@include file="menudemo3.jsp" %>
<div id="mydata">
<center>
<%
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///newdb?useSSL=false","root","yjserver19");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from insmarks");
%>
<table cellpadding="12">
<tr>
    <td> RNO </td>    
    <td> Name </td>    
    <td> Phy </td>    
    <td> Chem </td>    
    <td> Maths </td>    
</tr>
<%
while(rs.next())
{
%>
<tr>
    <td> <%= rs.getString(1) %> </td>
    <td> <%= rs.getString(2) %> </td>
    <td> <%= rs.getString(3) %> </td>
    <td> <%= rs.getString(4) %> </td>
    <td> <%= rs.getString(5) %> </td>
</tr>
<%
}
con.close();
}
catch(Exception e)
{
out.println(e);	
}
%>
</table>
</center>
</div>
</body>
</html>