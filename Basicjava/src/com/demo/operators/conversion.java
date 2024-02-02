package com.demo.operators;

public class conversion {

	public static void main(String[] args) {
		int a=10;
		float f=a;//converting int to float(implicit casting)
		System.out.println("float"+f);
		
		float f1=23.4f;
		int x=(int)f1; //converting from float to int (explicit casting)
		System.out.println("x..."+x);
		
		float f2=45.4f;
		
		float d=(float)56.7f;//converting double to float (explicit)
		
		double d2=89.90;
		
		int x2=(int)d2;//converting double to int(explicit)
		System.out.println("x2...."+x2);
		
		char ch='G';
		int i=ch; //converting char to int(implicit)
		System.out.println(i);
		
		int a1=69;//converting int to char (explicit)
		char ch1=(char)a1;
		System.out.println(ch1);
		

	}

}
