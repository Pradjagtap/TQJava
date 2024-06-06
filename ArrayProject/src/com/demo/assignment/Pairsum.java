package com.demo.assignment;
//> Find the pair of elements whose sum is equivalent to the given sum
public class Pairsum {
	
	static void  pairSum(int ar[],int sum)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==sum)
				{
					System.out.println(ar[i]+"+"+ar[j]+"="+sum);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8};
		//int sum=9;
		pairSum(arr,9);

	}

}
