package com.demo;

public class StringDemo {
	
	public static void main(String[] args) {
		String s1="java";
		//System.out.println(s1.length());//4//doesnt end with '\0'
		
		System.out.println(s1.hashCode());
		
		String s2="java";
		System.out.println(s2.hashCode());
		
		String s3=new String("java");//id is different
		
		System.out.println(s3.hashCode());
		
		char ch1[]= {'j','a','v','a'};
		char ch2[]={'j','a','v','a'};
		
		System.out.println(ch1.hashCode());
		System.out.println(ch2.hashCode());
		
		String s4=new String(ch1);
		System.out.println(s4.hashCode());
	
	
	}

}
