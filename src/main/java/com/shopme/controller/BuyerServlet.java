package com.shopme.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.shopme.entity.Buyer;
import com.shopme.entity.Product;
import com.shopme.service.BuyerServiceInterface;
import com.shopme.service.GlobalServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;



public class BuyerServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskType = request.getParameter("taskType");
		System.out.println("byer servlet");
         
		if (taskType.equals("Register")) {
			

			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			String adress=request.getParameter("city");
			String userType=request.getParameter("userType");
			String contactno=request.getParameter("contactno");
			String ag=request.getParameter("age");
		      int age = Integer.parseInt(ag);
			
			response.setContentType("text/html");
			
			Buyer b=new Buyer();
			b.setAge(age);
			b.setPassword(password);
			b.setCity(adress);
			b.setContactno(contactno);
			b.setEmail(email);
			b.setName(name);
			b.setUserType(userType);
//			LapTopUser lUser=new LapTopUser();
//			lUser.setEmail(email);
//			lUser.setAddress(adress);
//			lUser.setName(name);
//			lUser.setPassword(password);
//			
//			LapTopUserSerViceInterface lapService=LapTopServiceFactory.createObject();
//			int i=lapService.createProfile(lUser);
			GlobalServiceInterface gService = ShopMeServiceFactory.createObject("buyer");
		     int i= gService.buyerRegister(b);
		     System.out.println(i);
			if(i>0) {
					RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
					rd.forward(request, response);
			}else {
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/loginfail.jsp");
				rd.forward(request, response);
			}
			

		}
		
		if (taskType.equals("getAllPoducts")) {
			System.out.println(taskType);
			try {
				BuyerServiceInterface buyerService=ShopMeServiceFactory.createBuyerObject("buyer");
			
	            List<Product> products = buyerService.getAllProducts();
	            request.setAttribute("products", products);
	            System.out.println(products);
	            System.out.println("coming inside get all products");
	            request.getRequestDispatcher("/AllProducts.jsp").forward(request, response);
	        } catch (Exception e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
	        }
	}

}
}
