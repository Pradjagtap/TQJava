package com.HashSetDemoAssign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCW {

	public static void main(String[] args) {
//1.WAP to create a HashSet with Integer objects without using generics
		HashSet set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);

		System.out.println("Size of the HashSet: " + set.size());
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========================================");

//2.WAP to create a HashSet with some colors (String) using generics      

		HashSet<String> hs = new HashSet<>();
		hs.add("Green");
		hs.add("Blue");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("White");

		System.out.println(hs);

		System.out.println("========================================");

//3.WAP to create a HashSet from an ArrayList

		ArrayList<String> alist = new ArrayList<>();
		alist.add("C++");
		alist.add("Java");
		alist.add("C");
		alist.add("Python");
		alist.add("SQL");

		HashSet<String> HashSet = new HashSet<>(alist);
		for (String s : HashSet) {
			System.out.println(s);
		}

		System.out.println("========================================");

		/*
		 * 4.WAP to iterate through all elements in a HashSet and print the elements.
		 * Observe the order of elements
		 */

		HashSet<String> HashSet1 = new HashSet<>();
		HashSet1.add("Banana");
		HashSet1.add("Cherry");
		HashSet1.add("Date");

		Iterator<String> iterator = HashSet1.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		System.out.println("========================================");

//5.WAP to get the number of elements in a HashSet.	          
		int size = HashSet1.size();

		System.out.println("Number of elements in the HashSet: " + size);

		System.out.println("========================================");

//6.WAP to empty a HashSet.

		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Java");
		hs1.add("C++");
		hs1.add("SQL");
		hs1.add("HTML");

		System.out.println(hs1);

		System.out.println("Original HashSet: " + hs1);
		hs1.clear();
		System.out.println("Empty HashSet: " + hs1);

		System.out.println("========================================");
//7.WAP to test if a HashSet is empty or not.

		System.out.println(hs1.isEmpty());

		System.out.println("========================================");

//8.Do all above assignments using LinkedHashSet

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Red");
		lhs.add("Green");
		lhs.add("Blue");
		System.out.println(lhs.add("Blue"));
		lhs.add(null);
		lhs.add("Purple");

		System.out.println(lhs);

		Iterator<String> itr1 = lhs.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("========================================");

//9.WAP to create a TreeSet from a HashSet.			
		Set<String> hset = new HashSet<>();
		hset.add("Pradnya");
		hset.add("Neha");
		hset.add("Raj");
		hset.add("Kiran");
		hset.add("Usha");

		System.out.println("HashSet: " + hset);
		Set<String> ts = new TreeSet<>();
		ts.addAll(hset);
		System.out.println("TreeSet: " + ts);

		System.out.println("========================================");

//10.WAP to create a new TreeSet, add Strings and print the TreeSet.
//11.WAP to iterate through all elements in a TreeSet.	      
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("C++");
		ts1.add("Angular");
		ts1.add("Java");
		ts1.add("React");
		System.out.println(ts1);

		Iterator<String> it = ts1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("========================================");

// 12.	WAP to get the first and last elements in a TreeSet  
		TreeSet<Integer> ts2 = new TreeSet<>();

		ts2.add(90);
		ts2.add(56);
		ts2.add(78);
		ts2.add(12);
		ts2.add(64);
		ts2.add(80);

		System.out.println(ts2);
		System.out.println("First:" + ts2.first());
		System.out.println("Last:" + ts2.last());

		System.out.println("========================================");
//13.	WAP to get the number of elements in a TreeSet.

		int numberOfElements = ts2.size();

		System.out.println("Number of elements in the TreeSet: " + numberOfElements);

		System.out.println("========================================");
//14.WAP to create a reverse order view of the elements contained in a given TreeSet.

		System.out.println(ts2.descendingSet());

		System.out.println("========================================");

//15.WAP to remove a given element from a TreeSet.	     

		System.out.println(ts2.remove(80));
		System.out.println(ts2);

		System.out.println("========================================");

//16.WAP to retrieve and remove the lowest element of a TreeSet using a single method call. Repeat the same using 2 different method calls.

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(3);

		System.out.println("Original TreeSet: " + treeSet);
		Integer lowestElement = treeSet.pollFirst();

		System.out.println("Lowest element removed: " + lowestElement);
		System.out.println("Updated TreeSet: " + treeSet);

		System.out.println("========================================");

		Integer lowestElement1 = treeSet.first();
		treeSet.remove(lowestElement);

		System.out.println("Lowest element removed: " + lowestElement1);
		System.out.println("Updated TreeSet: " + treeSet);

	}

}
