package com.demo.StringLogical;

public class CheckPalindrome {
	
	static boolean checkPalindrome(String s)
	{
		//using temporary string
		System.out.println(s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		return true;
		else
			return false;
		
	}
	static boolean checkPalindrome2(String s)
	{
		//without temporary string
		s=s.toLowerCase();
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String s1="Malaylam";
		if(checkPalindrome2(s1))
		{
			System.out.println(s1+" is palindrome");
		}
		else {
			System.out.println(s1+" is not palindrome");
		}
	}

}
