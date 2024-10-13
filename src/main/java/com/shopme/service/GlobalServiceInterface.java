package com.shopme.service;

import java.util.List;

import com.shopme.entity.Admin;
import com.shopme.entity.Buyer;
import com.shopme.entity.Cart;
import com.shopme.entity.Retailer;

public interface GlobalServiceInterface {

	Buyer signinService(Buyer user);

	 int buyerRegister(Buyer b);
	
	List<Retailer> getPendingRetailers();
	int retailerRegister(Retailer retailer);

	boolean approveRetailer(int shopId);

	int adminRegister(Admin admin);

	int addProductsToCart(Cart cart);

	Admin adminLogin(Admin admin);

	Retailer retailerLogin(Retailer retailer);
	

}
