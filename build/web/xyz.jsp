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