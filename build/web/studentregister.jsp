<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>
    <link rel="stylesheet" href="abc.css?v=2"/>

    <script>
 function validation() {
    var name = document.getElementById("name").value.trim();
    var cn = document.getElementById("cn").value.trim();
    var email = document.getElementById("email").value.trim();
    var roll = document.getElementById("roll").value.trim();
    var dob = document.getElementById("dob").value;
    var pass = document.getElementById("password").value.trim();
    var confirmPass = document.getElementById("confirmPassword").value.trim();
    var address = document.getElementById("address").value.trim();
    var gender = document.querySelector('input[name="gender"]:checked');

    var nameErr = document.getElementById("nameErr");
    var cnErr = document.getElementById("cnErr");
    var emailErr = document.getElementById("emailErr");
    var rollErr = document.getElementById("rollErr");
    var dobErr = document.getElementById("dobErr");
    var passErr = document.getElementById("passErr");
    var confirmPassErr = document.getElementById("confirmPassErr");
    var addressErr = document.getElementById("addressErr");
    var genderErr = document.getElementById("genderErr");

    // Clear previous errors
    nameErr.innerHTML = cnErr.innerHTML = emailErr.innerHTML = rollErr.innerHTML = dobErr.innerHTML =
    passErr.innerHTML = confirmPassErr.innerHTML = addressErr.innerHTML = genderErr.innerHTML = "";

    var valid = true;

    if (!/^[a-zA-Z ]{3,}$/.test(name)) {
        nameErr.innerHTML = "Enter a valid name (min 3 alphabets)";
        valid = false;
    }

    if (!/^\d{10}$/.test(cn)) {
        cnErr.innerHTML = "Contact No. must be exactly 10 digits";
        valid = false;
    }

    if (!/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/.test(email)) {
        emailErr.innerHTML = "Enter a valid email";
        valid = false;
    }

    if (!/^\d{5,10}$/.test(roll)) {
        rollErr.innerHTML = "Roll No. must be 5-10 digits";
        valid = false;
    }

    if (!gender) {
        genderErr.innerHTML = "Please select a gender";
        valid = false;
    }

    var today = new Date();
    var inputDate = new Date(dob);
    var minDOB = new Date();
    minDOB.setFullYear(today.getFullYear() - 12); // Minimum age: 12 years

    if (dob === "" || inputDate >= today || inputDate > minDOB) {
        dobErr.innerHTML = "You must be at least 12 years old";
        valid = false;
    }

    if (address.length < 5) {
        addressErr.innerHTML = "Address must be at least 5 characters";
        valid = false;
    }

    if (pass.length < 6) {
        passErr.innerHTML = "Password must be at least 6 characters";
        valid = false;
    } else if (!/[0-9]/.test(pass)) {
        passErr.innerHTML = "Password must contain at least one number";
        valid = false;
    } else if (!/[!@#$%^&*]/.test(pass)) {
        passErr.innerHTML = "Password must contain at least one special character";
        valid = false;
    }

    if (pass !== confirmPass) {
        confirmPassErr.innerHTML = "Passwords do not match";
        valid = false;
    }

    return valid;
}

    </script>

    <style>
        .error { color: red; font-size: 14px; }
    </style>

</head>
<body>

    <%@include file="studentmenu1.jsp" %>

    <div id="mydata">
    <center>
    <form action="studentregister1.jsp" onsubmit="return validation()" method="post">
    <table cellpadding="12">
    <caption> Registration Page </caption>

    <tr>
        <td>Enter Full Name</td>
        <td> <input type="text" name="name" id="name" placeholder="Enter name.." onkeyup="validation()">
        <br><span id="nameErr" class="error"></span></td>
    </tr>

    <tr>
        <td>Enter Contact No.</td>
        <td> <input type="text" name="cname" id="cn" placeholder="Enter C.N..." onkeyup="validation()"> 
        <br><span id="cnErr" class="error"></span></td>
    </tr>

    <tr>
        <td>Enter Email</td>
        <td> <input type="text" name="email" id="email" placeholder="Enter email.." onkeyup="validation()">
        <br><span id="emailErr" class="error"></span></td>
    </tr>

    <tr>
        <td>Enter Roll Number</td>
        <td> <input type="text" name="roll" id="roll" placeholder="Enter roll no.." onkeyup="validation()">
        <br><span id="rollErr" class="error"></span></td>
    </tr>

    <tr>
    <td>Enter Gender</td>
    <td> 
        <input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Female">Female
        <br><span id="genderErr" class="error"></span>  <!-- Updated ID -->
    </td>
</tr>

    <tr>
        <td>Enter Date Of Birth</td>
        <td> <input type="date" name="dob" id="dob">
        <br><span id="dobErr" class="error"></span></td>
    </tr>

    <tr>
        <td>Enter Address</td>
        <td> <textarea name="address" id="address" placeholder="Enter address.." required onchange="validation()"></textarea>
        <br><span id="addressErr" class="error"></span></td>
    </tr>

   
    <tr>
        <td>Enter Password</td>
        <td> <input type="password" name="password" id="password" placeholder="Enter password.." onkeyup="validation()"> 
        <br><span id="passErr" class="error"></span></td>
    </tr>

    <tr>
        <td>Re-enter Password</td>
        <td> <input type="password" name="confirmPassword" id="confirmPassword" placeholder="Re-enter password.." onkeyup="validation()"> 
        <br><span id="confirmPassErr" class="error"></span></td>
    </tr>

    <tr>
        <th colspan="2"> <input type="submit" class="B" value="Register"> </th>
    </tr>
    </table>
    </form>
    </center>
    </div>

</body>
</html>
