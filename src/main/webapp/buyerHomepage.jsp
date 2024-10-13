<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='BuyerHomePageHeader.css'>
</head>
<body>
<h2>Welcome to your account</h2>
<header class="sticky-header">
<form action="BuyerServlet?taskType=getAllPoducts" method="post">
    <input type="submit" name="button" value="submit">
</form>
<form action="<%= request.getContextPath() %>/checkoutproducts" method="post">
    <input type="submit" name="button" value="ViewYourCart">
</form>
<form action="<%= request.getContextPath() %>/myorders" method="post">
    <input type="submit" name="button" value="MY orders">
</form>
<form action="<%= request.getContextPath() %>/RegisterComplaint.jsp" method="post">
    <input type="submit" value="Raise a Ticket">
</form>
<form action="<%= request.getContextPath() %>/GlobalServlet?taskType=buyerlogout" method="post" style="display:inline;">
<input type="submit" value="LogOut">
</form>
</header>
</body>
</html>