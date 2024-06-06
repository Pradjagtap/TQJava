package com.linkedHashmapAssign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.mapDemo.HashmapDemo.Item;

/*
 * 1.	WAP to copy a HashMap content to another LinkedHashMap
 */
public class Task1 {

	private static Object Integer;

	public static void main(String[] args) {
	HashMap<String,Double> hmap=new HashMap<>();
	hmap.put("Pradnya", 1.24);
	hmap.put("Pradnyaa", 7.67);
	System.out.println(hmap);
	
	LinkedHashMap<String,Double> lhm=new LinkedHashMap<>(hmap);
	lhm.put("Kiya", 0.56);
	lhm.put("Rani", 56.78);
	System.out.println(lhm);
//2.	WAP to delete all elements from a given LinkedHashMap
	lhm.clear();
	System.out.println(lhm);

//3.	WAP to create a LinkedhashMap with Integer as key and any 
	//other object as value. Now get a key-value mapping associated 
	//with the highest key and the least key in a map	
	
	LinkedHashMap<String,Double> lhm1=new LinkedHashMap<>();
	//ArrayList<Person> persons;
	lhm1.put("Rushikesh", 95.9);
	lhm1.put(null, 0.0);
	lhm1.put("Amruta", 78.5);
	lhm1.put("Pradnya", 85.0);
	lhm1.put("Pooja", 88.0);
	lhm1.put("Mandar", 84.1);
	lhm1.put("Gunjan", 81.2);
	
	System.out.println(lhm1);
	for(Entry<String,Double> e:lhm.entrySet()) {
		System.out.println(e.getKey()+"->"+e.getValue());
	}
	System.out.println("--------------------------");
	//2.	WAP to delete all elements from a given LinkedHashMap
     lhm.remove("Pooja");
	System.out.println(lhm);
	System.out.println("----------------------------------");
	//4.	WAP to create a LinkedHashMap which contains Integers as key and Strings as value.
			//Print the map contents and observe the order. Don’t use generics.
			Map l1=new LinkedHashMap();
			l1.put(2, "Akash");
			l1.put(1, "Ram");
			l1.put(3, "Shyam");
			l1.put(5, "Sundar");
			l1.put(6, "Sonu");
			
			System.out.println(l1);
			System.out.println("-------------------------");
			//5.	WAP to create a LinkedHashMap which contains Strings as key and Integers as value.
			//Print the map contents and observe the order. Don’t use generics.
			Map l2=new LinkedHashMap();
			l2.put( "Akash",2);
			l2.put( "Ram",1);
			l2.put( "Shyam",3);
			l2.put( "Sundar",5);
			l2.put( "Sonu",6);
			
			System.out.println(l2);
			
				
	}

}
