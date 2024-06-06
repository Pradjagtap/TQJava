package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatement1 {

	static Connection con=null;
	static CallableStatement cst=null;
	static ResultSet rs;
	
	CallableStatement1() 
	 {
		 
		con=DBconnection3.getconnect();
		
	 }
	
	static void countEmpAvgSalary(int did) throws SQLException
	{
		
		cst=con.prepareCall("{call countEmpAvgSalary(?,?,?)}");
		cst.setInt(1, did);
		cst.registerOutParameter(2, Types.INTEGER);
		cst.registerOutParameter(3, Types.FLOAT);
		cst.execute();
		System.out.println("Department id:"+did);
		System.out.println("Employee count:"+cst.getInt(2));
		System.out.println("Average salary:"+cst.getFloat(3));
	}

	
	static void employeeCount(int did) throws SQLException
	{
		
		cst=con.prepareCall("{call employeeCount(?)}");
		cst.setInt(1, did);
		
		boolean b=cst.execute();
		if(b==true)
		{
			rs=cst.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
		}
		
	   }

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatement1 obj=new CallableStatement1();
		//countEmpAvgSalary(100);
		employeeCount(30);
        
	}

}