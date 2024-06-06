//package com.demo.crud2;
//
//import java.util.Scanner;
//
//import com.demo.crud.Book;
//
//public class BookImplimentation implements BookDetails {
//
//	Scanner sc = new Scanner(System.in);
//	Book b[] = new Book[5];
//
//	int id, price;
//	String bname, aname;
//	int count = 0;
//	
//
//	@Override
//	public void addBook() {
//		System.out.println("Enter the number of books");
//		int size = sc.nextInt();
//		//Book[] b = new Book[size];
//		for (int i = 0; i < size; i++) {
//			System.out.println("Enter book id");
//			id = sc.nextInt();
//			System.out.println("Enter book name");
//			bname = sc.next();
//			System.out.println("Enter book author");
//			aname = sc.next();
//			System.out.println("Enter book price");
//			price = sc.nextInt();
//			b[count] = new Book(id, bname, aname, price);
//			count++;
//		}
//
//	}
//
//	@Override
//	public void updateBook() {
//		System.out.println("------update book------");
//		System.out.println("Enter book id you want to update");
//		id = sc.nextInt();
//		
//		for (int i = 0; i < count; i++) {
//
//			if (b[i] != null && b[i].getBookId() == id) {
//
//				System.out.println("Enter price you want to be update");
//				price = sc.nextInt();
//				b[i].setPrice(price);
//			}
//		}
//		System.out.println("Succesfully updated");
//
//	}
//
//	@Override
//	public void deleteBook() {
//		System.out.println("Enter the bookid you want to delete");
//		id = sc.nextInt();
//		boolean flag = false;
//		for (int i = 0; i < count; i++) {
//			if (b[i] != null && b[i].getBookId() == id) {
//				b[i] = null;
//				flag = true;
//			}
//		}
//		if (flag == false) {
//			System.out.println("id is not present");
//		} else {
//
//			System.out.println("Book deleted Successfully");
//		}
//
//	}
//
//	@Override
//	public void searchBookById() {
//		System.out.println("Enter the bookid you want to search");
//		id = sc.nextInt();
//		boolean flag=false;
//		for (int i = 0; i < count; i++) {
//			flag=false;
//			if (b[i] != null && b[i].getBookId()== id) {
//				System.out.println(b[i]);
//				flag = true;
//				break;
//
//			}
//		}
//		if (flag == false) {
//			System.out.println("id is not found");
//		}
//
//	}
//
//	@Override
//	public void searchBookByName() {
//		System.out.println("Enter the book name you want to search");
//		bname = sc.next();
//		boolean flag=false;
//		for (int i = 0; i < count; i++) {
//			if (b[i] != null &&b[i].getBookname().equals(bname)) {
//				flag = true;
//				System.out.println("Book is found" + b[i]);
//			}
//
//		}
//		if (flag == true) {
//			System.out.println("book found");
//		} else {
//			System.out.println("Book not found");
//		}
//	}
//	
//	@Override
//	public void searchBookByAuthor() {
//		System.out.println("Enter the author name you want to search");
//		aname = sc.next();
//		boolean flag=false;
//		for (int i = 0; i < count; i++) {
//			if (b[i] != null &&b[i].getBookAuthor().equals(aname)) {
//				System.out.println("Book is found" + b[i]);
//			}
//
//		}
//		if (flag == true) {
//			System.out.println("book found");
//
//		} else {
//			System.out.println("book not found");
//		}
//	}
//	@Override
//	public void showAllBook() {
//		System.out.println("-----------Show all books----------");
//		for (int i = 0; i < count; i++) {
//			if (b[i] != null) {
//				System.out.println(b[i]);
//			}
//		}
//	}
//
//}
//
