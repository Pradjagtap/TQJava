package com.demo.inherit;

import com.demo.inheritance.AccessDemo;

public class Demo3 extends AccessDemo{
	private int a;
	int b;
	protected int c;
	public int d;

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		//obj.a=100; not accessible
		//obj.b=100; not accessible
		//obj.c=100; not accessible
		obj.d=100;
		
//		obj.show();
//		obj.display();
//		obj.printMe();
		obj.test();
		
		Demo3 obj1=new Demo3();
		//obj.a=100 //private is not accessible
		obj1.b=100;//default is not accessible
		obj1.c=100;
		obj1.d=100;
		
//		obj1.show();
//		obj1.display();
		obj1.printMe();
		obj.test();
		

	}

}
