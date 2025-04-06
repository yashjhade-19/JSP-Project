<%@page import="java.sql.*" %>
<% 
    String s1=request.getParameter("name");	
String s2=request.getParameter("cname");	
String s3=request.getParameter("email");	
String s4=request.getParameter("roll");	
String s5=request.getParameter("gender");	
String s6=request.getParameter("dob");	
String s7=request.getParameter("address");	
String s8=request.getParameter("password");	


try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///jspproject?useSSL=false&allowPublicKeyRetrieval=true","root","yjserver19");
Statement st=con.createStatement();
int x=st.executeUpdate("INSERT INTO registration (name, contact_number, email, roll_number, gender ,dob, address, password) VALUES ('"
    + s1 + "', '" + s2 + "', '" + s3 + "', '" + s4 + "', '" + s5 + "', '" + s6 + "', '" + s7 + "','" + s8 + "')");
if(x>0)
{
response.sendRedirect("login.jsp");
}
else
{
out.println("data not insert");
}
con.close();
}
catch(Exception e)
{
out.println(e);	
}
%>