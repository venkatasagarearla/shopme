package com.shopme.dao;

import java.util.List;

import com.shopme.entity.Buyer;
import com.shopme.entity.Complains;
import com.shopme.entity.Retailer;

public interface AdminDaoInterface {
	List<Buyer> ViewAllUsersDAO();
	List<Retailer> viewAllretailersDAO();
	List<Buyer> manageUsersDAO();
	List<Retailer> manageRetailersDAO();
	List<Complains> viewComplaintsDAO();
	List<Retailer> viewAllTheRegistrationRequestsSubmittedByTheSellersDAO();
	//done
	List<Buyer> getAllBuyers();
	//done
	List<Retailer> getAllreatilers();
}
