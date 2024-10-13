package com.shopme.entity;

public class Buyer {
	private String name;
	private String email;
	private String password;
	private int age;
	private String contactno;
	private String city;
	private String userType;
	
	public Buyer(String name, String email, String password, int age, String contactno, String city, String userType) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.contactno = contactno;
		this.city = city;
		this.userType = userType;
	}
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
