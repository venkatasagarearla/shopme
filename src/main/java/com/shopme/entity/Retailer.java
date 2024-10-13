package com.shopme.entity;

import java.util.ArrayList;
import java.util.List;

public class Retailer {
 private  int  shopId;
 private String ownerName;
 private String email;
 private String password;
 private String phoneNumber;
 private String shopName;
 private String ShopAdress;
 private String productName;
 private String userType;

 private List<Product> products=new ArrayList<>(); // List to store multiple products sold by the retailer

 private double rating;
 
 private Boolean approved;

public Retailer() {
	super();
	
}

public Retailer(int shopId, String ownerName, String email, String password, String phoneNumber, String shopName,
		String shopAdress, String productName, String userType, List<Product> products, double rating,
		Boolean approved) {
	super();
	this.shopId = shopId;
	this.ownerName = ownerName;
	this.email = email;
	this.password = password;
	this.phoneNumber = phoneNumber;
	this.shopName = shopName;
	ShopAdress = shopAdress;
	this.productName = productName;
	this.userType = userType;
	this.products = products;
	this.rating = rating;
	this.approved = approved;
}

public int getShopId() {
	return shopId;
}

public void setShopId(int shopId) {
	this.shopId = shopId;
}

public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getShopName() {
	return shopName;
}

public void setShopName(String shopName) {
	this.shopName = shopName;
}

public String getShopAdress() {
	return ShopAdress;
}

public void setShopAdress(String shopAdress) {
	ShopAdress = shopAdress;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

public List<Product> getProducts() {
	return products;
}

public void setProducts(List<Product> products) {
	this.products = products;
}

public double getRating() {
	return rating;
}

public void setRating(double rating) {
	this.rating = rating;
}

public Boolean getApproved() {
	return approved;
}

public void setApproved(Boolean approved) {
	this.approved = approved;
}
 

}
