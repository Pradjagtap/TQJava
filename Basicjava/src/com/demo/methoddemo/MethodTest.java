package com.demo.methoddemo;

public class MethodTest {
	//definition
	//without return without parameter
	
	public static void show() {
		System.out.println("Hello world");
	}
	//without return with parameter
		public static void add(int a, int b) {
			int sum=a+b;
			System.out.println("sum: "+sum);
		}
		public static void main(String[] args) { 
			System.out.println("main");
			//method calling
			//by method name
			//method can be use multiple times in program
			//it can be used in multiple block
			//eg if else switch loop
			show();
			show();
			show();
			
			add(10,20);
			add(10,'a');//ascii value(type casting)a=97 97+10=107
			//add(10,"hello");//not possible
			//add(10.5,20.3);//not possible
			
			int x=10,y=2;
			add(x,y);
			

	}

}
