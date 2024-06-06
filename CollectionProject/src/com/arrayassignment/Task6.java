package com.arrayassignment;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 19.	WAP to match two collections
 * 20.	WAP to check if collection is empty
 */
public class Task6 {

	public static void main(String[] args) {
		ArrayList <String>al = new ArrayList<>();
		al.add("Richa");
		al.add("pradnya");
		al.add("Student");
		al.add("Riya");
		System.out.println(al);
		
		ArrayList <String>al2 = new ArrayList<>();
		al2.add("Richa");
		al2.add("pradnya");
		al2.add("Student");
		//al2.add("Riya");
		System.out.println(al2);
		
		Collections.sort(al);
		Collections.sort(al2);
		
		boolean isEqual=al.equals(al2);
		System.out.println(isEqual);
		System.out.println("------------------");
		System.out.println(al.isEmpty());
		
		
	}

}
