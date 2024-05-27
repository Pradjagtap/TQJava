package com.demo.wordslogical;

public class DuplicateAndUnique {
	static void duplicate(String st)
	{
		String []s=st.split("\\s");
		int count;
		boolean status;
		
		for(int i=0;i<s.length;i++)
		{
			count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--) {
				if(s[i].equalsIgnoreCase(s[j]))
				{
					status=true;
					break;
				}
			}
			if(!status)
			{
				for(int k=i+1;k<s.length;k++)
				{
					
					if(s[k].equalsIgnoreCase(s[i]))
						count++;
					}
				//System.out.println(s[i]+"-->"+count);
				if(count>1)
				{
					System.out.println(s[i]+" is duplicate");
				}
				
				if(count==1)
				{
					System.out.println(s[i]+" is unique");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		String st="Java is fun and I like to learn java";
		System.out.println(st);
		
		duplicate(st);
		

	}

}
