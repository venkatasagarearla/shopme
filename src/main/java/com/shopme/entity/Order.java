package com.shopme.entity;

import java.time.LocalDateTime;

public class Order {
	int orderId;
	String productName;
	double productPrice;
	String productBrand;
	double productRating;
	double productDiscount;
	double priceAfterDiscount;
	String buyerName;
	String mobileNumber;
	int    pincode;
	String address;
	String paymentType;
	String buyerEmail;
	private LocalDateTime dateTime;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Order(int orderId, String productName, double productPrice, String productBrand, double productRating,
			double productDiscount, double priceAfterDiscount, String buyerName, String mobileNumber, int pincode,
			String address, String paymentType, String buyerEmail, LocalDateTime dateTime) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productRating = productRating;
		this.productDiscount = productDiscount;
		this.priceAfterDiscount = priceAfterDiscount;
		this.buyerName = buyerName;
		this.mobileNumber = mobileNumber;
		this.pincode = pincode;
		this.address = address;
		this.paymentType = paymentType;
		this.buyerEmail = buyerEmail;
		this.dateTime = dateTime;
	}





//	public LocalDateTime getDateTime() {
//		return dateTime;
//	}
//
//
//
//
//
//	public void setDateTime(LocalDateTime dateTime) {
//		this.dateTime = dateTime;
//	}
//
//
//
//
//
//	public int getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public double getProductPrice() {
//		return productPrice;
//	}
//	public void setProductPrice(double productPrice) {
//		this.productPrice = productPrice;
//	}
//	public String getProductBrand() {
//		return productBrand;
//	}
//	public void setProductBrand(String productBrand) {
//		this.productBrand = productBrand;
//	}
//	public double getProductRating() {
//		return productRating;
//	}
//	public void setProductRating(double productRating) {
//		this.productRating = productRating;
//	}
//	public double getProductDiscount(double ProductDiscount) {
//		return ProductDiscount;
//	}
//	public void setProductDiscount(double productDiscount) {
//		this.productDiscount = productDiscount;
//	}
//	public double getPriceAfterDiscount(double priceAfterDiscount) {
//		return priceAfterDiscount;
//	}
//	public void setPriceAfterDiscount(double priceAfterDiscount) {
//		this.priceAfterDiscount = priceAfterDiscount;
//	}
//	public String getBuyerName(String buyerName) {
//		return buyerName;
//	}
//	public void setBuyerName(String buyerName) {
//		this.buyerName = buyerName;
//	}
//	public String getMobileNumber(String mobileNumber) {
//		return mobileNumber;
//	}
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//	public int getPincode(int pincode) {
//		return pincode;
//	}
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//	public String getAddress(String address) {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPaymentType(String paymentType) {
//		return paymentType;
//	}
//	public void setPaymentType(String paymentType) {
//		this.paymentType = paymentType;
//	}
//	
//	
//	public String getBuyerEmail(String buyerEmail) {
//		return buyerEmail;
//	}
//
//
//	public void setBuyerEmail(String buyerEmail) {
//		this.buyerEmail = buyerEmail;
//	}





	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productBrand=" + productBrand + ", productRating=" + productRating + ", productDiscount="
				+ productDiscount + ", priceAfterDiscount=" + priceAfterDiscount + ", buyerName=" + buyerName
				+ ", mobileNumber=" + mobileNumber + ", pincode=" + pincode + ", address=" + address + ", paymentType="
				+ paymentType + ", buyerEmail=" + buyerEmail + ", dateTime=" + dateTime + "]";
	}





	public int getOrderId() {
		return orderId;
	}





	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}





	public String getProductName() {
		return productName;
	}





	public void setProductName(String productName) {
		this.productName = productName;
	}





	public double getProductPrice() {
		return productPrice;
	}





	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}





	public String getProductBrand() {
		return productBrand;
	}





	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}





	public double getProductRating() {
		return productRating;
	}





	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}





	public double getProductDiscount() {
		return productDiscount;
	}





	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}





	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}





	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}





	public String getBuyerName() {
		return buyerName;
	}





	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}





	public String getMobileNumber() {
		return mobileNumber;
	}





	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}





	public int getPincode() {
		return pincode;
	}





	public void setPincode(int pincode) {
		this.pincode = pincode;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public String getPaymentType() {
		return paymentType;
	}





	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}





	public String getBuyerEmail() {
		return buyerEmail;
	}





	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}





	public LocalDateTime getDateTime() {
		return dateTime;
	}





	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}


	

	
	
}
