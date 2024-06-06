package com.demo.innerClass;

class Outer
{
	void outerMethod() {
		System.out.println("In outer method");
	}
	class Inner
	{
		void msg() 
		{
			System.out.println("In inner method");
		}
		static void show()
		{
			System.out.println("In static inner method");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer o1=new Outer();
		o1.outerMethod();
		
		Outer.Inner i1=o1.new Inner();
		i1.msg();
		
		Outer.Inner i2=new Outer().new Inner();
		i2.msg();
		
		Outer.Inner.show();
	}

}
