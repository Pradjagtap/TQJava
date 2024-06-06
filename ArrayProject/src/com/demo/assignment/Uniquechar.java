package com.demo.assignment;
//5>> Find the unique elements from char array
//6>> Find frequency of each element from char array
public class Uniquechar {

	static void findUniqueChar(char ch[])
	{
		int count;
		boolean status;
		
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			status=false;
			//check if the element is new 
			for(int j=i-1;j>=0;j--)
			{
				if(ch[i]==ch[j])
				{
					status=true;
					break;
				}
			
			}
			if(status==false)
			{
				for(int k=i+1;k<ch.length;k++)
				{
					if(ch[i]==ch[k])
						count++;
				}
				
				if(count==1)
				System.out.println("Unique character is: ");	
				System.out.println(ch[i]);
				System.out.println(ch[i]+"-->"+count);
			}
		}
	}
	public static void main(String[] args) {
		
		char arr[]= {'a','b','c','a','b'};
		
		findUniqueChar(arr);
		
		
	}

}
