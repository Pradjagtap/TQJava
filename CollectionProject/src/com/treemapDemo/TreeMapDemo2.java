package com.treemapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(3, "Java");
		tmap.put(1, "HTML");
		tmap.put(8, "C");
		tmap.put(4, "c++");
		tmap.put(6, "Python");
		tmap.put(4, "Angular");
		
		System.out.println(tmap);
		
		//sorted map
		System.out.println("First key: "+tmap.firstKey());
		System.out.println("Last key: "+tmap.lastKey());
		
		SortedMap<Integer,String> s1=tmap.subMap(3, 6);//3 included and 6 excluded
		System.out.println(s1);
		
		SortedMap<Integer,String> s2=tmap.headMap(3);//entries before 3 and 3 is excluded
		
		System.out.println(s2);
		
		SortedMap<Integer,String> s3=tmap.tailMap(3);//entries after 3 and 3 is included
		
		System.out.println(s3);
		System.out.println("-----------------------");
		
		//Navigable map
		
		System.out.println("Lower key: "+tmap.lowerKey(4));//strictly less
		System.out.println("Floor key: "+tmap.floorKey(4));//less or than equal to
		
		System.out.println("Higher key: "+tmap.higherKey(4));//strictly higher
		System.out.println("Ceiling key: "+tmap.ceilingKey(4));//equal to or greater than
		
		SortedMap<Integer,String> s4=tmap.subMap(3, false,6,true);//3(from) included 
																	//false
		System.out.println(s4);
		SortedMap<Integer,String> s5=tmap.headMap(3,true);//by default: entries before 3 and 
		
		System.out.println(s5);
		
		SortedMap<Integer,String> s6=tmap.tailMap(3,false);//by default: entries after 3
		
		System.out.println(s6);
		
	}

}
