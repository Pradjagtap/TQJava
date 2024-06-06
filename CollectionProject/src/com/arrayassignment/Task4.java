package com.arrayassignment;

import java.util.ArrayList;

/*
 * 14.	WAP to search an element from ArrayList
 * 15.	WAP to search the specified collection in this collection
 * 16.	WAP to retrieve an element (at a specified index) 
 * from a given ArrayList
 * 17.	WAP to insert an element into the ArrayList at the 
 * first position
 */
public class Task4 {

	public static void main(String[] args) {
		ArrayList <String>al = new ArrayList<>();
		al.add("Richa");
		al.add("pradnya");
		al.add("Student");
		al.add("Riya");
		
		System.out.println(al);
		
		System.out.println(al.contains("Richa"));
		System.out.println(al.contains("Aman"));
		System.out.println(al.indexOf("Riya"));
		al.add(0, "Pink");
		System.out.println(al);
		
		ArrayList <Integer>al2 = new ArrayList<>();
		al2.add(89);
		al2.add(90);
		al2.add(78);
		al2.add(56);
		al2.add(23);
		System.out.println(al2);
		System.out.println(al.containsAll(al2));
		System.out.println("--------------");
		//replace
		al2.set(2, 54);
		System.out.println(al2);
		//
		System.out.println(al2.get(3));
		ArrayList <Integer>al3 = new ArrayList<>();
		al3.add(90);
		al3.add(56);
		//al3.add(67);
		System.out.println(al3);
		System.out.println(al2.containsAll(al3));
		
	}

}
