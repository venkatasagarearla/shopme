<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Retailer Home page</title>
</head>
<body>
<p>Inside retailer home page</p>

<form action="<%= request.getContextPath() %>/AddProducts.jsp" method="post" style="display:inline;">
 <input type="submit" name="button" value="Add Products">
</form>

 <form action="<%= request.getContextPath() %>/retailerviewordersservlet" method="post" style="display:inline;">
<input type="submit" value="View Orders">
</form>
<form action="<%= request.getContextPath() %>/UpdateProductDetails.jsp" method="post" style="display:inline;">
<input type="submit" value="update stock">
</form>
<form action="<%= request.getContextPath() %>/GlobalServlet?taskType=retailerlogout" method="post" style="display:inline;">
<input type="submit" value="LogOut">
</form>
</body>
</html>