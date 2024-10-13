<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='RetailerRegistration.css'>
</head>
<body>
<h2>Retailer registration Form</h2>
<form action="RetailerServlet?taskType=Register" method="post">
    <div class="form-row">
        <div class="form-group">
            <label for="ownerName">Owner Name:</label>
            <input type="text" id="ownerName" name="ownerName" required>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
    </div>

    <div class="form-row">
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div class="form-group">
            <label for="phoneNumber">Phone Number:</label>
            <input type="text" id="phoneNumber" name="phoneNumber" required>
        </div>
    </div>

    <div class="form-row">
        <div class="form-group">
            <label for="shopName">Shop Name:</label>
            <input type="text" id="shopName" name="shopName" required>
        </div>

        <div class="form-group">
            <label for="shopAddress">Shop Address:</label>
            <input type="text" id="shopAddress" name="shopAddress" required>
        </div>
    </div>

    <div class="form-row">
        <div class="form-group">
            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName" required>
        </div>

        <div class="form-group">
            <label for="userType">User Type:</label>
            <input type="text" id="userType" name="userType" required>
        </div>
    </div>

    <div class="form-row submit-row">
        <input type="submit" value="Register">
    </div>
</form>
</html>