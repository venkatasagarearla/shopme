package com.shopme.utility;


import com.shopme.service.AdminServiceImplementation;
import com.shopme.service.AdminServiceInterface;
import com.shopme.service.BuyerServiceImplementation;
import com.shopme.service.BuyerServiceInterface;
import com.shopme.service.GlobalServiceInterface;
import com.shopme.service.GlobalServiceInterfaceImplementation;
import com.shopme.service.RetailerServiceImplementation;
import com.shopme.service.RetailerServiceInterface;

public class ShopMeServiceFactory {

	public static GlobalServiceInterface createObject(String serviceType) {
		if(serviceType.equals("global")) {
			return new GlobalServiceInterfaceImplementation();
		}
		if(serviceType.equals("buyer")) {
			return new GlobalServiceInterfaceImplementation();
		}
		if(serviceType.equals("retailer")) {
			return new GlobalServiceInterfaceImplementation();
		}
		if(serviceType.equals("admin")) {
			return new GlobalServiceInterfaceImplementation();
		}
		return null;
	}
	
	public static  RetailerServiceInterface createRetailerObject(String retailer) {
	if(retailer.equals("retailer")) {	
		return new RetailerServiceImplementation();
	}
	return null;
	}

	public static BuyerServiceInterface createBuyerObject(String buyer) {
		if(buyer.equals("buyer")) {	
			return new BuyerServiceImplementation();
		}
		return null;
	}

	public static GlobalServiceInterface createCartObject(String cart) {
		if(cart.equals("cart")) {	
			return new GlobalServiceInterfaceImplementation();
		}
		return null;
		
	}

	public static BuyerServiceInterface createOrderObject(String order) {
		if(order.equals("Order")) {	
			return new BuyerServiceImplementation();
		}
		return null;
	}

	public static BuyerServiceInterface createComplaintObject(String complaints) {
		// TODO Auto-generated method stub
		if(complaints.equals("Complaints")) {	
			return new BuyerServiceImplementation();
		}
		return null;
	}

	public static AdminServiceInterface createAdminObject(String string) {
		if(string.equals("Admin")) {	
			return new AdminServiceImplementation();
		}
		return null;
	}
	

	public static AdminServiceInterface createRetailerTypeObject(String retailer) {
		if(retailer.equals("Retailer")) {	
			return new AdminServiceImplementation();
		}
		return null;
	}
	

	
}

