package com.demo.staticInner;

class Outer
{
	static int value=10;
	String msg="Hello";
	
	void display()
	{
		System.out.println("Value: "+value);
		System.out.println("Message: "+msg);
	}
	static class Inner
	{
		static int data=100;
		String msg1="Welcome";
		
		void show() {
			System.out.println("Value: "+value);
//			System.out.println("Message from outer: "+msg);
//			display();
			
			System.out.println("Data: "+data);
			System.out.println("Inner message: "+msg1);
			
			Outer o1=new Outer();
			System.out.println("Message from Outer: "+o1.msg);
			o1.display();
		}
		static void print()
		{
			System.out.println("Static inner");
		}
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//Outer.Inner i1=new Outer().new Inner();
		
		Outer.Inner i1=new Outer.Inner();
		i1.show();
		
		Outer.Inner.print();
	}

}
