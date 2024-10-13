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
import com.shopme.entity.Product;
import com.shopme.service.RetailerServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

@WebServlet("/manageProductsandupdates")
public class ManageProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false); // Use false to avoid creating a new session
		System.out.println("ManageProductServlet");
		int productId=Integer.parseInt(request.getParameter("productid"));
		Double productPrice=Double.parseDouble(request.getParameter("productPrice"));
		Double productDiscount=Double.parseDouble(request.getParameter("productDiscount"));
		int productQunatity=Integer.parseInt(request.getParameter("productQunatity"));
		System.out.println(productPrice);
		System.out.println(productDiscount);
		System.out.println(productQunatity);
		
        if (session != null) {
            String email = (String) session.getAttribute("email");
            System.out.println(email);
            if (email != null) {
                // Use the email as needed
                session.setAttribute("email", email);
                System.out.println("inside the  ");
                Product product=new Product();
                product.setProductId(productId);
                product.setCountOfProducts(productQunatity);
                product.setDiscount(productDiscount);
                product.setPrice(productPrice);
               RetailerServiceInterface rService=ShopMeServiceFactory.createRetailerObject("RetailerHome.jsp");
               int i=rService.updateProductDetailsAndDiscount(product);
               System.out.println(i);
               if(i>0) {
            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/Retailer.jsp");
					rd.forward(request, response); 
               }else {
            	   RequestDispatcher rd=getServletContext().getRequestDispatcher("/RetailerLogin.html");
					rd.forward(request, response); 
               }            
	}
            else {
            	 RequestDispatcher rd=getServletContext().getRequestDispatcher("/RetailerLogin.html");
					rd.forward(request, response); 
            }
            	
            	
        }
}
}
