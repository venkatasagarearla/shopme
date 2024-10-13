<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List" %>
<%@ page import="com.shopme.entity.Order" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>retailers view Orders</title>
<link rel="stylesheet" href="RetailerViewOrder.css">
</head>
<body>
 <div id="ordersContainer">
        <%
            List<Order> orders = (List<Order>) request.getAttribute("order");
            if (orders != null && !orders.isEmpty()) {
        %>
            <table>
                <thead>
                    <tr>
                        <th>Order ID</th>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Brand</th>
                        <th>Rating</th>
                        <th>Discount</th>
                        <th>Price After Discount</th>
                        <th>Buyer Name</th>
                        <th>Mobile Number</th>
                        <th>Pincode</th>
                        <th>Address</th>
                        <th>Payment Type</th>
                        <th>Email</th>
                        <th>Date & Time</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    for (Order order : orders) {
                %>
                    <tr>
                        <td><%= order.getOrderId() %></td>
                        <td><%= order.getProductName() %></td>
                        <td><%= order.getProductPrice() %></td>
                        <td><%= order.getProductBrand() %></td>
                        <td><%= order.getProductRating() %></td>
                        <td><%= order.getProductDiscount() %></td>
                        <td><%= order.getPriceAfterDiscount() %></td>
                        <td><%= order.getBuyerName() %></td>
                        <td><%= order.getMobileNumber() %></td>
                        <td><%= order.getPincode() %></td>
                        <td><%= order.getAddress() %></td>
                        <td><%= order.getPaymentType() %></td>
                        <td><%= order.getBuyerEmail() %></td>
                        <td><%= order.getDateTime() %></td>
                    </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        <%
            }
        %>
    </div>
</body>
</html>