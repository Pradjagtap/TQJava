package com.demo.loop;
import java.util.Scanner;

public class Do_while_calculator {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int divide(int a,int b) {
		return a/b;
	}
	public static int modulo(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2,ans=0;
		char ch;
		do {
			System.out.println("Enter n1: ");
			n1=sc.nextInt();
			System.out.println("Enter n2: ");
			n2=sc.nextInt();
			
			System.out.println("-----Simple Cal-----");
			System.out.println("1.add\n2.sub\n3.multiply\n4.divide\n5.modulo");
			System.out.println("Enter char: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: 
				ans=add(n1,n2);
				break;
			case 2:
				ans=sub(n1,n2);
				break;
			case 3:
				ans=multiply(n1,n2);
				break;
			case 4: 
				ans=divide(n1,n2);
				break;
			case 5:
				ans=modulo(n1,n2);
				break;
				default:
					System.out.println("invalid input");
			}
			System.out.println("ans: "+ans);
			System.out.println("Do you want to continue? if yes enter y: ");
			ch=sc.next().charAt(0);
		
		}while(ch=='Y' || ch=='y');
		System.out.println("Thank you");
	}
	

			

	}


