<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="com.shopme.entity.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 
   <link rel="stylesheet"  href="AllProducts.css"> 
</head>
<body>
 
 


 <h1>Product List</h1>
    
     <div id="productContainer">
        <% 
            List<Product> products = (List<Product>) request.getAttribute("products");
            if (products != null && !products.isEmpty()) {
                for (Product product : products) { 
        %>
            <div class="product-detail">
                <img src="<%= request.getContextPath() +product.getImagePath() %>" alt="Product Image">
                <div class="product-info">
                    <h2><%= product.getProductName() %></h2>
                    <p>Price: $<%= product.getPrice() %></p>
                    <p>Description: <%= product.getDescription() %></p>
                    <p>Brand: <%= product.getBrand() %></p>
                    <p>Rating: <%= product.getRating() %></p>
                   
        <form action="<%= request.getContextPath() %>/addtocartservlet" method="post" style="display:inline;">
           <!--   <input type="hidden" name="productId" value="<%= product.getProductId() %>">-->
          
            <input type="hidden" name="productName" value="<%= product.getProductName() %>">
            <input type="hidden" name="productPrice" value="<%= product.getPrice() %>">
            <input type="hidden" name="productDescription" value="<%= product.getDescription() %>">
            <input type="hidden" name="productBrand" value="<%= product.getBrand() %>">
            <input type="hidden" name="productRating" value="<%= product.getRating() %>">
            <input type="hidden" name="productDiscount" value="<%= product.getDiscount() %>">
            <input type="hidden" name="productImagePath" value="<%= product.getImagePath() %>">
            <button type="submit" class="add-to-cart">Add topro Cart</button>
            </form>
                </div>
            </div>
        <% 
                }
            } else {
        %>
            <p>No products available.</p>
        <% 
            } 
        %>
    </div> 
</body>
</html>