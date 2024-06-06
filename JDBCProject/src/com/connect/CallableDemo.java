package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableDemo {
	
	Connection con;
	Statement st;
	CallableStatement cst;
	ResultSet rs;
	static Scanner sc=new Scanner(System.in);
	
	CallableDemo(){
		con=DBconnect.getConnect();
		System.out.println("Connection done....");
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getFacultySalary() {
		
		System.out.println("Enter faculty id:");
		int id=sc.nextInt();
		
		try {
			cst=con.prepareCall("{?= call facultySalary(?)}");
			cst.registerOutParameter(1, Types.FLOAT);
			cst.setInt(2, id);
			
			
			cst.execute();
			System.out.println("Salary is:"+cst.getFloat(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public void getStudentsByCourseProcedure()
//	{
//		System.out.println("Enter the course name: ");
//		String name=sc.next();
//		
//		try
//		{
//			cst=con.prepareCall("{call getStudentByCourse(?)}");
//			cst.setString(1, name);
//			
//			boolean status=cst.execute();
//			boolean isRecord=false;
//			if(status)
//			{
//				rs=cst.getResultSet();
//				while(rs.next())
//				{
//					isRecord=true;
//					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//				}
//			}
//			if(!isRecord)
//			{
//				System.out.println("No record found in this course........");
//			}
//		}
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public void getStudentByCourseProcedure()
	{
		System.out.println("Enter the course name:");
		String name=sc.next();
		
		
		try {
			cst=con.prepareCall("{call getStudentByCourse(?)}");
			cst.setString(1, name);
			
			boolean status=cst.execute();
			boolean isRecord=false;
			if(status) {
				rs=cst.getResultSet();
				while(rs.next()) {
					isRecord=true;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6));
				}
			}
			if(!isRecord) {
				System.out.println("No record found in this course....");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void studentCountProc()
	{
		System.out.println("enter the course id:");
		int id= sc.nextInt();
		
		try {
			cst= con.prepareCall("{call getStudentCount(?,?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.INTEGER);
			
			cst.execute();
			
			//System.out.println(id+" "+cst.getString(2)+" "+cst.getInt(3));
			System.out.println("Course id:"+id);
			System.out.println("Course Name:"+cst.getString(2));
			System.out.println("Number of students:"+cst.getInt(3));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		CallableDemo obj= new CallableDemo();
		//obj.getFacultySalary();
		//obj.getStudentsByCourseProcedure();
		obj.studentCountProc();
	}

}
