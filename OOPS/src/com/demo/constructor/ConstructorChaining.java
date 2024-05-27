package com.demo.constructor;

class Demo
{
	int a,b;
	String name;
	
	Demo()
	{
		//this(10,20);
		a=10;
		b=20;
		name="unknown";
		System.out.println("Default constructor");
	}
	Demo(int a,int b)
	{
		this(); //recursive call to constructor
		System.out.println("Param Constructor1...");
		this.a=0;
		this.b=0;
		this.name=null;
	}
	Demo(int a, int b,String name)
	{
		this.a=a;
		this.b=b;
		this.name=name;
	}
	
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);
		
		Demo d2=new Demo(10,20);
		System.out.println(d2);
		
		

	}

}
