package com.shopme.service;

import java.util.List;

import com.shopme.dao.BuyerDaoInterface;
import com.shopme.dao.GlobalDaoInterface;
import com.shopme.entity.Bill;
import com.shopme.entity.Cart;
import com.shopme.entity.Complaints;
import com.shopme.entity.Order;
import com.shopme.entity.OrderDetails;
import com.shopme.entity.Product;
import com.shopme.entity.RateReview;
import com.shopme.utility.ShopMeDaoFactory;
import java.util.*;
public class BuyerServiceImplementation implements BuyerServiceInterface {

	@Override
	public Product viewProductDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> browseProductsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addProductsToCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProductsToCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill checkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmailNotifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewOrderHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RateReview rateAndReviewProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String complaintAgainstTheSeller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String returnADefectiveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveProductAsFavorite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails generateInvoice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeaymentUsingThePaymentGateway() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
//		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("global");
		BuyerDaoInterface buyerDao=ShopMeDaoFactory.createBuyerObject("Buyer");
		List<Product> products=buyerDao.getAllProducts();
		return products ;
	
		
	}

	@Override
	public List<Cart> getCartItems(String email) {
		BuyerDaoInterface buyerDao=ShopMeDaoFactory.createBuyerObject("Buyer");
		List<Cart> cartproducts=buyerDao.getCartProducts(email);
		return cartproducts ;
	}

	@Override
	public int orderProducts(Order order) {
		BuyerDaoInterface buyerDao=ShopMeDaoFactory.createOrderObject("Order");
		int i=buyerDao.orderProducts(order);
		return i;
	}

	@Override
	public List<Order> getAllOrdersByEmail(String email) {
		BuyerDaoInterface buyerDao=ShopMeDaoFactory.createOrderObject("Order");
		 List<Order> orders=buyerDao.getAllOrdersByEmail(email);
		 System.out.println(orders.size());
		return orders;
	}

	@Override
	public int registerComplaint(Complaints complaints) {
		BuyerDaoInterface buyerDao=ShopMeDaoFactory.createOrderObject("Complaints");
		int i=buyerDao.registerComplaint(complaints);
		return i;
	}

}
