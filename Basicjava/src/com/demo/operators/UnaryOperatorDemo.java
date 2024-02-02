package com.demo.operators;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		//Case 1
		int a=10;
		//a++;//11
		++a;//11
		System.out.println(a);
		
		//Case 2
		int b=20;
		//System.out.println(++b);21
		System.out.println(b++);//20
		System.out.println(b);//21
		
		//Case 3
		int c=30;
		//int d=++c;
		int d=c++;
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
	}

}
