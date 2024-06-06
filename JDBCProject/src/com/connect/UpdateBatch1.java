package com.connect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//code given by mam
public class UpdateBatch1 {
	void show_batches() throws SQLException, ClassNotFoundException
	{
	Connection con=	DBConnect1.getConnect();
	Statement st=con.createStatement();
	
		st.addBatch("Insert into book  values(9,'XXXX',1,200)");
		st.addBatch("Insert into book  values(10,'yyyy',1,300)");
		
		st.addBatch("update book  set price=350 where b_id=3");
		
		st.addBatch("delete from book where b_id=4");
		int a[]=st.executeBatch();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" has affected");
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UpdateBatch1 u=new UpdateBatch1();
		u.show_batches();
	}

}

