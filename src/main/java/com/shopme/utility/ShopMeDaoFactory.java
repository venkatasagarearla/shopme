package com.shopme.utility;

import com.shopme.dao.AdminDaoInterface;
import com.shopme.dao.AdminDaoInterfaceImplementation;
import com.shopme.dao.BuyerDaoInterface;
import com.shopme.dao.BuyerDaoInterfaceImplementation;
import com.shopme.dao.GlobalDaoInterface;
import com.shopme.dao.GlobalDaoInterfaceImplementation;
import com.shopme.dao.RetailerDaoInterface;
import com.shopme.dao.RetailerDaoInterfaceImplementation;

public class ShopMeDaoFactory {
	public static GlobalDaoInterface createObject(String daoType) {
		if(daoType.equals("global")) {
			return new GlobalDaoInterfaceImplementation ();
		}
		if(daoType.equals("buyer")) {
			return new GlobalDaoInterfaceImplementation ();
		}
		if(daoType.equals("retailer")) {
			return new GlobalDaoInterfaceImplementation ();
		}
		if(daoType.equals("admin")) {
			return new GlobalDaoInterfaceImplementation ();
		}
		return null;
	}
	public static RetailerDaoInterface createRetailerObject(String string) {
		return new RetailerDaoInterfaceImplementation();
	}

	public static BuyerDaoInterface createBuyerObject(String string) {
		return new  BuyerDaoInterfaceImplementation();
	}
	public static GlobalDaoInterface createCartObject(String string) {
		return new GlobalDaoInterfaceImplementation ();
	}
	public static BuyerDaoInterface createOrderObject(String string) {
		 return new BuyerDaoInterfaceImplementation();
	}
	public static AdminDaoInterface createAdminObject(String string) {
		
		return new AdminDaoInterfaceImplementation();
	}

	
	

}
