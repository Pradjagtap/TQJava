package com.demo.assignment;

import java.util.Arrays;

//4. WAP to make the first character of every word 
//in a string as capital
public class CapitalizeEachWord {

	static void capitalizeEachWord(String str)
	{
		String s[]=str.split(" ");
				
		for(int i=0;i<s.length;i++)
		{
			if(!s[i].isEmpty())
			{
				s[i]=s[i].substring(0,1).toUpperCase()+s[i].substring(1);
				
			}
			
			
		}
		System.out.println(String.join(" ", s));
	}
	static void capitalizeEachWord2(String s)
	{
		String st[]=s.split(" ");
		String str="";
		
		for(int i=0;i<st.length;i++)
		{
			if(st[i].charAt(0)>='A' && st[i].charAt(0)<='Z')
			{
				str=str+st[i];
			}
			if(st[i].charAt(0)>='a' && st[i].charAt(0)<='z')
			{
				str=str+(char)(st[i].charAt(0)-32);
			}
			for(int j=1;j<st[i].length();j++)
			{
				str=str+st[i].charAt(j);
			}
			st[i]=str;
			str=str+" ";
			
		}
		System.out.println(str);
			
	}
	public static void main(String[] args) {
		String st="I like java and i like python";
		System.out.println(st);
		//capitalizeEachWord(st);
		capitalizeEachWord2(st);

	}

}
