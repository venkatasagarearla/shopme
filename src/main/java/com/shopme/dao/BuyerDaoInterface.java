package com.shopme.dao;

import java.util.List;

import com.shopme.entity.Bill;
import com.shopme.entity.Cart;
import com.shopme.entity.Complaints;
import com.shopme.entity.Order;
import com.shopme.entity.OrderDetails;
import com.shopme.entity.Product;
import com.shopme.entity.RateReview;

public interface BuyerDaoInterface {
    //1
	Product viewProductDetailsDAO();
	List<Product> browseProductsByCategoryDAO();
	//2
	String addProductsToCartDAO();//done
	//3
	String removeProductsToCartDAO();
	//4
	Bill checkoutDAO();
	String getEmailNotificationsDAO();
	//5
	List<Order> viewOrderHistoryDAO();
	RateReview rateAndReviewProductsDAO();
	String complaintAgainstTheSellerDAO();
	String returnADefectiveProductDAO();
	String saveProductAsFavoriteDAO();
	OrderDetails generateInvoiceDAO();
	String makeaymentUsingThePaymentGatewayDAO();
	//done
	List<Product> getAllProducts();
	//done
	List<Cart> getCartProducts(String email);
	//done
	int orderProducts(Order order);
	//done
	List<Order> getAllOrdersByEmail(String email);
	//done
	int registerComplaint(Complaints complaints);
}
