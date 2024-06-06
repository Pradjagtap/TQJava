package com.arrayassignment;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 21.	WAP to convert collection into array
 * 22.	WAP of swap two elements in an ArrayList
 * 23.	WAP to replace the second element of an ArrayLis
 *  with the specified element
 */
public class Task7 {

	public static void main(String[] args) {
		ArrayList <Object>al = new ArrayList<>();
		al.add(102);
		al.add("Shree");
		al.add(50000);
		System.out.println(al);
		
		System.out.println(al.set(1, "Ram"));
		al.add(1, 104);
		System.out.println(al);
		
		System.out.println("After swapping: ");
		Collections.swap(al, 0, 2);
		
		System.out.println("After converting into array: ");
		al.toArray();
		System.out.println(al);

	}

}
