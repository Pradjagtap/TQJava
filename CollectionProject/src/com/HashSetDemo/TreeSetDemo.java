package com.HashSetDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<>();
		tset.add("Java");
		tset.add("C++");
		tset.add("HTML");
		//tset.add(null);
		tset.add("Python");
		
		System.out.println(tset);
		
		System.out.println("=========");
		
		Iterator<String> itr=tset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("---------------");
		
		for(String s:tset)
			System.out.println(s);
		
		System.out.println("---------------");
		
		Iterator<String> itr1=tset.descendingIterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		System.out.println("--------------");
		
		NavigableSet<String> nm=tset.descendingSet();
		
		for(String s:nm)
		{
			System.out.println(s);
		}
		Set<String> synchts=Collections.synchronizedSet(tset);
	}

}
