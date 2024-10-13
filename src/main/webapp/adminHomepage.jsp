<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='adminHomepage.css'>
</head>
<body>
<p>Welcome to admin home page </p>
<div class="button-container">
<form action="<%= request.getContextPath() %>/RetailerApproval.jsp" method="post" style="display:inline;">
 <input type="submit" name="button" value="RetailerRequest">
</form>
<form action="<%= request.getContextPath() %>/getAllBuyers" method="post" style="display:inline;">
 <input type="submit" name="button" value="All Buyers">
</form>
<form action="<%= request.getContextPath() %>/viewallretailers" method="post" style="display:inline;">
 <input type="submit" name="button" value="All Retailers">
</form>
<form action="<%= request.getContextPath() %>/GlobalServlet?taskType=adminlogout" method="post" style="display:inline;">
<input type="submit" value="LogOut">
</form>
</div>
</body>
</html>