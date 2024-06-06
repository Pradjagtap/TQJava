package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<>();
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add("Shreyash");
		al.add("Akshata");
		al.add("Mandar");
		al.add("Gunjan");
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		System.out.println(al);
		
		al.add(1,"Harsit");
		System.out.println(al);
		
		System.out.println(al.set(2, "Onkar"));
		System.out.println(al);
		
//		System.out.println(al.set(5, "Amruta"));
//		System.out.println(al);
		
		//contains
		
		System.out.println(al.contains("onkar"));
		System.out.println(al.contains("Pravin"));
		
		System.out.println("----------------");
		System.out.println(al.remove("Onkar"));
		System.out.println(al);
		
		System.out.println(al.remove("Anita"));
		System.out.println(al);
		
		System.out.println("-----------");
		System.out.println(al.remove(1));
		System.out.println(al);
		
		System.out.println("-------------");
		System.out.println(al.add("Pradnya"));
		System.out.println(al);
		//System.out.println(al.add(3,"Supriya"));
		al.add(3,"Supriya");
		System.out.println(al);
	}

}
