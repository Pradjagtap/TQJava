package com.demo.pattern;
import java.util.*;
public class Pattern3 {
	public static void printPattern(int rows) {
		int i,j;
		
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=0;
		System.out.println("Enter no of rows: ");
		rows=sc.nextInt();
		printPattern(rows);
		

	}

}
/* 1
22
333
4444
55555*/
