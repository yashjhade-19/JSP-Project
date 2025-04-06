<%@page import="java.sql.*" %>
<html>
<head>
<link rel="stylesheet" href="abc.css?v=3"/>
</head>
<body>

    <%@include file="menudemo3.jsp" %>

<div id="mydata">
<center>
<form action="search.jsp">
    
<table cellpadding="12">

<tr>
<td> Enter RNO </td>
<td> <input type="text" name="u1" id="t1" placeholder="Enter rno.."> </td>
</tr>

<tr>
<th colspan="2"> <input type="submit" name="b1" class="B" value="Search"> </th>
</tr>


</table>
</form>
<%
String s1=request.getParameter("b1");
if(s1!=null)
{
    String s11=request.getParameter("u1");
try
{
Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true","root","yjserver19");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from insmarks where roll_no='"+s11+"' ");
if(rs.next())
{
%>


<table border="1" cellpadding="10">
                <tr>
                    <th>Roll No.</th>
                    <td><%= rs.getString(1) %></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td><%= rs.getString(2) %></td>
                </tr>
                <tr>
                    <th>Subject 1</th>
                    <td><%= rs.getString(3) %></td>
                </tr>
                <tr>
                    <th>Marks</th>
                    <td><%= rs.getString(4) %></td>
                </tr>
                <tr>
                    <th>Subject 2</th>
                    <td><%= rs.getString(5) %></td>
                </tr>
                  <tr>
                    <th>Marks</th>
                    <td><%= rs.getString(6) %></td>
                </tr>
                <tr>
                    <th>Subject 3</th>
                    <td><%= rs.getString(7) %></td>
                </tr>
                  <tr>
                    <th>Marks</th>
                    <td><%= rs.getString(8) %></td>
                </tr>
                   
<%}
else
{%>
 <font class="error">Invalid RNO.</font>
<%    
}
}
catch(Exception e)
{
    out.println(e);
} }   
%>

</center>
</div>
</body>
</html>