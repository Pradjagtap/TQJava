package com.demo.assignment;
//6. WAP to split string into 2 tokens where string is “HELLO$WORLD

public class SplitString {
	static void splitString(String str)
	{
		String s[]=str.split("\\$");
		
		String st="";
		for(int i=0;i<s.length;i++)
		{
			st=st+s[i]+" ";
		}
		System.out.println(st);
		
		
		
	}

	public static void main(String[] args) {
		String st="HELLO$WORLD";
		System.out.println(st);
		splitString(st);

	}

}
