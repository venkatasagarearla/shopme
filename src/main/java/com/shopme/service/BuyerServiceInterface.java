package com.shopme.service;

import java.util.List;

import com.shopme.entity.Bill;
import com.shopme.entity.Cart;
import com.shopme.entity.Complaints;
import com.shopme.entity.Order;
import com.shopme.entity.OrderDetails;
import com.shopme.entity.Product;
import com.shopme.entity.RateReview;

public interface BuyerServiceInterface {
	Product viewProductDetails();
	List<Product> browseProductsByCategory();
	//done
	String addProductsToCart();
	String removeProductsToCart();
	Bill checkout();
	String getEmailNotifications();
	List<Order> viewOrderHistory();
	RateReview rateAndReviewProducts();
	String complaintAgainstTheSeller();
	String returnADefectiveProduct();
	String saveProductAsFavorite();
	OrderDetails generateInvoice();
	String makeaymentUsingThePaymentGateway();
	//done
	List<Product> getAllProducts();
	//done
	List<Cart> getCartItems(String email);
	//done
	int orderProducts(Order order);
	//done
	List<Order> getAllOrdersByEmail(String email);
	//done
	int registerComplaint(Complaints complaints);

}
