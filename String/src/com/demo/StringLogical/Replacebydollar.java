package com.demo.StringLogical;

public class Replacebydollar {
	
	static String replaceV(String s) {
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]=='A'|ch[i]=='E'|ch[i]=='I'|ch[i]=='O'|ch[i]=='U'|ch[i]=='a'|ch[i]=='e'|ch[i]=='i'|ch[i]=='o'|ch[i]=='u')
		{
			ch[i]='$';
		}
		}
		//System.out.println(ch);
		String s1=new String(ch);
		return s1;
	}

	public static void main(String[] args) {
		String str="Programming is fun";
		System.out.println(str);
		
		replaceV(str);
		System.out.println(str);
	}

}
