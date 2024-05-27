package com.demo.wordslogical;

import java.util.Arrays;

public class SplitString {
	static void divideString(String s,int noOfc)
	{
		int len=s.length();
		int ns=len/noOfc;//ns-no of substrings
		if(len%noOfc!=0)
		{
			System.out.println("cannot divide in equal parts..");
		}
		else
		{
			String spltstr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i+=noOfc)
			{
				spltstr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(spltstr));
		}
	}
	
	static void divideStringaddHash(String s,int noOfc)
	{
		int len=s.length();
		if(len%noOfc!=0)
		{
			//remaining characters
			int x=noOfc-(len%noOfc);
			for(int i=0;i<x;i++)
			{
				s=s+"#";
				//s=s.concat("#");
				}
		}
		System.out.println(s);
		
		len=s.length();
		int ns=len/noOfc;
		
		String spltstr[]=new String[ns];
		int index=0;
		for(int i=0;i<s.length();i+=noOfc)
		{
			spltstr[index]=s.substring(i,i+noOfc);
			index++;
		}
		System.out.println(Arrays.toString(spltstr));
		}
		
		
		
		
	
	public static void main(String[] args) {
		String arr[]= {"I","am","very","smart"};
		
		System.out.println(Arrays.toString(arr));
		String st=String.join("",arr);
		//System.out.println(st);
		
		int noOfChars=5;
		//int noOfChars=3;
		
		divideString(st,noOfChars);
		
		divideStringaddHash(st,noOfChars);
		
		
	}

}
