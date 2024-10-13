package com.shopme.dao;

import java.util.List;

import com.shopme.entity.Order;
import com.shopme.entity.Product;

public interface RetailerDaoInterface {
	int registerSeller();
	//• ReceiveAnEmailRegardingRegistrationStatus();
	 List<Product> manageInventoryAndProductDetailsDAO();
	int addProductsDAO(Product product);
	 List<Product> placedOrdersDAO();
	//• Receive email notifications when a user places an order.
	String discountsDAO();
	List<Product> graphicalDashboardDAO();
	String getNotificationWhenUserSubmitsAReviewDAO();
	List<Product> lowStockInventoryDAO();
	List<Order> getAllOrdersByEmail(String email);
	int updateProductDetailsAndDiscount(Product product);
	
}
