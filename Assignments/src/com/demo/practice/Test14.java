package com.demo.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test14 {

	public static void main(String[] args) {
		List<String>arrayList=new ArrayList<String>();
		
		arrayList.add("a");
		arrayList.add("b");
		
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			arrayList.add("c");
		}

	}

}
