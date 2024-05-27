package com.demo.assignment;
//WAP to find the duplicate and unique words in a string
public class DuplicateUniqueWord {
	
	static void FindDuplicateUnique(String str)
	{
		int count;
		String s[]=str.split("\\s");
		boolean flag=false;
		for(int i=0;i<s.length;i++)
		{
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					flag=true;
					break;
				}
			}
			
				if(flag==false)
				{
					for(int k=i+1;k<s.length;k++)
					{
						if(s[i].equalsIgnoreCase(s[k]))
						{
							count++;
						}
				}
					if(count>1)
					{
						System.out.println("Duplicate: "+s[i]);
					}
					if(count==1)
					{
						System.out.println("Unique: "+s[i]);
					}
			}
		}
	}
	

	public static void main(String[] args) {
		String st="I like java and I like python";
		System.out.println(st);
		FindDuplicateUnique(st);
		

	}

}
