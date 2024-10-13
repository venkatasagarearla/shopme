<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='AddProducts.css'>
</head>
<body>
<div class="container">
    <h1>Product Form</h1>
    <form id="productForm" action="RetailerServlet?taskType=addProducts" method="post">
        
        <div class="form-group">
            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName">
            <div class="error-message" id="productNameError"></div>
        </div>
        
        <div class="form-group">
            <label for="price">Price:</label>
            <input type="number" id="price" name="price" step="0.01">
            <div class="error-message" id="priceError"></div>
        </div>
        
        <div class="form-group">
            <label for="description">Description:</label>
            <textarea id="description" name="description"></textarea>
            <div class="error-message" id="descriptionError"></div>
        </div>
        
        <div class="form-group">
            <label for="brand">Brand:</label>
            <input type="text" id="brand" name="brand">
            <div class="error-message" id="brandError"></div>
        </div>
        
        <div class="form-group">
            <label for="rating">Rating:</label>
            <input type="text" id="rating" name="rating">
            <div class="error-message" id="ratingError"></div>
        </div>
        
        <div class="form-group">
            <label for="countOfProducts">Count of Products:</label>
            <input type="number" id="countOfProducts" name="countOfProducts">
            <div class="error-message" id="countOfProductsError"></div>
        </div>
        
        <div class="form-group">
            <label for="discount">Discount:</label>
            <input type="number" id="discount" name="discount" step="0.01">
            <div class="error-message" id="discountError"></div>
        </div>
        
        <div class="form-group">
            <label for="shopId">ShopId:</label>
            <input type="number" id="shopId" name="shopId">
            <div class="error-message" id="shopIdError"></div>
        </div>
        
        <div class="form-group">
            <label for="path">Path:</label>
            <input type="text" id="path" name="path">
            <div class="error-message" id="pathError"></div>
        </div>
        
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>