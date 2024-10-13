<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href='UpdateProductDetails.css'>
</head>
<body>
<div class="form-container">
    <h2>Product Form</h2>
    <form action="<%=request.getContextPath() %>/manageProductsandupdates" method="post">
    <label for="productPrice">Product Id:</label>
        <input type="number" id="productid" name="productid"  required>
    
        <label for="productPrice">Product Price:</label>
        <input type="number" id="productPrice" name="productPrice" step="0.01" required>

        <label for="productDiscount">Product Discount (%):</label>
        <input type="number" id="productDiscount" name="productDiscount" step="0.01" required>

        <label for="productQunatity">Product Quantity:</label>
        <input type="number" id="productQunatity" name="productQunatity" required>

        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>