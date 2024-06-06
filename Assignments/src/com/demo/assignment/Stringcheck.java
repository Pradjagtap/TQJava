package com.demo.assignment;

public class Stringcheck {
		static void capitalizeEachWord(String s) {
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
		String s="i love my country india";
		System.out.println(s);
		
		capitalizeEachWord(s);
	}

}
