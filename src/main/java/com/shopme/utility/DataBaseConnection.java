package com.shopme.utility;

import java.sql.*;
public class DataBaseConnection {

	public static Connection con;
	public static Connection getConnection() throws Exception   {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopme","root","Sagar1212@");
		return con;
	}
	
}
