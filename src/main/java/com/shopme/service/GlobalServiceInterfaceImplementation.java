package com.shopme.service;

import java.util.List;

import com.shopme.dao.GlobalDaoInterface;
import com.shopme.entity.Admin;
import com.shopme.entity.Buyer;
import com.shopme.entity.Cart;
import com.shopme.entity.Retailer;
import com.shopme.utility.ShopMeDaoFactory;

public class GlobalServiceInterfaceImplementation implements GlobalServiceInterface {

	@Override
	public Buyer signinService(Buyer user) {
	
		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("global");
		return gDao.userSignIn(user);
	}

	@Override
	public int buyerRegister(Buyer b) {
		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("buyer");
		return gDao.BuyerRegistration(b);
	}

	@Override
	public int retailerRegister(Retailer retailer) {
		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("retailer");
		return gDao.retailerRegistration(retailer);
	}

	@Override 
	public List<Retailer> getPendingRetailers() {
		 GlobalDaoInterface gDao = ShopMeDaoFactory.createObject("retailer");
		    return gDao.getRetailersByApprovalStatus(false);
	}

	@Override
	public boolean approveRetailer(int shopId) {
		  GlobalDaoInterface gDao = ShopMeDaoFactory.createObject("retailer");
		    int result = gDao.approveRetailer(shopId);
		    return result >0;
		
	}

	@Override
	public int adminRegister(Admin admin) {
		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("retailer");
		return gDao.adminRegistration(admin);
		
	}

	@Override
	public int addProductsToCart(Cart cart) {
		GlobalDaoInterface gDao=ShopMeDaoFactory.createCartObject("cart");
		return gDao.addProductsTo(cart);
		
	}

	@Override
	public Admin adminLogin(Admin admin) {
		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("global");
		return gDao.adminLogin(admin);
	}

	@Override
	public Retailer retailerLogin(Retailer retailer) {
		GlobalDaoInterface gDao=ShopMeDaoFactory.createObject("retailer");
		return gDao.retailerLogin(retailer);
		
	}

	

}
