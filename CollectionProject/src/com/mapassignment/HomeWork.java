package com.mapassignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * 1.	WAP to copy all of the mappings from the specified HashMap to
 *  another map
 */
public class HomeWork {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Pradnya");
		hm.put(2, "Supriya");
		hm.put(3, "Amruta");
		hm.put(4, "Ashwini");

		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(5, "Pritam");
		hm1.put(6, "Komal");
		hm1.put(7, "Karishma");
		hm1.put(8, "Snehal");

		hm.putAll(hm1);
		System.out.println(hm);
		System.out.println("----------------------------");
		// 2. WAP to test a HashMap is empty or not

		System.out.println(hm.isEmpty());
		System.out.println("------------------------------");

		// 3.WAP to test if a HashMap contains a mapping for the
		// specified key
		System.out.println(hm.containsKey(1));
//4.	WAP to search for an element from HashMap using key

		System.out.println(hm.get(2));

//5.	WAP to test if a HashMap contains a mapping for the specified value

		System.out.println(hm.containsValue("Karishma"));

//6.	WAP to remove an element from HashMap using key

		System.out.println(hm.remove(3));
		System.out.println(hm);
		System.out.println("----------------------------");

// 7. WAP to empty Map. (Hint - Get keys and iterate through the 
		//keys to remove entries from Map)
		
		Set<Integer> keys=hm.keySet();
		Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext())
		{	
			for(int k=5;k<hm.size();k++) {
				k=itr.next();
				System.out.println(hm.remove(k));
				System.out.println(k+" :"+hm.get(k));
			}
			
			
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
