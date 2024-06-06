package com.vectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterate {

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<>();
		v1.add(8);
		v1.add(5);
		v1.add(8);
		v1.add(null);
		v1.add(null);
		v1.add(-34);
		v1.add(23);
		v1.add(82);
		
		//1st way
		System.out.println(v1);
		
		//2nd way
		System.out.println("-------------");
		for(int i=0;i<v1.size();i++) {
			//System.out.println(v1.get(i));
			System.out.println(v1.elementAt(i));
		}
		//3rd way
		
		for (Integer i : v1) {
			System.out.println(i);
		}
		System.out.println("----------------");
		
		//4th way
		Iterator<Integer> itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		System.out.println("----------------");
		
		//5th way
		ListIterator<Integer> litr = v1.listIterator();
			while (litr.hasNext()) {
				System.out.println(litr.next());
			}
		
		//6th way
		System.out.println("----------------");
		
		Enumeration<Integer> en=v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
				
		
	}

	}
}
