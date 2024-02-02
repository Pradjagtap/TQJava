package com.demo.pattern;
import java.util.Scanner;
public class Pattern10 {
	public static void showPattern(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			//space
			for(k=1;k<=i;k++) {
				System.out.print(" ");
				//k=n-1
			}
			for(j=n;j>=i;j--) {
				System.out.print("* ");
				//System.out.print("*");
				//System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		
		showPattern(n);

	}

}
