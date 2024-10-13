package com.shopme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.shopme.entity.Admin;
import com.shopme.entity.Buyer;
import com.shopme.entity.Cart;
import com.shopme.entity.Retailer;
import com.shopme.utility.DataBaseConnection;

public class GlobalDaoInterfaceImplementation implements GlobalDaoInterface {

	@Override
	public Buyer userSignIn(Buyer user) {
		// TODO Auto-generated method stub
		Buyer b=null;
		try {
			 Connection con=	DataBaseConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("select * from buyer where email=? and password=?");
			 ps.setString(1,user.getEmail() );
				ps.setString(2, user.getPassword());
				ResultSet i=ps.executeQuery();
				System.out.println("value of i is"+i);
				if(i.next()) {
					b=new Buyer();
					System.out.println("inside buyer is  "+b);
					b.setUserType(i.getString("userType"));
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public int BuyerRegistration(Buyer b) {
		// TODO Auto-generated method stub
		Buyer b1=null;
		int i=0;
		try {
			 Connection con=	DataBaseConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("insert into buyer values(?,?,?,?,?,?,?)");
			
//			 private String name;
//				private String email;
//				private String password;
//				private int age;
//				private String contactno;
//				private String city;
//				private String userType;
			 
			 
			 
			 ps.setString(1, b.getName());
			 
			 ps.setString(2, b.getEmail());
			 ps.setString(3, b.getPassword());
			 ps.setInt(4, b.getAge());
			 ps.setString(5, b.getContactno());
			 ps.setString(6, b.getCity());
			 ps.setString(7, b.getUserType());
			 i=ps.executeUpdate();
			
				}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

	@Override
	public int retailerRegistration(Retailer retailer) {
		// TODO Auto-generated method stub
				Retailer retailer1=null;
				int i=0;
				try {
					 Connection con=	DataBaseConnection.getConnection();
					 PreparedStatement ps=con.prepareStatement("INSERT INTO Retailer (ownerName, email, password, phoneNumber, shopName, shopAddress, productName,userType,approved) values(?,?,?,?,?,?,?,?,?)");
					
//					 private String name;
//						private String email;
//						private String password;
//						private int age;
//						private String contactno;
//						private String city;
//						private String userType;
					 
					 
					 
					 ps.setString(1,retailer.getOwnerName() );
					 
					 ps.setString(2, retailer.getEmail());
					 ps.setString(3,retailer.getPassword() );
					 ps.setString(4, retailer.getPhoneNumber());
					 ps.setString(5, retailer.getShopName());
					 ps.setString(6, retailer.getShopAdress());
					 ps.setString(7, retailer.getProductName());
					 ps.setString(8, retailer.getUserType());
					 ps.setBoolean(9, false);// set approved to false intially
					 i=ps.executeUpdate();
					
						}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				return i;
	}

	@Override
	public List<Retailer> getRetailersByApprovalStatus(boolean b) {
		 List<Retailer> retailers = new ArrayList<>();
		try {
	        Connection con = DataBaseConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM Retailer WHERE approved = ?");
	        ps.setBoolean(1, b);
	        ResultSet rs = ps.executeQuery();
	       
	        while (rs.next()) {
	            Retailer retailer = new Retailer();
	            retailer.setShopId(rs.getInt("shopId"));
	            retailer.setOwnerName(rs.getString("ownerName"));
	            retailer.setEmail(rs.getString("email"));
	            retailer.setPhoneNumber(rs.getString("phoneNumber"));
	            retailer.setShopName(rs.getString("shopName"));
	            retailer.setShopAdress(rs.getString("shopAddress"));
	            retailer.setUserType(rs.getString("userType"));
	            retailer.setApproved(rs.getBoolean("approved"));
	            retailers.add(retailer);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return retailers;
	}

	@Override
	public int approveRetailer(int shopId) {
		 int i = 0;
		    try {
		        Connection con = DataBaseConnection.getConnection();
		        PreparedStatement ps = con.prepareStatement("UPDATE Retailer SET approved = TRUE WHERE shopId = ?");
		        ps.setInt(1, shopId);
		        i = ps.executeUpdate();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return i;
	}

	@Override
	public int adminRegistration(Admin admin) {
		int i=0;
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Admin(name, passWord, email) VALUES (?,?,?)");
			ps.setString(1, admin.getName());	
			ps.setString(2, admin.getPassWord());
			ps.setString(3,admin.getEmail());
            i=ps.executeUpdate();
          
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int addProductsTo(Cart cart) {
//		  cart.setProductID(productId);
//          cart.setProductName(productName);
//          cart.setProductPrice(productPrice);
//          cart.setProductDescription(productDescription);
//          cart.setProductBrand(productBrand);
//          cart.setProductRating(productRating);
//          cart.setProductDiscount(productDiscount);
//          cart.setQuantity(1); // Default quantity is 1
		int i=0;
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into cart (cart_id,email,quantity,ProductName,ProductPrice,ProductDescription,ProductBrand,ProductRating,ProductDiscount,productImagePath) values(?,?,?,?,?,?,?,?,?,?) ");
			System.out.println(cart.getEmail());
			ps.setInt(1, cart.getCartId());
			ps.setString(2, cart.getEmail());
//			ps.setInt(3, cart.getProductID());
			ps.setInt(3, cart.getQuantity());
			ps.setString(4, cart.getProductName());
			ps.setDouble(5, cart.getProductPrice());
			ps.setString(6, cart.getProductDescription());
			ps.setString(7, cart.getProductBrand());
			ps.setDouble(8, cart.getProductRating());
		    System.out.println("discount inside the dao+"+cart.getProductDiscount());
			ps.setDouble(9, cart.getProductDiscount());
			ps.setString(10, cart.getProductImagePath());
			i=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Admin adminLogin(Admin admin) {
		Admin ad=null;
		try {
			 Connection con=	DataBaseConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("select * from admin where email=? and passWord=?");
			 ps.setString(1,admin.getEmail() );
				ps.setString(2, admin.getPassWord());
				ResultSet i=ps.executeQuery();
				System.out.println("value of i is"+i);
				if(i.next()) {
					ad=new Admin();
					System.out.println("inside admin is  "+ad);
					ad.setUserType(i.getString("userType"));
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ad;
	}

	@Override
	public Retailer retailerLogin(Retailer retailer) {
		Retailer rt=null;
		try {
			 Connection con=	DataBaseConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement("select * from retailer where email=? and password=?");
			 ps.setString(1,retailer.getEmail() );
				ps.setString(2, retailer.getPassword());
				ResultSet i=ps.executeQuery();
				System.out.println("value of i is"+i);
				if(i.next()) {
					rt=new Retailer();
					System.out.println("inside admin is  "+rt);
					rt.setUserType(i.getString("userType"));
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rt;
	}
}
