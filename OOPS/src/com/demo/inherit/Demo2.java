package com.demo.inherit;

import com.demo.inheritance.AccessDemo;

public class Demo2 {

	private int a;
	int b;
	protected int c;
	public int d;
	
	
	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
//		obj.a=100; not accessible
//		obj.b=100; not accessible
//		obj.c=100; not accessible
		obj.d=100;
		

	}

}
