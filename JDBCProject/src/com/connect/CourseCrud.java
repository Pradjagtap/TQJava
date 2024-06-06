package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
	
	static Connection con=null;
	Statement st;
	ResultSet rs;
	static Scanner sc= new Scanner(System.in);
	
	CourseCrud()
	{
		con= DBconnect.getConnect();
		System.out.println("Connection done...");
		try {
			st= con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fetchCourseDetails()
	{
		try {
			rs=st.executeQuery("select * from course");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4));
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteCourse()
	{
		System.out.println("Enter the course id to be deleted:");
		int id = sc.nextInt();
		
		try {
			int noOfRowsDeleted=st.executeUpdate("delete from course where courseid="+id);
			if(noOfRowsDeleted>0)
			{
				System.out.println("Course "+id +" is deleted..");
				fetchCourseDetails();
			}
			else
			{
				System.out.println("Error");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertCourse()
	{
		System.out.println("Enter the course id to be inserted:");
		int id = sc.nextInt();
		
		System.out.println("Enter the course name:  ");
		String cname=sc.next();
		
		System.out.println("Enter duration (In months): ");
		int durs=sc.nextInt();
		
		System.out.println("Enter fees: ");
		float fees=sc.nextFloat();
		
		PreparedStatement pst;
		
		try
		{
			pst=con.prepareStatement("insert into course values(?,?,?,?,?) ");
			pst.setInt(1,id);
			pst.setString(2,cname);
			pst.setInt(3,durs);
			pst.setInt(5,0);
			
			int noOfRowsInserted=pst.executeUpdate();
			if(noOfRowsInserted>0)
			{
				System.out.println("Course added...");
				fetchCourseDetails();
			}
			else
			{
				System.out.println("Error....");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public boolean searchCourseById(int id)
	{
		boolean isFound=false;
		PreparedStatement pst;
		try
		{
			pst=con.prepareStatement("select * from course where courseid=?");
			pst.setInt(1,id);
			
			rs=pst.executeQuery();
			while(rs.next())
			{
				isFound=true;
				System.out.println("Courseid: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Duration: "+rs.getInt(3));
				System.out.println("Fees: "+rs.getFloat(4));
				System.out.println("Student count: "+rs.getInt(5));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return isFound;
	}
	public void updateCourseFee()
	{
		System.out.println("Enter the course id to be updated: ");
		int id=sc.nextInt();
		PreparedStatement pst;
		if(searchCourseById(id))
		{
			System.out.println("-----------");
			System.out.println("Enter the new fees: ");
			float fees=sc.nextFloat();
			
			try
			{
				pst=con.prepareStatement("update course set fees=? where courseid=?" );
				pst.setFloat(1, fees);
				pst.setInt(2, id);
				int noOfRowsUpdated=pst.executeUpdate();
				if(noOfRowsUpdated>0)
				{
					System.out.println("Course updated");
					searchCourseById(id);
				}
				else
				{
					System.out.println("Error........");
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
//		CourseCrud obj= new CourseCrud();
//		obj.fetchCourseDetails();
//		System.out.println("-------------------------------------");
//		//obj.deleteCourse();
//		//obj.insertCourse();
//		
//		System.out.println("Enter the course id: ");
//		int id=sc.nextInt();
//		if(!obj.searchCourseById(id))
//			System.out.println("Course not found..............");
		
		CourseCrud obj=new CourseCrud();
		int choice;
		char ch;
		
		do
		{
			System.out.println("=======================");
			System.out.println("1.Add new course");
			System.out.println("2.Delete course");
			System.out.println("3.Update course fees");
			System.out.println("4.View all courses");
			System.out.println("5.View course by id");
			System.out.println("6.Exit");
			
			System.out.println("Enter your choice: ");
			System.out.println("---------------------");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:obj.insertCourse();
			break;
			case 2:obj.deleteCourse();
			break;
			case 3:obj.updateCourseFee();
			break;
			case 4:obj.fetchCourseDetails();
			break;
			case 5:System.out.println("Enter the  course id to be searched: ");
					int id=sc.nextInt();
					if(!obj.searchCourseById(id))
						System.out.println("course not found...");
					break;
			case 6:System.out.println("-----------Closing the course application-----------");
			System.exit(0);
			break;
			
			default:System.out.println("Wrong input");
			
			}
			System.out.println("Do you want perform more operation(y-yes/n-no)");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y'||ch=='Y');
	
	}

}
