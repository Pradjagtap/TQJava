package com.connect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBatch2 {
	void show_batches() throws SQLException {
		Connection con=DBConnect1.getConnect();
		Statement st=con.createStatement();
		
		st.addBatch("Insert into model values(109,'Honda',120000)");
		st.addBatch("Insert into model values(110,'Hero',125000)");
		System.out.println("Item added");
		
		st.addBatch("update model set cost=100000 where modelId=102");
		st.addBatch("delete from model where modelId=110");
		
		int a[]=st.executeBatch();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" has affected");
		}
		
	}
//if foreign key is present in table then in sql change the table setting
	//on update cascade and on delete cascade
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UpdateBatch2 u=new UpdateBatch2();
		u.show_batches();
	}

}

