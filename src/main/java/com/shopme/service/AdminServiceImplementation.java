package com.shopme.service;

import java.util.List;

import com.shopme.dao.BuyerDaoInterface;
import com.shopme.entity.Buyer;
import com.shopme.entity.Complains;
import com.shopme.entity.Order;
import com.shopme.entity.Retailer;
import com.shopme.utility.ShopMeDaoFactory;
import com.shopme.dao.*;
public class AdminServiceImplementation implements AdminServiceInterface {

	@Override
	public List<Buyer> ViewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> viewAllretailers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> manageUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> manageRetailers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complains> viewComplaints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> viewAllTheRegistrationRequestsSubmittedByTheSellers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> getAllBuyers() {
		AdminDaoInterface adminDao=ShopMeDaoFactory.createAdminObject("Admin");
		 List<Buyer> buyer=adminDao.getAllBuyers();
		 return buyer;
		
		
	}

	@Override
	public List<Retailer> getAllreatilers() {
		AdminDaoInterface adminDao=ShopMeDaoFactory.createAdminObject("Admin");
		 List<Retailer> retailers=adminDao.getAllreatilers();
		 System.out.println(retailers);
		 return retailers;
	
	}

}
