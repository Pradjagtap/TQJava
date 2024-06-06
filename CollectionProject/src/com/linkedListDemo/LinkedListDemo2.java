package com.linkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList<String> fruits=new LinkedList<>();
		
		System.out.println(fruits.peek());
		System.out.println(fruits.poll());
		System.out.println(fruits.peekFirst());
		System.out.println(fruits.peekLast());
		
		fruits.addFirst("Apple");
		fruits.add("Mango");
		fruits.add("Gauva");
		fruits.addLast("Grapes");		
		System.out.println(fruits);
		
		System.out.println(fruits.offerFirst("Gauva"));
		System.out.println(fruits);
		System.out.println("--------------------");
		System.out.println(fruits.offerFirst("Banana"));
		System.out.println(fruits);
		System.out.println("--------------------");
		System.out.println(fruits.element());
		System.out.println(fruits);
		System.out.println("--------------------");
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		
		
		System.out.println("--------------------");
		//System.out.println(fruits.remove());
		System.out.println(fruits.remove(2));
		System.out.println(fruits);
		System.out.println(fruits.removeFirst());
		System.out.println(fruits);
		

	}

}
