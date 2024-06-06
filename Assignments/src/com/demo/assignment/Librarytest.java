package com.demo.assignment;

import java.util.Scanner;

public class Librarytest {
	static Scanner sc=new Scanner(System.in);
	
	public static void enterLibraryDetails(Library b)
	{
		System.out.println("Enter book id: ");
		b.setId(sc.nextInt());
		
		System.out.println("Enter book name: ");
		b.setName(sc.next());
		
		System.out.println("Books type: ");
		b.setBooks(sc.next());
		
				
	}
	
	public static void main(String[] args) {
		
		Library b1=new Library();
		enterLibraryDetails(b1);
		
		System.out.println(b1);
		
		Library b2=new Library();
		enterLibraryDetails(b2);
		System.out.println(b2);
		
	}
}

		