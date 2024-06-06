package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerCrud {
	static Connection con = null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	static Scanner sc = new Scanner(System.in);

	CustomerCrud() throws ClassNotFoundException, SQLException {
		con = DBConnect1.getConnect();
		System.out.println("Connection done...");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchCustomerDetails() {
		try {
			rs = st.executeQuery("select * from customer");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getLong(4)
						+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertCustomer() {
		System.out.println("Enter customer cust_id:");
		int id = sc.nextInt();

		System.out.println("Enter the customer first_name:");
		String mname = sc.next();

		System.out.println("Enter the customer last_name:");
		String lname = sc.next();

		System.out.println("Enter customer mobileNo: ");
		long mno = sc.nextLong();

		System.out.println("Enter the customer gender:");
		String gender = sc.next();

		System.out.println("Enter the customer email:");
		String email = sc.next();

		System.out.println("Enter the customer city:");
		String city = sc.next();

		try {
			pst = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, mname);
			pst.setString(3, lname);
			pst.setLong(4, mno);
			pst.setString(5, gender);
			pst.setString(6, email);
			pst.setString(7, city);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("Customer added..");
				fetchCustomerDetails();
			} else {
				System.out.println("Error....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean searchCustomerById(int id) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from customer where cust_id=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			while (rs.next()) {
				isFound = true;
				System.out.println("Customerid:" + rs.getInt(1));
				System.out.println("CustomerfirstName:" + rs.getString(2));
				System.out.println("CustomerlastName:" + rs.getString(3));
				System.out.println("MobileNo:" + rs.getLong(4));
				System.out.println("CustomerGender:" + rs.getString(5));
				System.out.println("CustomerEmail:" + rs.getString(6));
				System.out.println("CustomerCity:" + rs.getString(7));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isFound;
	}

	public void updateCustomerCity() {

		System.out.println("Enter the customer id to be updated:");
		int id = sc.nextInt();

		if (searchCustomerById(id)) {

			System.out.println("========================");
			System.out.println("Enter the new city:");
			String city = sc.next();

			try {
				pst = con.prepareStatement("Update customer set city=? where cust_id=?");
				pst.setString(1, city);
				pst.setInt(2, id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Customer Updated....");
					searchCustomerById(id);
				} else {
					System.out.println("Error.......");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else {
			System.out.println("Customer not found.....");
		}

	}

	public void deleteCustomer() {
		System.out.println("Enter the customer id to be deleted:");
		int id = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from customer where cust_id=" + id);
			if (noOfRowsDeleted > 0) {
				System.out.println(" customer" + id + " is deleted..");
				fetchCustomerDetails();
			} else {
				System.out.println("Error");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CustomerCrud obj = new CustomerCrud();
		int choice;
		char ch;

		do {
			System.out.println("=========================================================");
			System.out.println("1. Add new customer");
			System.out.println("2. Delete customer");
			System.out.println("3. Update customer City");
			System.out.println("4. View all customer ");
			System.out.println("5. View customer By id");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.insertCustomer();
				break;
			case 2:
				obj.deleteCustomer();
				break;
			case 3:
				obj.updateCustomerCity();
				break;
			case 4:
				obj.fetchCustomerDetails();
				break;
			case 5:
				System.out.println("Enter the Customer id to be searched:");
				int id = sc.nextInt();
				if (!obj.searchCustomerById(id))
					System.out.println("Customer not found....");
				break;
			case 6:
				System.out.println("------------Closing the Model application---------------");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong input");
			}

			System.out.println("Do you want perform more operation(y-yes/n-no)");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
