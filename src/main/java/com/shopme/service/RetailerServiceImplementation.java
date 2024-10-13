package com.shopme.service;

import java.util.ArrayList;
import java.util.List;

import com.shopme.dao.GlobalDaoInterface;
import com.shopme.dao.RetailerDaoInterface;
import com.shopme.entity.Order;
import com.shopme.entity.Product;
import com.shopme.entity.Retailer;
import com.shopme.utility.ShopMeDaoFactory;

public class RetailerServiceImplementation implements RetailerServiceInterface {

	@Override
	public int registerSeller() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int addProducts(Product product) {
//		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("buyer");
//		return gDao.BuyerRegistration(b);
		RetailerDaoInterface retailerDao=ShopMeDaoFactory.createRetailerObject("retailer");
		return retailerDao.addProductsDAO(product);
	}

	@Override
	public List<Product> placedOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String discounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> graphicalDashboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNotificationWhenUserSubmitsAReview() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> lowStockInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> getPendingRetailers() {
		 GlobalDaoInterface gDao = ShopMeDaoFactory.createObject("retailer");
		    return gDao.getRetailersByApprovalStatus(false);
	}

	@Override
	public List<Product> manageInventoryAndProductDetails() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Order> getOrdersByEmail(String email) {
		 RetailerDaoInterface rDao = ShopMeDaoFactory.createRetailerObject("retailer");
		 List<Order> order=rDao.getAllOrdersByEmail(email);
		 return order;
	}

	@Override
	public int updateProductDetailsAndDiscount(Product product) {
		 RetailerDaoInterface rDao = ShopMeDaoFactory.createRetailerObject("retailer");
		int i=rDao.updateProductDetailsAndDiscount(product);
		return i;
	}

}
