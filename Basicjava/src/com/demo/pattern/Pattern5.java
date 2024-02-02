package com.demo.pattern;
import java.util.*;
public class Pattern5 {

	public static void printPattern(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
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
/*1 2 3 4 5
1 2 3 4
1 2 3
1 2
1*/
