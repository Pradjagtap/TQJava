package com.demo.classobject;

	class Testsquare
	{
		double side;
		public void area(){
			System.out.println(side*side);
			
		}
	}
public class Practice_code {

	public static void main(String[] args) {
		Testsquare sq=new Testsquare();
		sq.area();
		System.out.println(sq.side);
		

	}

}
