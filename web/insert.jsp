<html>
<head>
    <link rel="stylesheet" href="abc.css"/>
    <script>
        function validateForm() {
            let rollNo = document.getElementsByName("roll_no")[0].value;
            let name = document.getElementsByName("name")[0].value;
            let subjects = [document.getElementsByName("sub1")[0].value, 
                            document.getElementsByName("sub2")[0].value, 
                            document.getElementsByName("sub3")[0].value];
            let marks = [document.getElementsByName("marks1")[0].value, 
                         document.getElementsByName("marks2")[0].value, 
                         document.getElementsByName("marks3")[0].value];

            // Roll Number Validation (Must be exactly 4 digits)
            let rollNoPattern = /^[0-9]{4}$/;
            if (!rollNoPattern.test(rollNo)) {
                alert("Error: Roll Number must be exactly 4 digits!");
                return false;
            }

            // Name Validation (Should not be empty)
            if (name.trim() === "") {
                alert("Error: Name cannot be empty!");
                return false;
            }

            // Subjects & Marks Validation
            for (let i = 0; i < 3; i++) {
                if (subjects[i].trim() === "") {
                    alert(`Error: Subject ${i + 1} cannot be empty!`);
                    return false;
                }
                let markValue = parseInt(marks[i]);
                if (isNaN(markValue) || markValue < 0 || markValue > 100) {
                    alert(`Error: Marks for Subject ${i + 1} must be between 0 and 100!`);
                    return false;
                }
            }

            return true; // Form is valid, allow submission
        }
    </script>
</head>
<body>

<%@include file="menudemo3.jsp" %>

<div id="mydata">
    <center>
        <form action="insert1.jsp" method="post" onsubmit="return validateForm();">
            <table cellpadding="12">
                <caption><h3> Enter Student Marks </h3></caption>
                
                <tr>
                    <td>Enter Roll No</td>
                    <td><input type="text" name="roll_no" placeholder="Enter RNo.." required></td>
                </tr>
                <tr>
                    <td>Enter Name</td>
                    <td><input type="text" name="name" placeholder="Enter Name.." required></td>
                </tr>
                <tr>
                    <td>Enter Subject 1</td>
                    <td><input type="text" name="sub1" required></td>
                    <td>Marks</td>
                    <td><input type="text" name="marks1" required></td>
                </tr>
                <tr>
                    <td>Enter Subject 2</td>
                    <td><input type="text" name="sub2" required></td>
                    <td>Marks</td>
                    <td><input type="text" name="marks2" required></td>
                </tr>
                <tr>
                    <td>Enter Subject 3</td>
                    <td><input type="text" name="sub3" required></td>
                    <td>Marks</td>
                    <td><input type="text" name="marks3" required></td>
                </tr>
                <tr>
                    <th colspan="4"><input type="submit" value="Insert" class="B"></th>
                </tr>
            </table>
        </form>
    </center>
</div>

</body>
</html>
