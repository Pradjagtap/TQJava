package com.demo;
import java.util.Scanner;

public class JaggedArray {
	
	static void displayMultiarray(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
	
		int jarr[][]= {{1},{2,2},{3,3,3}};
		
		displayMultiarray(jarr);
		
		System.out.println("---------------------------");
		
		int jarr1[][]= new int[3][];
		jarr1[0]= new int [2];
		jarr1[1]= new int [3];
		jarr1[2]= new int [2];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<jarr1.length;i++)
		{			
			System.out.println("enter values of row"+(i+1)+":");
			for(int j=0;j<jarr1[i].length;j++)
			{
				jarr1[i][j]= sc.nextInt();
			}
			
			System.out.println();
		}
		System.out.println("---------------------------");
		
		displayMultiarray(jarr1);
		

	}

}
