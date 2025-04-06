
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
            <link rel="stylesheet" href="abc.css"/>
 <style>
       .button-container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 70vh;
            margin: 0;
            flex-direction: column;
            
        }
        .button-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 40px;
        }

 </style>
    </head>
    <body>
    <center>
        <h2>Welcome to Marks Management System</h2>
    <div class="button-container">
        <h4 style="color:white" >Select Your Role</h4>
        <form action="login.jsp">
            <input type="submit" value="Admin" class="B" style="font-size: 18px; padding: 12px 24px; width: 100px; height: 50px;">
        </form>
        <form action="studentlogin.jsp">
            <input type="submit" value="User" class="B" style="font-size: 18px; padding: 12px 24px; width: 100px; height: 50px;">
        </form>
    </div>
    </center>
    </body>
</html>
