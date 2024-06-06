package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	static void reverseList(List<String> list) {
		for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
			String temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		
		al.add("Shreyash");
		al.add("Akshata");
		al.add("Mandar");
		al.add("Gunjan");
		al.add("Pradnya");
		al.add("Harshit");
		
		System.out.println(al);
		reverseList(al);
		System.out.println("After sorting: "+al);
		
	}

}
