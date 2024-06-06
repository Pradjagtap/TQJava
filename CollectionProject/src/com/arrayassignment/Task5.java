package com.arrayassignment;

import java.util.ArrayList;
import java.util.Iterator;

//18.	WAP to add 1 to 50 numbers in ArrayList and print 
//only even numbers (using iterator)
public class Task5 {

	public static void main(String[] args) {
		ArrayList <Integer>al2 = new ArrayList<>();
		
		Iterator<Integer> itr = al2.iterator();
		
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
