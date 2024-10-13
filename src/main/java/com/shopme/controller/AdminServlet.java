package com.shopme.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopme.entity.Admin;
import com.shopme.service.GlobalServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;


 
public class AdminServlet extends HttpServlet {
	


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskType = request.getParameter("taskType");
        System.out.println("Inside admin servlet     +++++++++++++++++++");
		if (taskType.equals("Register")) {
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			Admin admin=new Admin();
			admin.setEmail(email);
			admin.setPassWord(password);
			admin.setName(name);
			
			GlobalServiceInterface gService = ShopMeServiceFactory.createObject("admin");
			 int i= gService.adminRegister(admin);
		     System.out.println(i);
			if(i>0) {
					RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
					rd.forward(request, response);
			}else {
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/loginfail.jsp");
				rd.forward(request, response);
			}
		}
		
	}

}
