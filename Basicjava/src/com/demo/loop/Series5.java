package com.demo.loop;
import java.util.Scanner;

/*Write a program to print first 20 numbers of following series 

1 2 3 3  7  5 15  9 31  17  63 33 127 65 //series 3 */
public class Series5 {
	public static void series1(int n) {
		int i,num=1;
		for(i=1;i<=10;i++) {
			num=num+num+1;
			System.out.println(num);
			
		}
	}
	public static void series2(int n1) {
		int i,num1=2;
		for(i=1;i<=10;i++) {
			System.out.println(num1);
			num1=num1+num1-1;
			
			
		}
	}
	public static void series3(int n2) {
		int i,num=1,num1=2,num2=0;
		for(i=1;i<=10;i++) {
			System.out.println(num);
			num=num+num+1;
			
			System.out.println(num1);
			num1=num1+num1-1;
		
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int n1=0;
		int n2=0;
		
		series1(n);
		series2(n1);
		series3(n2);

	}

}
