package com.demo.classobject;
/*Write a program to create multiple objects of one type only.
e.g. Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects*/
//calculate the area of rectangle
//area of rectangle=length*breadth

class rectangle{
	int length,breadth;
	
	public void setDetails() {
		length=2;
		breadth=3;
	}
	public void showDetails() {
		System.out.println("length: "+length);
		System.out.println("width: "+breadth);
		
	}
}

	


public class Example_area{

	public static void main(String[] args) {
	  rectangle b1=new rectangle();
		//Scanner sc=new Scanner(System.in);
		int length=0,breadth=0;
		b1.length=2;
		b1.breadth=3;
		b1.setDetails();
		b1.showDetails();
		int area=length*breadth;
		System.out.println("Area of rectangle is "+area);

	}
}


