<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.shopme.entity.Order" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Orders</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
<h1>My Orders</h1>

    <%
        List<Order> orders = (List<Order>) request.getAttribute("order");
   
        if (orders != null && !orders.isEmpty()) {
    %>
        <table>
            <tr>
                <th>Order ID</th>
                <th>Product Name</th>
                <th>Price</th>
                <th>Brand</th>
                <th>Price After Discount</th>
                <th>Payment Type</th>
                <th>Order Date</th>
            </tr>
            <%
                for (Order order : orders) {
            %>
            <tr>
                <td><%= order.getOrderId() %></td>
                <td><%= order.getProductName() %></td>
                <td>$<%= order.getProductPrice() %></td>
                <td><%= order.getProductBrand() %></td>
                <td>$<%= order.getPriceAfterDiscount() %></td>
                <td><%= order.getPaymentType() %></td>
                <td><%= order.getDateTime() %></td>
            </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>You have no orders.</p>
    <%
        }
    %>
</body>
</html>