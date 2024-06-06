package com.mapDemo.HashmapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Double> smap=new HashMap<>();
		System.out.println(smap.put("Supriya", 89.0));
		System.out.println(smap);
		System.out.println(smap.put("Supriya", 91.0));
		System.out.println(smap);
		smap.put(null, null);
		smap.put("Pradnya", 91.0);
		smap.put("Pravin", 95.9);
		
		smap.put("Amruta", 75.4);
		smap.put("Mandar", 84.1);
		smap.put("Gunjan", 81.2);
		
		System.out.println(smap);
	}

}
