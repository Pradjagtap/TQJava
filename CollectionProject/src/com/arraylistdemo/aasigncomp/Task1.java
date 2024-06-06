package com.arraylistdemo.aasigncomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * WAP to sort the elements of List that contains String objects.
 * Print ArrayList.Sort using Collections.sort(list) method. 
 * Print ArrayList
 */
public class Task1  {

	public static void main(String[] args) {
		
		ArrayList <String>al = new ArrayList<>();
		
		al.add("Pradnya");
		al.add("Anita");
		al.add("Amruta");
		al.add("Supriya");
		al.add("Black");
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);;
		System.out.println(al);
		
		
		
	}

}
