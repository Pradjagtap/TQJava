package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect1 {
	static Connection con=null;
	public static Connection getConnect()
	{
	
	try {
		
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver is loaded..........");
		
		//create connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_showroomdb","root","root");
		System.out.println("connection established.......");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	
	
	}
	public static void main(String[] args) {
	
		getConnect();
	}

}
