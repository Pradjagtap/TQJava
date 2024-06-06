package com.demo.assignment;
import java.util.Scanner;

public class Booktest {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterBookDetails(Book b)
	{
		System.out.println("Enter book id: ");
		b.setId(sc.nextInt());
		
		System.out.println("Enter book name: ");
		b.setName(sc.next());
		
		System.out.println("Enter book price: ");
		b.setPrice(sc.nextDouble());
		
		System.out.println("Enter book category: ");
		b.setCategory(sc.next());
		
		System.out.println("Enter discount: ");
		b.setDiscount(sc.nextDouble());
		
		
	}
	public static void main(String[] args) {
		
		Book b1=new Book();
		enterBookDetails(b1);
		
		Book b2=new Book();
		enterBookDetails(b2);
		
		System.out.println(b1);
		System.out.println("Amount to pay: "+b1.calDiscountedPrice(10));
		
		System.out.println(b2);
		System.out.println("Amount to pay: "+b2.calDiscountedPrice(20));
		
		System.out.println(b1);
		System.out.println(b2);
		b1.compareCost(b2);
		
		

	}

}
