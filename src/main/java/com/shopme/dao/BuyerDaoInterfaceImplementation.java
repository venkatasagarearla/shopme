package com.shopme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.shopme.entity.Bill;
import com.shopme.entity.Cart;
import com.shopme.entity.Complaints;
import com.shopme.entity.Order;
import com.shopme.entity.OrderDetails;
import com.shopme.entity.Product;
import com.shopme.entity.RateReview;
import com.shopme.utility.DataBaseConnection;

public class BuyerDaoInterfaceImplementation  implements BuyerDaoInterface {

	@Override
	public Product viewProductDetailsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> browseProductsByCategoryDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addProductsToCartDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProductsToCartDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill checkoutDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmailNotificationsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewOrderHistoryDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RateReview rateAndReviewProductsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String complaintAgainstTheSellerDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String returnADefectiveProductDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveProductAsFavoriteDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails generateInvoiceDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeaymentUsingThePaymentGatewayDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> productList = new ArrayList<>();
		

        try {
        		
        	Connection con = DataBaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("Select product_name, price, description, brand,image_path ,rating,discount FROM Product");
             ResultSet rs = ps.executeQuery() ;

            while (rs.next()) {
            	 Product product = new Product();
            	System.out.println("inside while loop");
               System.out.println(rs.getString(1));
                product.setProductName(rs.getString(1));
                product.setPrice(rs.getDouble(2));
                System.out.println(rs.getDouble(2));
                product.setDescription(rs.getString(3));
                product.setBrand(rs.getString(4));
                product.setImagePath(rs.getString(5));
                product.setRating(rs.getDouble(6));
                product.setDiscount(rs.getDouble(7));
                System.out.println(product);
                
                productList.add(product);
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
        System.out.println("inside dao "+productList);
        return productList;
	}

	@Override
	public List<Cart> getCartProducts(String email) {
		List<Cart> cartitems=new ArrayList<>();
		try {
			Connection con = DataBaseConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement
//            		("SELECT ProductName, ProductPrice, ProductDescription, ProductBrand, ProductRating, productDiscount 
//                      FROM cart WHERE email = "?");
            
			PreparedStatement ps = con.prepareStatement("SELECT ProductName, ProductPrice, ProductDescription, ProductBrand, ProductRating, productDiscount FROM cart WHERE email = ?");
             ps.setString(1, email);

            ResultSet rs = ps.executeQuery() ;	
            while(rs.next()) {
            Cart cart=new Cart();
            cart.setProductName(rs.getString(1));
            cart.setProductPrice(rs.getDouble(2));
            cart.setProductDescription(rs.getString(3));
            cart.setProductBrand(rs.getString(4));
            cart.setProductRating(rs.getDouble(5));
            cart.setProductDiscount(rs.getDouble(6));
            cartitems.add(cart);
            }
            
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  cartitems;
	}

	@Override
	public int orderProducts(Order order) {
		int i=0;
		LocalDateTime dateTime = LocalDateTime.now();
		
		 Timestamp timestamp = Timestamp.valueOf(dateTime);
		try {
			Connection con = DataBaseConnection.getConnection();
			String query="insert into orders "
					+ "(productName, productPrice, productBrand, productRating,productDiscount, priceAfterDiscount, buyerName, mobileNumber,  pincode, address, paymentType, buyerEmail,dateTime)"
					+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";  
					
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1, order.getProductName());
            preparedStatement.setDouble(2, order.getProductPrice());
            preparedStatement.setString(3, order.getProductBrand());
            preparedStatement.setDouble(4,order.getProductRating());
            preparedStatement.setDouble(5,order.getProductDiscount());
            preparedStatement.setDouble(6, order.getPriceAfterDiscount());
            preparedStatement.setString(7, order.getBuyerName());
            preparedStatement.setString(8, order.getMobileNumber());
            preparedStatement.setInt(9, order.getPincode());
            preparedStatement.setString(10, order.getAddress());
            
            preparedStatement.setString(11, order.getPaymentType());
            preparedStatement.setString(12, order.getBuyerEmail());
            preparedStatement.setTimestamp(13,timestamp);
             i=preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return i;
	}

	@Override
	public List<Order> getAllOrdersByEmail(String email) {
	List<Order> allOrders=new ArrayList<>();
	System.out.println("emailinside the "+email);
	try {
		Connection con=DataBaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select orderId,productName,productPrice,productBrand,priceAfterDiscount,paymentType,dateTime from orders where buyerEmail=?");
		ps.setString(1, email);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("inside the result set" );
			Order order=new Order();
			order.setOrderId(rs.getInt(1));
			order.setProductName(rs.getString(2));
			order.setProductPrice(rs.getDouble(3));
			order.setProductBrand(rs.getString(4));
			order.setPriceAfterDiscount(rs.getDouble(5));
			order.setPaymentType(rs.getString(6));
			Timestamp timestamp = rs.getTimestamp(7);
			order.setDateTime(timestamp.toLocalDateTime());
			allOrders.add(order);	
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println(allOrders.size());
	return allOrders;
	}

	@Override
	public int registerComplaint(Complaints complaints) {
		int i=0;
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into complaints(orderId,buyerName,registerComplaint,buyerEmail,complaintStatus) values(?,?,?,?,?)");
			ps.setInt(1, complaints.getOrderId());
			ps.setString(2, complaints.getBuyerEmail());
			ps.setString(3,complaints.getRegisterComplaint());
			ps.setString(4, complaints.getBuyerEmail());
			ps.setBoolean(5, true);
		    i=ps.executeUpdate();
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
