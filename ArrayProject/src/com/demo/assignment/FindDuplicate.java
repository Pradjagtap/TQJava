package com.demo.assignment;
//4>> Delete all the duplicate elements from an char array
public class FindDuplicate {
	
	static void findDuplicate(int ar[]) {
		int count;
		boolean status;
		int k;
		for(int i=0;i<ar.length;i++)
		{
			count=1;
			status=false;
			for(int j=i-1;j>=0;j--)
			{
				if(ar[i]==ar[j])
				{
					status=true;
					break;
				}
			}
			if(status==false)
			{
				for(k=i+1;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
						count++;
						ar[k]=0;
					}
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {
		int ar[]= {2,3,5,6,5,4,2,3};
		findDuplicate(ar);

	}

}
