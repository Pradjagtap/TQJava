package com.arrayassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * 7.	WAP to create a new ArrayList, add 
 * some colors (string) and print the collection.
 * 4.	WAP to print all elements of ArrayList using iterator
 * 5.	WAP to iterate through all elements in an ArrayList using for loop
 * 6.	WAP to iterate through all elements in an ArrayList using for each
 */
public class Task2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Blue");
		al.add("Red");
		al.add("White");
		al.add("Black");
		al.add("Purple");
		
		System.out.println(al);
		
		//using for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------------------");
		
		//using enhanced for loop
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("----------------");
		
		//using iterator
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		System.out.println("----------------");
		
		ListIterator<String> litr = al.listIterator();
			while (litr.hasNext()) {
				System.out.println(litr.next());
			}
		}
	}

}
