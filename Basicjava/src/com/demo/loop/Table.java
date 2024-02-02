package com.demo.loop;

import java.util.Scanner;
public class Table {
	public static void table1(int n) {
		int i,res=0,num=1;
		for(i=1;i<=n;i++) {
			res=5*i;
			System.out.println(res);
			
		}
		
	}
				
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter any number: ");
			n=sc.nextInt();
			table1(n);
	}

}
