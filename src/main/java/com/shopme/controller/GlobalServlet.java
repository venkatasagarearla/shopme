package com.shopme.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopme.entity.Admin;
import com.shopme.entity.Buyer;
import com.shopme.entity.Retailer;
import com.shopme.exception.*;
import com.shopme.service.GlobalServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;


public class GlobalServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskType = request.getParameter("taskType");
		if (taskType.equals("login")) {
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		Buyer user = new Buyer();
		user.setEmail(email);
		user.setPassword(password);
		GlobalServiceInterface gService = ShopMeServiceFactory.createObject("global");//1
		Buyer b = gService.signinService(user);
		System.out.println("heloo+++++++++++++++++++++++++++++++++");
		System.out.println(b);
		try {
			if(b!=null) {
				HttpSession session=request.getSession(true);
				session.setAttribute("email", email);
			}
			if (b.getUserType().equals("buyer")) {
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/buyerHomepage.jsp");
				rd.forward(request, response);
			}
			
		}catch(Exception e) {
			throw new UserNotFoundException();
		}
		
//		if (b.getUserType().equals("admin")) {
//			RequestDispatcher rd=getServletContext().getRequestDispatcher("/adminHomepage.jsp");
//			rd.forward(request, response);
//		}
//		if (b.getUserType().equals("retailer")) {
//			RequestDispatcher rd=getServletContext().getRequestDispatcher("/retailerHomepage.jsp");
//			rd.forward(request, response);
//		}
		
	}
		
		if(taskType.equals("RetailerRequest")) {
			 int shopId = Integer.parseInt(request.getParameter("shopId"));   
		        GlobalServiceInterface gService = ShopMeServiceFactory.createObject("retailer");
		        boolean isApproved = gService.approveRetailer(shopId);
		        if (isApproved) {
		            request.setAttribute("message", "Retailer approved successfully.");
		        } else {
		            request.setAttribute("message", "Failed to approve retailer.");
		        }  
		        // Redirect back to the pending retailers page
		        request.getRequestDispatcher("/RetailerApproval.jsp").forward(request, response);   
		}
		
		
		if (taskType.equals("adminlogin")) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Admin admin=new Admin();
		admin.setEmail(email);
		admin.setPassWord(password);
		GlobalServiceInterface gService = ShopMeServiceFactory.createObject("global");
		Admin ad=gService.adminLogin(admin);
		
		if(ad!=null) {
			HttpSession session=request.getSession(true);
			session.setAttribute("email", email);
		
		if (ad.getUserType().equals("admin")) { 
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/adminHomepage.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/AdminLogin.jsp");
			rd.forward(request, response);
		}
		}
		
}
		if (taskType.equals("retailerlogin")) {
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			Retailer retailer=new Retailer();
			retailer.setEmail(email);
			retailer.setPassword(password);
			GlobalServiceInterface gService = ShopMeServiceFactory.createObject("global");
			Retailer rt=gService.retailerLogin(retailer);
			System.out.println(rt);
			if(rt!=null) {
				
				HttpSession session=request.getSession(true);
				session.setAttribute("email", email);
			
			if (rt.getUserType().equals("retailer")) { 
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/RetailerHome.jsp");
				rd.forward(request, response);
				System.out.println("hello");
			}
			else {
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/RetailerLogin.jsp");
				rd.forward(request, response);
			}
			}
			
	}   if (taskType.equals("retailerlogout")){
		 HttpSession session = request.getSession(false); // Get the existing session, don't create a new one
	        if (session != null) {
	            session.invalidate(); // Invalidate the session
	        }
	        
	        // Redirect to the login page or home page after logout
	        response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
	
	
	if (taskType.equals("adminlogout")){
		 HttpSession session = request.getSession(false); // Get the existing session, don't create a new one
	        if (session != null) {
	            session.invalidate(); // Invalidate the session
	        }
	        
	        // Redirect to the login page or home page after logout
	        response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
	if (taskType.equals("buyerlogout")){
		 HttpSession session = request.getSession(false); // Get the existing session, don't create a new one
	        if (session != null) {
	            session.invalidate(); // Invalidate the session
	        }
	        
	        // Redirect to the login page or home page after logout
	        response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
		
		else { 
			System.out.println("heloooo task is null");
		}
		
	}
}
