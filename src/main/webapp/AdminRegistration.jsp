<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="AdminRegistration.css">
<script>
        function validateForm() {
            var isValid = true;

            var name = document.forms["adminForm"]["name"];
            var email = document.forms["adminForm"]["email"];
            var password = document.forms["adminForm"]["password"];

            var nameError = document.getElementById("nameError");
            var emailError = document.getElementById("emailError");
            var passwordError = document.getElementById("passwordError");

            if (name.value == "") {
                nameError.style.display = "block";
                nameError.innerHTML = "Name is required";
                isValid = false;
            } else {
                nameError.style.display = "none";
            }

            var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
            if (email.value == "") {
                emailError.style.display = "block";
                emailError.innerHTML = "Email is required";
                isValid = false;
            } else if (!email.value.match(emailPattern)) {
                emailError.style.display = "block";
                emailError.innerHTML = "Invalid email format";
                isValid = false;
            } else {
                emailError.style.display = "none";
            }

            if (password.value == "") {
                passwordError.style.display = "block";
                passwordError.innerHTML = "Password is required";
                isValid = false;
            } else if (password.value.length < 6) {
                passwordError.style.display = "block";
                passwordError.innerHTML = "Password must be at least 6 characters long";
                isValid = false;
            } else {
                passwordError.style.display = "none";
            }

            return isValid;
        }
    </script>
</head>
<body>
<div class="form-container">
        <h2>Admin Registration Form</h2>
       <!--  action="BuyerServlet?taskType=Register" -->
       <!-- RetailerServlet?taskType=Register" -->
        <form name="adminForm" action="AdminServlet?taskType=Register" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name">
                <div id="nameError" class="error-message"></div>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" id="email" name="email">
                <div id="emailError" class="error-message"></div>
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password">
                <div id="passwordError" class="error-message"></div>
            </div>

            <input type="submit" value="Register" class="submit-btn">
        </form>
    </div>
</body>
</html>