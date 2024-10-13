<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order your project </title>
<link rel='stylesheet' href='order.css'>
<script type="text/javascript">
document.addEventListener('DOMContentLoaded', function() {
    const productPrice = parseFloat(document.querySelector('input[name="productPrice"]').value);
    const productDiscount = parseFloat(document.querySelector('input[name="productDiscount"]').value);
    
    let priceAfterDiscount;

    if (productDiscount === 0.0) {
        priceAfterDiscount = productPrice;
    } else {
        const discountAmount = (productPrice * productDiscount) / 100;
        priceAfterDiscount = productPrice - discountAmount;
    }

    document.getElementById('priceAfterDiscount').value = priceAfterDiscount.toFixed(2);
});
</script>
</head>
<body>

<h2 id="order-title">Order your Product</h2>
<div class="container">
    <form action="<%= request.getContextPath() %>/orderproduct" method="post">
        <div class="form-group">
            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName" readonly value="<%= request.getParameter("productName") %>">
        </div>
        <div class="form-group">
            <label for="productPrice">Product Price:</label>
            <input type="number" id="productPrice" name="productPrice" readonly step="0.01" value="<%= request.getParameter("productPrice") %>">
        </div>
        <div class="form-group">
            <label for="productBrand">Product Brand:</label>
            <input type="text" id="productBrand" name="productBrand" readonly value="<%= request.getParameter("productBrand") %>">
        </div>
        <div class="form-group">
            <label for="productRating">Product Rating:</label>
            <input type="number" id="productRating" name="productRating" readonly step="0.01" value="<%= request.getParameter("productRating") %>">
        </div>
        <div class="form-group">
            <label for="productDiscount">Product Discount:</label>
            <input type="number" id="productDiscount" name="productDiscount" readonly step="0.01" value="<%= request.getParameter("productDiscount") %>">
        </div>
        <div class="form-group">
            <label for="priceAfterDiscount">Price After Discount:</label>
            <input type="number" id="priceAfterDiscount" name="priceAfterDiscount" readonly step="0.01">
        </div>

        <div class="form-group">
            <label for="buyerName">Name:</label>
            <input type="text" id="buyerName" name="buyerName" required>
        </div>
        <div class="form-group">
            <label for="mobileNumber">Mobile Number:</label>
            <input type="text" id="mobileNumber" name="mobileNumber" required>
        </div>
        <div class="form-group">
            <label for="pincode">Pincode:</label>
            <input type="text" id="pincode" name="pincode" required>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <textarea id="address" name="address" required></textarea>
        </div>
        <div class="form-group">
            <label for="paymentType">Payment Type:</label>
            <input type="text" id="paymentType" name="paymentType" value="Cash on Delivery" readonly>
        </div>

        <button type="submit" class="confirm-order">Confirm Order</button>
    </form>
</div>

</body>
</html>