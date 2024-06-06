package com.HashSetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(12);
		ts.add(67);
		ts.add(76);
		ts.add(89);
		//ts.add(null);
		//duplicate not allowed
		
		//sortedSet
		System.out.println(ts);
		System.out.println("First: "+ts.first());
		System.out.println("Last: "+ts.last());
		
		System.out.println(ts.headSet(64));//64 is not included
		System.out.println(ts.tailSet(64));//64 is included
		SortedSet<Integer> s1=ts.subSet(12, 78);
		System.out.println(s1);
		
		//Navigableset
		System.out.println("Lower: "+ts.lower(64));
		System.out.println("Floor: "+ts.floor(64));
		
		System.out.println("Higher: "+ts.higher(64));
		System.out.println("Ceiling: "+ts.ceiling(64));
		System.out.println(ts.headSet(64,true));
		System.out.println(ts.tailSet(64,false));
		System.out.println(ts.subSet(12, true,78,true));
		
			
	}

}
