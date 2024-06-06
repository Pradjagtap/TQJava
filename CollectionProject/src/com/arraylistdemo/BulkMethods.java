package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class BulkMethods {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		
		al.add("Shreyash");
		al.add("Akshata");
		al.add("Mandar");
		al.add("Gunjan");
		
		System.out.println(al);
		
		List<String> al2=new ArrayList<>();
		al2.add("Pradnya");
		al2.add("Amruta");
		
		System.out.println(al2);
		
		//al.addAll(al2);
		al.addAll(1, al2);
		System.out.println(al);
		
		ArrayList<String> al3=new ArrayList<>();
		al3.add("Shreyash");
		al3.add("Gunjan");
		al3.add("Anita");
		al3.add("Rahul");
		
		System.out.println(al.contains(al3));
		
		System.out.println(al);
		System.out.println(al3);
		//al.removeAll(al3);// remove all elements which matches al3 and 
	}

}
