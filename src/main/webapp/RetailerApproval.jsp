<%@ page import="java.util.List" %>
<%@ page import="com.shopme.entity.Retailer" %>
<%@ page import="com.shopme.service.GlobalServiceInterface"%>
<%@ page import="com.shopme.utility.ShopMeServiceFactory" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Pending Retailer Approvals</h2>
<table border="1">
    <tr>
        <th>Shop ID</th>
        <th>Owner Name</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Shop Name</th>
        <th>Shop Address</th>
        <th>Action</th>
    </tr>
    <%
        GlobalServiceInterface gService = ShopMeServiceFactory.createObject("retailer");
        List<Retailer> pendingRetailers = gService.getPendingRetailers();
        
        for (Retailer retailer : pendingRetailers) {
    %>
    <tr>
        <td><%= retailer.getShopId() %></td>
        <td><%= retailer.getOwnerName() %></td>
        <td><%= retailer.getEmail() %></td>
        <td><%= retailer.getPhoneNumber() %></td>
        <td><%= retailer.getShopName() %></td>
        <td><%= retailer.getShopAdress() %></td>
        <td>
            <form action="GlobalServlet?taskType=RetailerRequest" method="post">
                <input type="hidden" name="shopId" value="<%= retailer.getShopId() %>" />
                <input type="submit" value="Approve" />
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>