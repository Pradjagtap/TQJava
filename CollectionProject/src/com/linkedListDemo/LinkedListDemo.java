package com.linkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> comp=new LinkedList<>();
		
		//System.out.println(comp.getFirst());
		
		System.out.println(comp.peekFirst());
		
		//System.out.println(comp.remove());
		System.out.println(comp.poll());
		
		comp.add("TCS");
		comp.addFirst("HCL");
		System.out.println(comp.offerFirst("Capgemini"));
		comp.add(1,"Dell");
		comp.addLast("Wipro");
		
		System.out.println(comp);
		
		System.out.println(comp.element());
		System.out.println(comp.getFirst());
		
		System.out.println(comp.getLast());
		
		System.out.println("-------------");
		
		System.out.println(comp.remove());
		System.out.println(comp.remove(2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
