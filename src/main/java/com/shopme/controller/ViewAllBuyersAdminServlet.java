package com.shopme.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopme.entity.Buyer;
import com.shopme.entity.Product;
import com.shopme.service.AdminServiceInterface;
import com.shopme.service.BuyerServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

/**
 * Servlet implementation class ViewAllBuyersAdminServlet
 */
@WebServlet("/getAllBuyers")
public class ViewAllBuyersAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			AdminServiceInterface adminServices=ShopMeServiceFactory.createAdminObject("Admin");
//            List<Buyer> buyer = adminServices.getAllBuyers();
//            request.setAttribute("products", products);
//            System.out.println(products);
            List<Buyer> buyers = adminServices.getAllBuyers();
            request.setAttribute("buyers", buyers);
            request.getRequestDispatcher("/AllBuyers.jsp").forward(request, response);

          
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }
	}

}
