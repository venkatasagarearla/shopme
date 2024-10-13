package com.shopme.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopme.entity.Cart;
import com.shopme.service.GlobalServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/addtocartservlet")
public class AddToCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int productId = Integer.parseInt(request.getParameter("productId"));
//        String productName = request.getParameter("productName");
//        double productPrice = (request.getParameter("productPrice"));
//        String productDescription = request.getParameter("productDescription");
//        String productBrand = request.getParameter("productBrand");
//        BigDecimal productRating = new BigDecimal(request.getParameter("productRating"));
//        BigDecimal productDiscount = new BigDecimal(request.getParameter("productDiscount"));
		System.out.println("inside AddCartServlet");
//		int productId = Integer.parseInt(request.getParameter("productId"));
//		Integer num = productId;
//		if (num instanceof Integer) {
//		    System.out.println("The variable is of type Integer.");
//		}
		String productImagePath=request.getParameter("productImagePath");
        String productName = request.getParameter("productName");
        String productDescription = request.getParameter("productDescription");
        String productBrand = request.getParameter("productBrand");
		double productPrice=Double.parseDouble(request.getParameter("productPrice"));
		double productRating=Double.parseDouble(request.getParameter("productRating"));
		double productDiscount=Double.parseDouble(request.getParameter("productDiscount"));
		
		// Retrieve the email from the session
        HttpSession session = request.getSession(false); // Use false to avoid creating a new session if it doesn't exist
        String email=null;
        if (session != null) {
        	System.out.println("insideSession");
             email = (String) session.getAttribute("email");
             System.out.println(email);
        }
	       if(email !=null) {
	    	// Create a Cart object and set the details
               Cart cart = new Cart();
              
//               cart.setProductID(productId);
               cart.setProductImagePath(productImagePath);
               cart.setEmail(email);
               cart.setProductName(productName);
               cart.setProductPrice(productPrice);
               cart.setProductDescription(productDescription);
               cart.setProductBrand(productBrand);
               cart.setProductRating(productRating);
               cart.setProductDiscount(productDiscount);
               cart.setQuantity(1); // Default quantity is 1
               GlobalServiceInterface gservice=ShopMeServiceFactory.createCartObject("cart");
               int i=gservice.addProductsToCart(cart);
               if(i>0) {
            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/viewCart.html");
					rd.forward(request, response); 
               }else {
            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/LoginFail.html");
					rd.forward(request, response); 
               }
               
	       }
	        
	}

}
