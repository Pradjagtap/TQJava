package com.demo.assignment;
import java.util.Scanner;

public class Automorphic {
	public static void automorphicNumber(int n) {
		int m=0,q;
		q=n*n;
		
		while(n!=0) {
			int d,d1;
			d=n%10;
			d1=q%10;
			if(d1!=d)
				m=1;
			n=n/10;
			q=q/10;
		}
		if(m==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	/*19.	check no is automorphic or not
	input n=25
			  output Automorphic
			as 25*25=625*/


	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		automorphicNumber(n);

	}

}
