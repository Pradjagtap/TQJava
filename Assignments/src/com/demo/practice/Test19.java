package com.demo.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap obj=new HashMap();
//		obj.put("A", new Integer(1));
//		obj.put("B", new Integer(2));
//		obj.put("C", new Integer(3));
//		System.out.println(obj.keySet());
		
		Map<Integer,Object> sampleMap=new TreeMap<Integer,Object>();
		sampleMap.put(1, null);
		sampleMap.put(5, null);
		sampleMap.put(3, null);
		sampleMap.put(2, null);
		sampleMap.put(4, null);
		System.out.println(sampleMap);
		
		
	}

}
