package com.shopme.entity;

public class Product {
	    private int productId;
	    private String productName;
	    private double price;
	    private String description;
	    private String brand;
	    private double rating;
	    private int countOfProducts;
	    private double discount;
	    private String imagePath;
	    private int shopId;
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(int productId, String productName, double price, String description, String brand, double rating,
				int countOfProducts, double discount ,String imagePath,int shopId) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.description = description;
			this.brand = brand;
			this.rating = rating;
			this.countOfProducts = countOfProducts;
			this.discount = discount;
			this.imagePath=imagePath;
			this. shopId =shopId;
		}
	
		public int getShopId() {
			return shopId;
		}
		public void setShopId(int shopId) {
			this.shopId = shopId;
		}
		
		public String getImagePath() {
			return imagePath;
		}
		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getRating() {
			return rating;
		}
		public void setRating(double rating) {
			this.rating = rating;
		}
		public int getCountOfProducts() {
			return countOfProducts;
		}
		public void setCountOfProducts(int countOfProducts) {
			this.countOfProducts = countOfProducts;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
					+ ", description=" + description + ", brand=" + brand + ", rating=" + rating + ", countOfProducts="
					+ countOfProducts + ", discount=" + discount + ", imagePath=" + imagePath + ", shopId=" + shopId
					+ "]";
		}
		
		
	
}
