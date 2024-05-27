package com.demo.assignment;

import java.util.Arrays;

//5. WAP to find the most repeated word in a string
public class MostRepeated {
	static void mostRepeatedWord(String str)
	{
		String s[]=str.split(" ");
		//int count=0,
		int i;
		//String max1="";
		boolean status;
		int maxcount[]=new int [2];
		int maxindex=0;
		String max1[]=new String[2];
		int index=0;
		for(i=0;i<s.length;i++)
		{
			int count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					status=true;
					break;
				}
			}
			if(status==false)
			{
				for(int k=i+1;k<s.length;k++)
				{
					if(s[i].equalsIgnoreCase(s[k]))
					{
						count++;
					}
				}
//				System.out.println(s[i]);
//				System.out.println(count);
				if(count>1)
				{
					maxcount[index++]=count;
					max1[maxindex++]=s[i];
					
				}
				
			}
				
		}
		System.out.println(Arrays.toString(max1));
		}


	public static void main(String[] args) {
		String st="I like java and I like python";
		System.out.println(st);
		mostRepeatedWord(st);

	}
}


