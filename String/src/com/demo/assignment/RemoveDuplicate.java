package com.demo.assignment;
//. WAP to remove all the duplicate words from a string
public class RemoveDuplicate {
	static void removeDuplicate(String str)
	{
		int count;
		String s[]=str.split("\\s");
		boolean flag;
		for(int i=0;i<s.length;i++)
		{
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--)
			{
				if(s[i]!=null && s[i].equalsIgnoreCase(s[j]))
				{
					flag=true;
					break;
				}
			}
			
				if(flag==false)
				{
					for(int k=i+1;k<s.length;k++)
					{
						if(s[i]!=null && s[i].equalsIgnoreCase(s[k]))
						{
							count++;
							s[k]=null;
							break;
						}
				}
				}
				if(s[i]!=null)
				{
					System.out.println(" After removing duplicate..."+s[i]);
		}
					
		}
		
	}
	
	

	public static void main(String[] args) {
		String st="I like java and I like python";
		System.out.println(st);
		removeDuplicate(st);
		
		

	}

}


