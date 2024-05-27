package com.demo.classobject;

public class Books {
	//instance variable
	int bookid;
	String bookname;
	double bookprice;
	
	public void readBook() {
		System.out.println("read book instance method");
	}

	public static void main(String[] args) {
		System.out.println(new Books().bookid);
		System.out.println(new Books().bookname);
		System.out.println(new Books().bookprice);
		
		//by ref variable
		//ref var-b1
		Books b1=new Books();
		System.out.println(b1.bookid);
		System.out.println(b1.bookname);
		System.out.println(b1.bookprice);
		b1.readBook();
	}

}
