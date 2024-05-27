package com.demo.inheritance;

public class Demo1 {
	private int a;
	int b;
	protected int c;
	public int d;

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		//obj.a=100; not accessible
		obj.b=100;
		obj.c=100;
		obj.d=100;

	}

}
