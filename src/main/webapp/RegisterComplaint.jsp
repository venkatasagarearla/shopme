<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='RegisterComplaint.css'>
</head>
<body>
<div class="complaint-form-container">
        <h2>Register Complaint</h2>
        <form  action="<%= request.getContextPath() %>/registercomplaint" method="post">
            <div class="form-group">
                <label for="orderId">Enter your Order ID:</label>
                <input type="text" id="orderId" name="orderId" required>
            </div>
            <div class="form-group">
                <label for="buyerName">Enter your Name:</label>
                <input type="text" id="buyerName" name="buyerName" required>
            </div>
            <div class="form-group">
                <label for="buyerEmail">Your email</label>
                <input type="email" id="buyerEmail" name="buyerEmail" required>
            </div>
            <div class="form-group">
                <label for="registerComplaint">Complaint:</label>
                <textarea id="registerComplaint" name="registerComplaint" rows="4" required></textarea>
            </div>
           <input type="hidden" name="complaintStatus" value="true">
            <button type="submit" class="register-btn">Register Complaint</button>
        </form>
    </div>
</body>
</html>