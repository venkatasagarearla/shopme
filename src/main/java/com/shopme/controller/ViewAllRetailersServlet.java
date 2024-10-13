package com.shopme.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopme.entity.Buyer;
import com.shopme.entity.Retailer;
import com.shopme.service.AdminServiceInterface;
import com.shopme.utility.ShopMeServiceFactory;

/**
 * Servlet implementation class ViewAllRetailersServlet
 */
@WebServlet("/viewallretailers")
public class ViewAllRetailersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			AdminServiceInterface adminServices=ShopMeServiceFactory.createRetailerTypeObject("Retailer");
            List<Retailer> retailers = adminServices.getAllreatilers();
            request.setAttribute("retailers",  retailers);
            request.getRequestDispatcher("/AllRetailers.jsp").forward(request, response);

          
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }
	}

}
