package com.shopme.entity;

public class Admin {
	
private int id;
private String name;
private String passWord;
private String email;
private String userType;
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(int id, String name, String passWord, String email, String userType) {
	super();
	this.id = id;
	this.name = name;
	this.passWord = passWord;
	this.email = email;
	this.userType = userType;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
