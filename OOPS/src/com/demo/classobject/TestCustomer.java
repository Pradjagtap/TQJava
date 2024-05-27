package com.demo.classobject;
class customer{
	int custid;
	String custname;

	public void setData(int cid,String cname) {
		custid=cid;
		custname=cname;
	}
	public void showData() {
		System.out.println("Customer id: "+custid);
		System.out.println("Customer name: "+custname);
		System.out.println("---------------------");
	}
	}
public class TestCustomer {

	public static void main(String[] args) {
		customer c1=new customer();
		customer c2=new customer();
		customer c3=new customer();
		c1.setData(1,"rohan");
		c2.setData(2,"riya");
		c3.setData(3,"priya");
		c1.showData();
		c2.showData();
		c3.showData();
		
		

	}

}
