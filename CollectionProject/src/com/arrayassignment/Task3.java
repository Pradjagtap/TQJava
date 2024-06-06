package com.arrayassignment;

import java.util.ArrayList;

/*
 * 8.	WAP to remove element from ArrayList
 * 9.	WAP to remove all elements from ArrayList
 * 10.	WAP to retain all elements from ArrayList
 * 11.	WAP to know how many elements in ArrayList
 * 12.	WAP to test an ArrayList is empty or not
 * 13.	WAP to empty ArrayList
 */
public class Task3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Blue");
		al.add("Red");
		al.add("White");
		al.add("Black");
		al.add("Purple");
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Pen");
		al2.add("paper");
		al2.add("Scissor");
		al2.add("Black");
		System.out.println(al2);
		System.out.println(al2.size());
		
		System.out.println("-----------");
		
		System.out.println(al2.isEmpty());
		//to empty arraylist
//		al2.clear();
//		System.out.println(al2);
		al.remove(1);
		System.out.println(al);
		System.out.println("-------------------");
		al.retainAll(al2);
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al);
		al.removeAll(al2);
		System.out.println(al);
		
		}

}
