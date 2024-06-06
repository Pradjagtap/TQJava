package com.linkedListDemo.assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * 1.	WAP to append the specified element to the 
 * end of a linked list.
 */
public class Task1 {

	public static void main(String[] args) {
		LinkedList<String> std = new LinkedList<>();
		std.add("Pradnya");
		std.add("Snehal");
		std.add("Sushma");

		System.out.println(std);
		std.addLast("Komal");
		System.out.println("Append element to the last: ");
		System.out.println(std);
		System.out.println("--------------------");

		// 2.WAP to iterate through all elements in a linked list.

		for (String s : std) {
			System.out.println(s);
		}
		System.out.println("--------------------");

//3.WAP to iterate through all elements in a linked list starting 
//		at the specified position.

		for (int i = 2; i < std.size(); i++) {
			System.out.println(std.get(i));
		}
		System.out.println("--------------------");

//4.	WAP to iterate a linked list in reverse order.

		ListIterator<String> itr = std.listIterator(std.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println("--------------------");

//5.	WAP to insert the specified element at the specified position
		// in the linked list.

		std.add(2, "Vaishu");
		System.out.println(std);

		System.out.println("--------------------");
//6.	WAP to insert elements into the linked list at the first 
		// and last position.
		std.addFirst("Avinash");
		std.addLast("Sujan");
		System.out.println(std);
		System.out.println("--------------------");
//7.	WAP to insert the specified element at the front of a linked 
		// list.
		std.addFirst("Sneha");
		System.out.println(std);
		System.out.println("--------------------");
//8.	WAP to insert the specified element at the end of a linked list.
		std.addLast("Rushika");
		System.out.println(std);
		System.out.println("--------------------");
//9.	WAP to insert some elements at the specified position into a 
		// linked list.
		LinkedList<String> std1 = new LinkedList<>();
		std1.add("Sneha");
		std1.add("Pritam");
		System.out.println(std1);
		std.addAll(2, std1);
		System.out.println(std);
		System.out.println("--------------------");
//10.	WAP to get the first and last occurrence of the specified elements
		// in a linked list.
		System.out.println(std.indexOf("Sneha"));
		System.out.println(std.lastIndexOf("Sneha"));
		
//		System.out.println(std.removeFirstOccurrence("Sneha"));
//		System.out.println(std.removeLastOccurrence("Sneha"));
		
		System.out.println("--------------------");
//11.	WAP to display the elements and their positions in a linked list.
		
		for (int i = 0; i < std.size(); i++) {
			System.out.println(std.get(i)+" position: "+i);
		}
		System.out.println("--------------------");
//12.	WAP to remove a specified element from a linked list.
		System.out.println(std.remove(3));;
		System.out.println(std);
		System.out.println("--------------------");
//13.	WAP to remove first and last element from a linked list.
		std.removeFirst();
		std.removeLast();
		System.out.println(std);
		System.out.println("--------------------");
//14.	WAP to remove all the elements from a linked list.
		std.removeAll(std1);
		
		System.out.println(std);
	}

}
