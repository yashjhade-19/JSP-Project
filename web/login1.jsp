<%@page import="java.sql.*"%>

<%
String s1=request.getParameter("u1");	
String s2=request.getParameter("u2");	



try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true","root","yjserver19");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from registration where name='"+s1+"' AND password='"+s2+"'");
if(rs.next())
{
    
response.sendRedirect("menudemo2.jsp"); 
}
else
{
response.sendRedirect("login.jsp?s1=Invalid Username or Password"); 
}
con.close();
}
catch(Exception e)
{
out.println(e);	
}
%>