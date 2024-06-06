package com.demo.varags;

public class VaragsWrapper {
	//promoted to parent class
	
	public static void display(Object ...s)
	{
		System.out.println("In object");
		for(Object st:s)
		{
			System.out.println(st);
		}
	}
	public static void display(Number ...s)
	{
		System.out.println("in number");
		for(Number st:s)
		{
			System.out.println(st);
		}
	}
	
	public static void display(Double...s)
	{
		System.out.println("in double");
		for(Double st:s)
		{
			System.out.println(st);
		}
	}
	public static void display(Integer...s)
	{
		System.out.println("in int");
		for(Integer st:s)
		{
			System.out.println(st);
		}
	}
	
	public static void main(String[] args) {
		display(7.8f,6.7f);//float:number:object
		display('A','B','C');

	}

}
