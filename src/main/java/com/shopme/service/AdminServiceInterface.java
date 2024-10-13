package com.shopme.service;

import java.util.List;

import com.shopme.entity.Buyer;
import com.shopme.entity.Complains;
import com.shopme.entity.Retailer;

public interface AdminServiceInterface {
	List<Buyer> ViewAllUsers();
	List<Retailer> viewAllretailers();
	List<Buyer> manageUsers();
	List<Retailer> manageRetailers();
	List<Complains> viewComplaints();
	List<Retailer> viewAllTheRegistrationRequestsSubmittedByTheSellers();
	//done
	List<Buyer> getAllBuyers();
	//done
	List<Retailer> getAllreatilers();
}
