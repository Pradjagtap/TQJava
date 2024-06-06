package com.linkedListDemo.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList<String> fruits=new LinkedList<>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pinapple");
		fruits.add("Watermelon");
		fruits.add("Orange");

		System.out.println(fruits);
//		for(String s:fruits) {
//			System.out.println(s);
//		}
		

		LinkedList<String> fruits1=new LinkedList<>();
		
		fruits1.add("Banana");
		fruits1.add("Peach");
		

		System.out.println(fruits1);
//		for(String s:fruits1) {
//			System.out.println(s);
//		}
//		
		
		System.out.println("---------------------------------");
//1.WAP to shuffle the elements in a linked list.
		Collections.shuffle(fruits);
		
		for(String s:fruits) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
//2.WAP to join two linked lists.
		fruits.addAll(fruits1);
		
		for(String s:fruits) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		System.out.println("======");
//3.WAP to clone a linked list to another linked list.
		LinkedList<String> l1=new LinkedList<String> ();
		System.out.println(fruits.clone());
		l1.addAll((Collection<? extends String>) fruits.clone());
		
		System.out.println("---------------------------------");

		//4.	WAP to remove and return the first element of a linked list.
		System.out.println(fruits.removeFirst());
		
		System.out.println(fruits);
		
		System.out.println("---------------------------------");
//5.WAP to retrieve but does not remove, the first element of a linked list.
		System.out.println(fruits.peek());
		System.out.println(fruits);

		System.out.println("---------------------------------");
//6.WAP to retrieve but does not remove, the last element of a linked list.
		System.out.println(fruits.peekLast());
		
		  for(String s:fruits) {
			   System.out.println(s);
		}
		System.out.println("---------------------------------");
//7.WAP to check if a particular element exists in a linked list.
	System.out.println(fruits.contains("Orange"));
	
	    for(String s:fruits) {
		   System.out.println(s);
	}
	 
	   System.out.println("---------------------------------");
//8.WAP to convert a linked list to array list.
	   
	   ArrayList<String> ar=new ArrayList<String>(fruits);
	   System.out.println(ar);
	    
	   
	   System.out.println("---------------------------------");
//9.WAP to compare two linked lists.
	   
	   System.out.println(fruits.containsAll(fruits1));
	   //System.out.println(fruits.equals(fruits1));
	   
	   System.out.println("---------------------------------");

//10.WAP to test a linked list is empty or not.	
	System.out.println(fruits.isEmpty());
	
	
	  System.out.println("---------------------------------");
//11.WAP to replace an element in a linked list.
	  
	  System.out.println(fruits1.set(0, "papaya"));
	  System.out.println(fruits1);
	}
	

}