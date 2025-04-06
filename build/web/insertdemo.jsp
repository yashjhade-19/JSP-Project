<!--inserting subjects name dynamically-->




<html>
<head>
    <link rel="stylesheet" href="abc.css?v=3"/>

    <script>
        function addSubjectField() {
            var container = document.getElementById("subjectsContainer");
            var count = container.children.length + 1;

            var tr = document.createElement("tr");
            tr.innerHTML = `
                <td>Subject Name:</td>
                <td><input type="text" name="subjectName${count}" required></td>
            `;

            var tr2 = document.createElement("tr");
            tr2.innerHTML = `
                <td>Marks:</td>
                <td><input type="text" name="marks${count}" required></td>
            `;

            container.appendChild(tr);
            container.appendChild(tr2);
        }
    </script>
</head>
<body>

    <%@include file="menudemo3.jsp" %>
    <div id="mydata">
        <center>
            <form action="insertdemo1.jsp" method="post">
                <table cellpadding="12">
                    <tr>
                        <td>Enter Roll No:</td>
                        <td><input type="text" name="roll_number" required class="c1"></td>
                    </tr>

                    <tr>
                        <td>Enter Name:</td>
                        <td><input type="text" name="name" required class="c1"></td>
                    </tr>

                    <!-- Subjects will be added dynamically here -->
                    <tbody id="subjectsContainer"></tbody>

                    <tr>
                        <td colspan="2">
                            <button type="button" onclick="addSubjectField()" class="B">Add Subject</button>
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Insert" class="B">
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </div>

</body>
</html>
