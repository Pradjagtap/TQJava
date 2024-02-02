package com.demo.operators;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=10;
		
		System.out.println(a<b && a<c);
		System.out.println(a<b || a<c);
		System.out.println(a==c || a>b);
		System.out.println(a==c || a<b);
		
	}

}
