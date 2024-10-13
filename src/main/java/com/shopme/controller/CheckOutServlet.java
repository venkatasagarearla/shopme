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

import com.shopme.entity.Cart;
import com.shopme.service.BuyerServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

@WebServlet("/checkoutproducts")
public class CheckOutServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession(false);
	        String email = (String) session.getAttribute("email");
		if (email != null) {
            // Fetch cart items for the user from the database
           BuyerServiceInterface buyerService = ShopMeServiceFactory.createBuyerObject("buyer");
            List<Cart> cartItems = buyerService.getCartItems(email);

            // Set cart items as request attribute
            request.setAttribute("cartItems", cartItems);

            // Forward to checkout page
            RequestDispatcher dispatcher = request.getRequestDispatcher("checkout.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("login.jsp"); // Redirect to login if the user is not logged in
        }
	}

}
