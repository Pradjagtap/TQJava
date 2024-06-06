package com.connect;

import java.util.*;

import java.sql.*;
public class FetchModelDetails{

	public static void main(String args[])
	{
		final String url = "jdbc:mysql://localhost:3306/models";
		final String user = "root";
		final String pass = "root";
		
		HashMap<Integer,String> modelDetails =  new HashMap<>();

		try
		{
			Connection con = DriverManager.getConnection(url, user, pass);
			
			String query ="select id, modelname from model";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String modelName = rs.getString("modelname");
				modelDetails.put(id,modelName);
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Model details");
		for(Integer id : modelDetails.keySet())
		{
			System.out.println(id+" : "+modelDetails.get(id));

		}
			
	}



}