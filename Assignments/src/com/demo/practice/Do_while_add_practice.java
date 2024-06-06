package com.demo.practice;
import java.util.Scanner;

public class Do_while_add_practice {

	public static void add(int a,int b) {
		int add;
		add=a+b;
		char ch;
		System.out.println("add: "+add);
		
	}
	public static void main(String[] args) {
		int a,b;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter a: ");
			a=sc.nextInt();
			System.out.println("Enter b: ");
			b=sc.nextInt();
			add(a,b);
			System.out.println("Do u want to continue? if yes enter Y: ");
			ch=sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
				System.out.println("Thanks");

	}
	
}

