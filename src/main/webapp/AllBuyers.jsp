<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="com.shopme.entity.Buyer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel='stylesheet' href='AllBuyer.css'>
<body>
<div class="container">
        <h1>All Buyers</h1>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Age</th>
                    <th>Contact No</th>
                    <th>City</th>
                    <th>User Type</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Buyer> buyers = (List<Buyer>) request.getAttribute("buyers");
                    if (buyers != null && !buyers.isEmpty()) {
                        for (Buyer b : buyers) {
                %>
                <tr>
                    <td><%= b.getName() %></td>
                    <td><%= b.getEmail() %></td>
                    <td><%= b.getPassword() %></td>
                    <td><%= b.getAge() %></td>
                    <td><%= b.getContactno() %></td>
                    <td><%= b.getCity() %></td>
                    <td><%= b.getUserType() %></td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="7" style="text-align: center;">No buyers found</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>