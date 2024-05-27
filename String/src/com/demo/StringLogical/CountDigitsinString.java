package com.demo.StringLogical;

public class CountDigitsinString {
	
	static int findCount(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		
		for(char c: ch)
		{
			if(c>=48 && c<=57)//here we are considering ascii value of digit and thats why written in char
			{
				count++;
			}
		}
		return count;
	}
	//or u can solve by this method also
	
	static int findCount2(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(0)))
			{
				count++;
			}
		}
		return count;
	}
	
		
	public static void main(String[] args) {
		String str="Programming123is45fun8";
		System.out.println(str);
		
		System.out.println("No of digits are: "+findCount(str));
		System.out.println(str);
		
		System.out.println("No of digits are: "+findCount2(str));
		System.out.println(str);

	}

}
