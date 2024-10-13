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
import com.shopme.service.BuyerServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

/**
 * Servlet implementation class MyOrdersServlet
 */
@WebServlet("/myorders")
public class MyOrdersServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false); // Use false to avoid creating a new session if it doesn't exist
        String email=null;
        if (session != null) {
        	System.out.println("insideSession");
             email = (String) session.getAttribute("email");
           
        }
	       if(email !=null) {
	    	   System.out.println("email inside the MyOrdersServlet"+email);
	    	   BuyerServiceInterface buyerService=ShopMeServiceFactory.createBuyerObject("buyer");
		       List<Order> order=buyerService.getAllOrdersByEmail(email);
		       // Set the orders list as a request attribute
		       System.out.println(order.size());
		       request.setAttribute("order", order);
		       
		       // Forward the request to the JSP page
		       RequestDispatcher dispatcher = request.getRequestDispatcher("Myorders.jsp");
		       dispatcher.forward(request, response);
		
	}
	       if(email==null) {
	    	   RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
		       dispatcher.forward(request, response);  
	       }

}
}