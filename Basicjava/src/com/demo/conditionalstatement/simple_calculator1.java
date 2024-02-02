package com.demo.conditionalstatement;

import java.util.Scanner;

public class simple_calculator1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double num1,num2,add,subtract,multiply,divide;
		char op;
		System.out.println("Enter a: ");
		num1=sc.nextDouble();
		System.out.println("Enter b: ");
		num2=sc.nextDouble();
		
		add=num1+num2;
		subtract=num1-num2;
		multiply=num1*num2;
		divide=num1/num2;
		
		System.out.println("Enter sign ");
		op=sc.next().charAt(0);
		System.out.println("Enter an operator ");
		
		if(op=='+') {
			System.out.println("Addition of a and b is "+add);
		}
		else if(op=='-') {
			System.out.println("Subtraction of a and b is "+subtract);
		}
		else if(op=='*') {
			System.out.println("Multiplication of a and b is "+multiply);
		}
		else if(op=='/') {
			System.out.println("Division of a and b is "+divide);
		}
			
			
		}
		
			
		}
		
	


