package com.demo.assignment;

import java.util.Scanner;

//1.Write a Java program to find first occurrence of a character in a given string.
public class Occurence {
	static void firstOccurence(String s,char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println(ch+" at index : "+i);
			break;
			}
		}
	}
	static void middleOccurence(String s,char ch)
	{
		int count=0,i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch) {
				count++;
				if(count==2) {
					System.out.println(ch+" at index: "+i);
					break;
				}
			}
		}
	}
	//2.Write a Java program to count occurrences of a character in given string.
	static void countOccurence(String s,char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c) {
					count++;
				}
				}
		System.out.println("Count: "+count);
			}
		
//4.Write a Java program to find duplicate  character in given string.	
	static void duplicateChar(String s,char c)
	{
		int count=1;
		char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
		{
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
				
				if(count>1 ) {
					System.out.println("Duplicate: "+ch[i]+count);
				}
			}
		}
		}
	}
		
			
			   
	public static void main(String[] args) {
		String s="java";
		System.out.println("First occurence of: ");
		firstOccurence(s,'a');
		System.out.println("Middle occurence of: ");
		middleOccurence(s,'a');
		System.out.println("Count of char: ");
		countOccurence(s,'j');
		System.out.println("Duplicate chars: ");
		duplicateChar(s,'j');
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string: ");
//		String s=sc.next();
//		firstOccurence(s,'a');
//		System.out.println("---------------");
//		System.out.println(s.lastIndexOf('a'));
//		System.out.println("--------------");
//		middleOccurence(s,'a');	
//		System.out.println("-------------");
//		countOccurence(s,'j');
//		System.out.println("-------------");
//		duplicateChar(s,'j');
	}

}
