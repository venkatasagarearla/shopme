<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="java.util.List" %>
<%@ page import="com.shopme.entity.Cart" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href='checkOut.css'>
</head>
<body>
 <h1>Your Cart</h1>
    
    <div class="cart-items">
       <%
    List<Cart> cartItems = (List<Cart>) request.getAttribute("cartItems");
    if (cartItems != null && !cartItems.isEmpty()) {
        for (Cart item : cartItems) {
%>
            <div class="product-detail">
                <div class="product-image">
                    <img src="<%= item.getProductImagePath() %>" alt="<%= item.getProductName() %>">
                </div>
                <div class="product-info">
                    <h2><%= item.getProductName() %></h2>
                    <p>Price: $<%= item.getProductPrice() %></p>
                    <p>Description: <%= item.getProductDescription() %></p>
                    <p>Brand: <%= item.getProductBrand() %></p>
                    <p>Rating: <%= item.getProductRating() %></p>
                    <p>Discount: <%= item.getProductDiscount() %>%</p>
                    
                    <form action="<%= request.getContextPath() %>/order.jsp" method="post" style="display:inline;">
                        <input type="hidden" name="productName" value="<%= item.getProductName() %>">
                        <input type="hidden" name="productPrice" value="<%= item.getProductPrice() %>">
                        <input type="hidden" name="productBrand" value="<%= item.getProductBrand() %>">
                        <input type="hidden" name="productRating" value="<%= item.getProductRating() %>">
                        <input type="hidden" name="productDiscount" value="<%= item.getProductDiscount() %>">
                        <button type="submit" class="buy-button">Buy</button>
                    </form>
                </div>
            </div>
<%
        }
    } else {
%>
        <p>Your cart is empty.</p>
<%
    }
%>
</body>
</html>