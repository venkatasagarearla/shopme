package com.shopme.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopme.service.GlobalServiceInterface;
import com.shopme.service.RetailerServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

import com.shopme.entity.*;
public class RetailerServlet extends HttpServlet {
	


	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskType = request.getParameter("taskType");
        System.out.println("coming ");
		if (taskType.equals("Register")) {
			Retailer retailer=new Retailer();
//		String shop=request.getParameter("shopId");
		String ownerName=request.getParameter("ownerName");
	
		String  email=request.getParameter("email");
		String  password=request.getParameter("password");
		String  phoneNumber=request.getParameter("phoneNumber");
		String  shopAdress=request.getParameter("shopAdress");
		String userType=request.getParameter("userType");
		retailer.setEmail(email);
		retailer.setOwnerName(ownerName);
		retailer.setPassword(password);
		retailer.setPhoneNumber(phoneNumber);
		retailer.setShopAdress(shopAdress);
		retailer.setUserType(userType);
		retailer.setApproved(false);
		
		GlobalServiceInterface gService = ShopMeServiceFactory.createObject("retailer");
	     int i= gService.retailerRegister(retailer);
	     System.out.println(i);
		if(i>0) {
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
				rd.forward(request, response);
		}else {
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/loginfail.jsp");
			rd.forward(request, response);
		}
		
		}
		
		
        System.out.println("coming ");
		if (taskType.equals("addProducts")) {

//			    private String productName;
//			    private double price;
//			    private String description;
//			    private String brand;
//			    private String rating;
//			    private int countOfProducts;
//			    private double discount;
//			    private String path;
//			
			
			String productName=request.getParameter("productName");
			//double
			String price=request.getParameter("price");
			
			String description=request.getParameter("description");
			String brand=request.getParameter("brand");
			//double
			String  rating=request.getParameter("rating");
			//int 
			String countOfProducts=request.getParameter("countOfProducts");
			//double
			 String discount=request.getParameter("discount");
			 System.out.println("discount of the product inside the servlet is  "+ discount);
			 
			 String path=request.getParameter("path");
			 
			 String shopId=request.getParameter("shopId");
				
			 int retailerId=Integer.parseInt(shopId);
			 
			     int noOfProducts=Integer.parseInt(countOfProducts);
				 double productDiscount=Double.parseDouble(discount);
				 System.out.println("after converting from string to double"+productDiscount);
				 double productPrice=Double.parseDouble(price);
				 double productRating=Double.parseDouble(rating);
				System.out.println(productDiscount);
				
//				    private double price;
//				    private String description;
//				    private String brand;
//				    private String rating;
//				    private int countOfProducts;
//				    private double discount;
//				    private String path;
			
			 
			 
			 Product product=new Product();
			 product.setBrand(brand);
			 product.setCountOfProducts(noOfProducts);
			 product.setDescription(description);
			 product.setDiscount(productDiscount);
			 product.setPrice(productPrice);
			 product.setRating(productRating);
			 product.setProductName(productName);
			 product.setImagePath(path);
			 product.setShopId(retailerId);
			//factory design pattern reduces the tight coupling this means that changes to the creation logic don’t affect the code that depends on the created objects. 
			RetailerServiceInterface gService = ShopMeServiceFactory.createRetailerObject("retailer");
		     int i= gService.addProducts(product);
		     System.out.println("products are Inserting into table");
		     if(i>0) {
		    	// RequestDispatcher is an interface in the Java Servlet API that provides the mechanism to forward a
		    	 //client request from a servlet to another web resource (such as a servlet, JSP, or HTML file) on the server.
		    	 //getServletContext() returns the object of the ServletContext  .provides the a set of methods used to communicate with servlet container 
		    	// getRequestDispatcher(String path): This method of ServletContext returns a RequestDispatcher object that forwrads the request to the another resource on the server url doesnt change 
					RequestDispatcher rd=getServletContext().getRequestDispatcher("/AddProducts.jsp");
					rd.forward(request, response);
					//forward(request, response): This method is called on the RequestDispatcher object (rd in this case).
					//It forwards the request and response objects to the resource specified by the RequestDispatcher.
			}else {
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/loginfail.jsp");
				rd.forward(request, response);
			}
			
		
		}
		
	}

}
