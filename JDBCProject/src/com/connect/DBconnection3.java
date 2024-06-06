package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection3 {
	static Connection con=null;
	public static final String url="jdbc:mysql://localhost:3306/testdb";
	public static final String user="root";
	public static final String password="root";
	
	public static Connection getconnect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded....");
			con=DriverManager.getConnection(url, user, password);
			System.out.println("Connection done.....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public static void main(String[] args) {
		getconnect();
		

	}

}