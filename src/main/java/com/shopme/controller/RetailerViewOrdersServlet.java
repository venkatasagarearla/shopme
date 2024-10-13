package com.shopme.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopme.entity.Order;
import com.shopme.service.RetailerServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

@WebServlet("/retailerviewordersservlet")
public class RetailerViewOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession session = request.getSession(false); // Use false to avoid creating a new session
	        if (session != null) {
	            String email = (String) session.getAttribute("email");
	            System.out.println(email);
	            if (email != null) {
	                // Use the email as needed
	                session.setAttribute("email", email);
	                System.out.println("inside the  ");
	               RetailerServiceInterface rService=ShopMeServiceFactory.createRetailerObject("Retailer");
	                List<Order> orders=rService.getOrdersByEmail(email);
	                System.out.println(orders);
	                request.setAttribute("order", orders);
	 		       
	 		       // Forward the request to the JSP page
	 		       RequestDispatcher dispatcher = request.getRequestDispatcher("RetailerViewOrders.jsp");
	 		       dispatcher.forward(request, response);
	                
	            } else {
	                // Handle the case where the email is not found in the session
	                response.sendRedirect("login.jsp"); // Redirect to login if not logged in
	            }
	        } else {
	            // Handle the case where the session is not found
	            response.sendRedirect("login.jsp"); // Redirect to login if session is not found
	        }
	}

}
