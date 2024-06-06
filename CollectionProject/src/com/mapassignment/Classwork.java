package com.mapassignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/*
 * 1.WAP to add elements to a HashMap without using generics 
 * (ie do not use <>) and print content of it. Use Integer as Key 
 * and String as Value. In second HashMap add elements of String type 
 * as Key and Integer as Value
 * 2.	WAP add elements to HashMap without using generics, 
 * 0th location use String as key and Integer as value,
 *  on 1st location use String as key String and Integer as 
 *  value.
 *  3.	WAP to add elements to a HashMap using generics with
 *   Integer as Key and String as value. And 4 key-value Map.
 *   Entry
 *   4.	WAP to create a map using Wrapper class as key and value same as 
 *   keys’ data type WAP to count the number of key-value (size) 
 *   mappings in a map.
 *  
 *  
 */
public class Classwork {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "Pradnya");
		hm.put(2, "Supriya");
		hm.put(3, "Amruta");
		
		System.out.println(hm);
		
		HashMap hm1=new HashMap();
		hm1.put("Pradnya",1);
		hm1.put("Supriya", 2);
		hm1.put("Amruta",3);
		
		System.out.println(hm1);
		hm1.put("Rohit", 5);
		System.out.println(hm1);
		
		HashMap<Integer,String> hm2=new HashMap<>();
		hm2.put(1, "Pradnya");
		hm2.put(2, "Supriya");
		hm2.put(3, "Amruta");
		hm2.put(4, "Ashwini");
		
		System.out.println(hm2);
		System.out.println(hm2.size());;
		
		// 5.	WAP to get all the entries from a HashMap. Iterate the 
		//entries 
		 //and print the Key & Value values
		Set<Entry<Integer,String>> entries=hm2.entrySet();
		for(Entry<Integer,String> e:entries)
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		System.out.println("-------------");
		 //6.	WAP to get only the Keys from a HashMap
		Set<Integer> keys=hm2.keySet();
		Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext())
		{
			Integer k=itr.next();
			System.out.println(k+" :"+hm.get(k));
		}
		//7.	WAP to get only the Values from a HashMap
		Collection<String> pins=hm2.values();
		for(String i:pins)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------");
	}

}
