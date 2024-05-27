package com.demo;

public class CompareToMethod {

	public static void main(String[] args) {
		// compare lexicographically
		//compares the unicode of characters
		
		//if two string content are exactly same -0
		
		String s1="Abha";
		String s2="Biba";
		
		System.out.println(s1.compareTo(s2));//-2
		System.out.println(s2.compareTo(s1));
		
		String s3="Rahul";
		String s4="rahul";
		
		System.out.println(s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));
		

	}

}
