package com.linkedListDemo.assignment;

import java.util.Collections;
import java.util.LinkedList;

public class Task2 {

	public static void main(String[] args) {
		LinkedList<Integer> in= new LinkedList<>();
		in.add(89);
		in.add(79);
		in.add(69);
		in.add(59);
		in.add(49);
		System.out.println(in);
		//1.	WAP to shuffle the elements in a linked list.
		
		Collections.shuffle(in);
		System.out.println(in);
		System.out.println("----------------------");
		
		//2.	WAP to join two linked lists.
		LinkedList<Integer> in1= new LinkedList<>();
		in1.add(67);
		in1.add(78);
		System.out.println(in1);
		
		System.out.println(in.addAll(in1));;
		System.out.println(in);
		System.out.println("----------------------");
		
		//3.	WAP to clone a linked list to another linked list.
		System.out.println(in);
		System.out.println(in.clone());
		System.out.println("----------------------");
		
		//4.	WAP to remove and return the first element of a 
		//linked list.
		System.out.println(in.remove(0));
		in.add(0, 67);
		System.out.println(in);
		

	}

}
