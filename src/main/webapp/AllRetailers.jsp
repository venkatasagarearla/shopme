<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="com.shopme.entity.Retailer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='AllRetailers.css'>
</head>
<div class="container">
        <h1>All Retailers</h1>
        <table>
            <tr>
                <th>Shop ID</th>
                <th>Owner Name</th>
                <th>Email</th>
                <th>Password</th>
                <th>Phone Number</th>
                <th>Shop Name</th>
                <th>Shop Address</th>
                <th>Product Name</th>
                <th>User Type</th>
            </tr>
            <%
                List<Retailer> retailers = (List<Retailer>) request.getAttribute("retailers");
                if (retailers != null && !retailers.isEmpty()) {
                    for (Retailer retailer : retailers) {
            %>
            <tr>
                <td><%= retailer.getShopId() %></td>
                <td><%= retailer.getOwnerName() %></td>
                <td><%= retailer.getEmail() %></td>
                <td><%= retailer.getPassword() %></td>
                <td><%= retailer.getPhoneNumber() %></td>
                <td><%= retailer.getShopName() %></td>
                <td><%= retailer.getShopAdress() %></td>
                <td><%= retailer.getProductName() %></td>
                <td><%= retailer.getUserType() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="9">No retailers found.</td>
            </tr>
            <%
                }
            %>
        </table>
    </div>
</body>
</html>