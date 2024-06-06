package com.demo.assignment;

public class Delete {
	
	static void deleteAt(int arr[],int pos)
	{
		for(int i=pos;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		int size=arr.length-1;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int pos=2;
		deleteAt(arr,pos);

	}

}
