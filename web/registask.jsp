<html>
<head>
<link rel="stylesheet" href="abc.css?v=2"/>
<script >
    function uname()
{
var x=document.getElementById("t1").value;
if(x.length>=3){return true;}
else
{
document.getElementById('s1').innerHTML="invalid username length";
return false;
}
}
function upass()
{
var x=document.getElementById("t2").value;
if(x.length>=3){return true;}
else
{
document.getElementById('s2').innerHTML="invalid username length";
return false;
}
}

function demo()
{
document.getElementById('s1').innerHTML="";
document.getElementById('s2').innerHTML="";
if(uname() && upass())
{
form1.submit();
}}
</script>
</head>
<body>

     <%@include file="menudemo1.jsp" %>
<div id="mydata">
<center>
<form action="register1.jsp"  name="form1" >
<table cellpadding="12">
<caption > Registration Page </caption>

<tr>
<td> Enter Name </td>
<td> <input type="text" name="un" class="c1" id="t1" placeholder="Enter name.." >
      <br><span id="s1" class="error"></span> </td>
</tr>


<tr>
<td> Enter Password </td>
<td> <input type="text" name="up" class="c1" id="t2" placeholder="Enter password.." > 
   <br><span id="s2" class="error"></span>  </td>
</tr>

<tr>
<td> Enter C.N. </td>
<td> <input type="text" name="ucn" class="c1" id="t3" placeholder="Enter C.N..."> </td>
</tr>

<tr>
<th colspan="2"> <input type="button" onclick="demo()" class="B" value="insert.."> </th>
</tr>
</table>
</form>
</center>
</div>
</body>
</html> 

