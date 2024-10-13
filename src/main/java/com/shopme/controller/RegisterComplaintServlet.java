package com.shopme.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopme.entity.Complaints;
import com.shopme.service.BuyerServiceInterface;

import com.shopme.utility.ShopMeServiceFactory;


@WebServlet("/registercomplaint")
public class RegisterComplaintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		private int orderId;
//		private String buyerName;
//		private String registerComplaint;
//		private boolean complaintStatus;
//	
		String buyerName=request.getParameter("buyerName");
		String registerComplaint=request.getParameter("registerComplaint");
		boolean complaintStatus=Boolean.parseBoolean(request.getParameter("complaintStatus"));
		String buyerEmail=request.getParameter("buyerEmail");
		int orderId=Integer.parseInt(request.getParameter("orderId"));
		 HttpSession session = request.getSession(false); // Use false to avoid creating a new session if it doesn't exist
	        String email=null;
	        if (session != null) {
	        	System.out.println("insideSession");
	             email = (String) session.getAttribute("email");
	             System.out.println(email);
	        }
		       if(email !=null) {
		    	  Complaints complaints=new Complaints();
		    	  complaints.setBuyerEmail(buyerEmail);
		    	  complaints.setBuyerName(buyerName);
		    	  complaints.setRegisterComplaint(registerComplaint);
		    	  complaints.setOrderId(orderId);
		    	  BuyerServiceInterface gservice=ShopMeServiceFactory.createComplaintObject("Complaints");
	               int i=gservice.registerComplaint(complaints);
	               if(i>0) {
	            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/MyOrders.jsp");
						rd.forward(request, response); 
	               }
		       }
		       else {
            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/LoginFail.html");
					rd.forward(request, response); 
               }
		       }
		
		
	}


