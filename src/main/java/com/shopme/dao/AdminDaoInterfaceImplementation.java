package com.shopme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.shopme.entity.Buyer;
import com.shopme.entity.Complains;
import com.shopme.entity.Retailer;
import com.shopme.utility.DataBaseConnection;

public class AdminDaoInterfaceImplementation implements AdminDaoInterface {

	@Override
	public List<Buyer> ViewAllUsersDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> viewAllretailersDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> manageUsersDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> manageRetailersDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> viewAllTheRegistrationRequestsSubmittedByTheSellersDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complains> viewComplaintsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buyer> getAllBuyers() {
		List<Buyer> buyer=new ArrayList<>();
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from Buyer");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Buyer b=new Buyer();
				b.setName(rs.getString(1));
				b.setEmail(rs.getString(2));
				b.setPassword(rs.getString(3));
				b.setAge(rs.getInt(4));
				b.setContactno(rs.getString(5));
				b.setCity(rs.getString(6));
				b.setUserType(rs.getString(7));
				buyer.add(b);
			}	
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return buyer;
	}

	@Override
	public List<Retailer> getAllreatilers() {
		List<Retailer> retailers=new ArrayList<>();
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from retailer");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Retailer rt=new Retailer();
				rt.setShopId(rs.getInt(1));
				rt.setOwnerName(rs.getString(2));
				rt.setEmail(rs.getString(3));
				rt.setPassword(rs.getString(4));
				rt.setPhoneNumber(rs.getString(5));
				rt.setShopName(rs.getString(6));
				rt.setShopAdress(rs.getString(7));
				rt.setProductName(rs.getString(8));
				rt.setUserType(rs.getString(9));
				rt.setApproved(rs.getBoolean(10));
				retailers.add(rt);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		retailers.size();
		return retailers;
	}
}
