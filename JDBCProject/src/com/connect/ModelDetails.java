package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ModelDetails{
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	static Scanner sc=new Scanner(System.in);
	ModelDetails(){
		
		try{
		con=DBConnect1.getConnect();
		System.out.println("connection done..........");
		st=con.createStatement();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	public void fetchModelDetails(HashMap<Integer,String> hs)
	{	
		try{
			pst=con.prepareStatement("select * from model");
			rs=pst.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				hs.put(id,name);
			}
			Set<Entry<Integer,String>> entries=hs.entrySet();
			for(Entry<Integer,String> e:entries)
			{
				System.out.println(e.getKey()+":"+e.getValue());
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[]args)
	{	
		ModelDetails obj=new ModelDetails();
		HashMap<Integer,String> hs=new HashMap<>();
		obj.fetchModelDetails(hs);
	}
      }


