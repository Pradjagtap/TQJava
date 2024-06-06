package com.demo.varags;
//we cannot override the method having varargs
class Parent
{
	void display(int ...a){
		System.out.println("In parent");
			}
}
class Child extends Parent
{
	@Override
	void display(int ...a)
	{
		System.out.println("In child");
	}
}
public class VaragsOverriding {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.display(6,7,8);

	}

}
