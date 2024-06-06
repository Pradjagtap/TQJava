package com.linkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterate {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Banana");

		// print
		// normal for loop
		// enhanced for loop
		// iterator
		// list iterator : forward
		// list iterator: backward
		
		Iterator<String> itr= fruits.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

