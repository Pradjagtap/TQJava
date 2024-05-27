package com.demo.classobject;

public class Test {
	public void method1() {
		System.out.println("hi I am instance method");
	}
	public void show() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		new Test().method1();
		Test t1=new Test();
		t1.method1();
		t1.show();

	}
       
}
