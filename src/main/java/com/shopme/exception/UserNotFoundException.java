package com.shopme.exception;

public class UserNotFoundException extends RuntimeException {
	 public UserNotFoundException() {
	        super("User not found");
	        System.out.println("User not found");
	    }
}
