package com.shopme.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.shopme.entity.*;
import com.shopme.service.BuyerServiceInterface;
import com.shopme.service.GlobalServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;
/**
 * Servlet implementation class OrderProductServlet
 */
@WebServlet("/orderproduct")
public class OrderProductServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside order product servlet");
		String productName=request.getParameter("productName");
		double productPrice=Double.parseDouble(request.getParameter("productPrice"));
		String productBrand=request.getParameter("productBrand");
		double productRating=Double.parseDouble(request.getParameter("productRating"));
		double productDiscount=Double.parseDouble(request.getParameter("productDiscount"));
		double priceAfterDiscount=Double.parseDouble(request.getParameter("priceAfterDiscount"));
		String buyerName=request.getParameter("buyerName");
		String mobileNumber=request.getParameter("mobileNumber");
		int  pincode=Integer.parseInt(request.getParameter("pincode"));
		String address=request.getParameter("address");
		String paymentType=request.getParameter("paymentType");
		 HttpSession session = request.getSession(false); // Use false to avoid creating a new session if it doesn't exist
	        String email=null;
	        if (session != null) {
	        	System.out.println("insideSession");
	             email = (String) session.getAttribute("email");
	           
	        }
		       if(email !=null) {
		    	   
		    	Order order=new Order();
		    	order.setProductName(productName);
		    	order.setProductPrice(productPrice);
		    	order.setProductBrand(productBrand);
		    	order.setProductRating(productRating);
		    	order.setProductDiscount(productDiscount);
		    	order.setPriceAfterDiscount(priceAfterDiscount);
		    	order.setBuyerName(buyerName);
		    	order.setMobileNumber(mobileNumber);
		    	order.setPincode(pincode);
		    	order.setAddress(address);
		    	order.setPaymentType(paymentType);
		    	order.setBuyerEmail(email);
		    	 BuyerServiceInterface buyerService=ShopMeServiceFactory.createOrderObject("Order");
	               int i=buyerService.orderProducts(order);
	               if(i>0) {
	            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/checkout.jsp");
						rd.forward(request, response); 
	               }else {
	            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/LoginFail.html");
						rd.forward(request, response); 
	               }
		       }
		       }
	}


