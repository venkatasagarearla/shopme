package com.shopme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.shopme.entity.Order;
import com.shopme.entity.Product;
import com.shopme.utility.DataBaseConnection;

public class RetailerDaoInterfaceImplementation implements RetailerDaoInterface {

	@Override
	public int registerSeller() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> manageInventoryAndProductDetailsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addProductsDAO(Product product) {
		
		int i=0;
		
	
		try {
			 Connection con=	DataBaseConnection.getConnection();
			 PreparedStatement ps=con.prepareStatement
					 ("insert into Product (product_name, price, description, brand, rating, image_path, shopId,countOfProducts,discount) values (?,?,?,?,?,?,?,?,?)");	
			 System.out.println(product.getDiscount());
			 ps.setString(1, product.getProductName());
			 ps.setDouble(2, product.getPrice());
			 ps.setString(3,product.getDescription());
			 ps.setString(4, product.getBrand());
			 ps.setDouble(5, product.getRating());
			 ps.setString(6, product.getImagePath());
			 ps.setInt(7, product.getShopId());
			 ps.setInt(8,   product.getCountOfProducts());
			 ps.setDouble(9, product.getDiscount());
			 
			 i=ps.executeUpdate();
			 
	}catch(Exception e) {
		e.printStackTrace();
	}
		return i;
	}

	@Override
	public List<Product> placedOrdersDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String discountsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> graphicalDashboardDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNotificationWhenUserSubmitsAReviewDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> lowStockInventoryDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrdersByEmail(String email) {
	List<Order> allorders=new ArrayList<>();
	
	try {
		Connection con=DataBaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("Select * from orders");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Order order=new Order();
			order.setOrderId(rs.getInt(1));
			order.setProductName(rs.getString(2));
			order.setProductPrice(rs.getDouble(3));
			order.setProductBrand(rs.getString(4));
			order.setProductRating(rs.getDouble(5));
			order.setProductDiscount(rs.getDouble(6));
			order.setPriceAfterDiscount(rs.getDouble(7));
			order.setBuyerName(rs.getString(8));
			order.setMobileNumber(rs.getString(9));
			order.setPincode(rs.getInt(10));
			order.setAddress(rs.getString(11));
			order.setPaymentType(rs.getString(12));
			order.setBuyerEmail(rs.getString(13));
			Timestamp timestamp = rs.getTimestamp(14);
			order.setDateTime(timestamp.toLocalDateTime());
			allorders.add(order);
			
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return allorders;
	}

	@Override
	public int updateProductDetailsAndDiscount(Product product) {
		int i=0;
		try {
		Connection con=DataBaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE product SET price = ?, discount = ? WHERE product_id = ?");
			ps.setDouble(1, product.getPrice());	
			ps.setDouble(2, product.getDiscount());
			ps.setInt(3,product.getProductId());
			i=ps.executeUpdate();
			
				
		}catch(Exception e) {
		e.printStackTrace();	
		}
		return i;
	}
      
	
}
