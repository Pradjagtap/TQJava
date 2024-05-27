package com.demo.overloading;

class Shape
{
	static void area(int side) {
		System.out.println("Area of square: "+(side*side));
	}
	static void area(int length, int breadth)
	{
		System.out.println("Area of rectangle: "+(length*breadth));
	}
	protected static  float area(float radius)
	{
		//System.out.println("Area of circle: "+(3.14*radius*radius));
		return (float) (3.14*radius*radius);
	}
}
public class PolyDemo {

	public static void main(String[] args) {
		//Shape s1=new Shape();
		Shape.area(9);
		System.out.println("Area of circle: "+Shape.area(7.5f));
		Shape.area(6,7);
		System.out.println("--------------");
		PolyDemo.main(90);
		
	}
	//we can overload 
		
	public static void main(int data){
		{
			System.out.println("Overlaod main");
			System.out.println("Data: "+data);
		}
		}
		
		
		
	}


