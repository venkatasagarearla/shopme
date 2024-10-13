package com.shopme.dao;

import java.util.List;

import com.shopme.entity.Admin;
import com.shopme.entity.Buyer;
import com.shopme.entity.Cart;
import com.shopme.entity.Retailer;

public interface GlobalDaoInterface {

	Buyer userSignIn(Buyer user);

	int  BuyerRegistration(Buyer b);

	

	int retailerRegistration(Retailer retailer);

	List<Retailer> getRetailersByApprovalStatus(boolean b);

	int approveRetailer(int shopId);

	int adminRegistration(Admin admin);

	int addProductsTo(Cart cart);

	Admin adminLogin(Admin admin);

	Retailer retailerLogin(Retailer retailer);

	

	



}	
