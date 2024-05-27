package com.demo.objectpassing;

public class StaticVariable {
	int x=20;//instance variable
	static int y=10;//static variable
	
	//in instance method: can access both static and instance
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
	}
	//in static method: can access only static
	//access instance-we need to create object
	
	static void staticMethod() {
		StaticVariable s=new StaticVariable();
		System.out.println(s.x);
		//System.out.pritln(x);
		System.out.println(y);
	}
	void show() {
		x++;
		y++;
		System.out.println("x");
	}
}
