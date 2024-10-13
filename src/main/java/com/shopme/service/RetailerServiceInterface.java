package com.shopme.service;

import java.util.List;

import com.shopme.entity.Order;
import com.shopme.entity.Product;
import com.shopme.entity.Retailer;

public interface RetailerServiceInterface {
	public List<Retailer> getPendingRetailers();
	int registerSeller();
	//• ReceiveAnEmailRegardingRegistrationStatus();
	 List<Product> manageInventoryAndProductDetails();
	int addProducts(Product product);
	 List<Product> placedOrders();
	//• Receive email notifications when a user places an order.
	String discounts();
	List<Product> graphicalDashboard();
	String getNotificationWhenUserSubmitsAReview();
	List<Product> lowStockInventory();
	//done
	public List<Order> getOrdersByEmail(String email);
	//done
	public int updateProductDetailsAndDiscount(Product product);
}
