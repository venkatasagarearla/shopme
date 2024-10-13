package com.shopme.entity;

public class Cart {
	int cartId;
	String email;
	int productID;
	String productName;
	String productDescription;
	int quantity;
	String productBrand;
	double productRating;
	double productDiscount;
	double productPrice;
   String productImagePath;

	
	public Cart(int cartId, String email, int productID, String productName, String productDescription, int quantity,
			String productBrand, double productRating, double productDiscount, double productPrice) {
		super();
		this.cartId = cartId;
		this.email = email;
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.quantity = quantity;
		this.productBrand = productBrand;
		this.productRating = productRating;
		this.productDiscount = productDiscount;
		this.productPrice = productPrice;
	}


	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cart(int cartId, String email, int productID, String productName, String productDescription, int quantity,
			String productBrand, double productRating, double productDiscount, double productPrice,
			String productImagePath) {
		super();
		this.cartId = cartId;
		this.email = email;
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.quantity = quantity;
		this.productBrand = productBrand;
		this.productRating = productRating;
		this.productDiscount = productDiscount;
		this.productPrice = productPrice;
		this.productImagePath = productImagePath;
	}


	public int getCartId() {
		return cartId;
	}


	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
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


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductImagePath() {
		return productImagePath;
	}


	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", email=" + email + ", productID=" + productID + ", productName="
				+ productName + ", productDescription=" + productDescription + ", quantity=" + quantity
				+ ", productBrand=" + productBrand + ", productRating=" + productRating + ", productDiscount="
				+ productDiscount + ", productPrice=" + productPrice + ", productImagePath=" + productImagePath + "]";
	}


	
	
}
