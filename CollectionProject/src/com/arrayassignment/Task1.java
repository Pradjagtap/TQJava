package com.arrayassignment;

import java.util.ArrayList;
import java.util.List;

/*
 *Q1. WAP to add elements to arraylist without using generics (no <>) 
 * and print content of it where Integer is used. 
 * In second arraylist String is used.
 */
public class Task1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(102);
		al.add("Sushma");
		al.add("Teacher");
		al.add(3,25000);
		System.out.println(al);
	



/*
 * 2.	WAP add elements to arraylist without using generics, 
 * 0th location keep Integer, 1st location String now print each 
 * element and display contents.
 * /*
 * 3.	WAP to use add operation of ArrayList
 */

	ArrayList al3=new ArrayList();
	ArrayList al2=new ArrayList();
	al2.add(0,67);
	al2.add(1,"myth");
	al2.addAll(al2);
	System.out.println(al2);
	

	

	}
}





















