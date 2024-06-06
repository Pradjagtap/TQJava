package com.mapDemo.HashmapDemo;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Double> lhm=new LinkedHashMap<>(16,0.75f,true);
		
		lhm.put("Pradnya",95.9);
		lhm.put(null, 0.0);
		lhm.put("Amruta",75.9);
		lhm.put("Pradnya2",86.9);
		lhm.put("Pooja",87.7);
		lhm.put("Mandar",84.9);
		lhm.put("Gunjan",81.6);
		
		for(Entry<String,Double> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		System.out.println("------------");
		System.out.println("Marks of pooja: "+lhm.get("pooja"));
		
		System.out.println("-----------------");
		
		for(Entry<String,Double> e:lhm.entrySet())
		{
			
		}
		
	}
	
	

}
