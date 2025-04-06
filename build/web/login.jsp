<html>
<head>
<link rel="stylesheet" href="abc.css?v=2"/>
<script>
function validation()
    {
        var name=document.getElementById("t1").value.trim();
        var pass=document.getElementById("t2").value.trim();
        var nameErr=document.getElementById("nameErr");
        var passErr=document.getElementById("passErr");
        
        nameErr.innerHTML="";
        passErr.innerHTML="";
        
        if(name.length <3)
        {
           nameErr.innerHTML="Username must be atleast 3 Characters";
           return false;
        }
        
        if(pass.length <3)
        {
           passErr.innerHTML="Password must be atleast 3 Characters";
           return false;
        }
    return true;
    }
    </script>
</head>
<body>
    <%@include file="menudemo1.jsp" %>
<div id="mydata">
<center>
<% 
String s11=request.getParameter("s1");
if(s11!=null)
{
%>
<span class="error">
    
<%=s11%>
</span>
<%}%>

    
    
<form action="login1.jsp"  onsubmit="return validation()" method="post">
<table cellpadding="12">
<caption > Login Page </caption>

<tr>
<td> Enter Name </td>
<td> <input type="text" name="u1" class="c1" id="t1" placeholder="Enter name.." onkeyup="validation()">
      <br><span id="nameErr" class="error"></span> </td>
</tr>


<tr>
<td> Enter Password </td>
<td> <input type="password" name="u2" class="c1" id="t2" placeholder="Enter password.." onkeyup="validation()"> 
   <br><span id="passErr" class="error"></span>  </td>
</tr>

<tr>
<th colspan="2"> <input type="submit" class="B" value="Login"> </th>
</tr>
</table>
</form>
</center>
</div>
</body>
</html> 

