package com.demo.overriding;
/*
 * Create a class Car which has a method displayDetails() whose return type is Car
Now create a class SUV which has overriden displayDetails()
Show the usage of Covariant return type in this code
  */

class Car1
{
	int wheels;
	String color;
	
	Car1(){
		
	}
	Car1(int wheels,String color){
		this.wheels=wheels;
		this.color=color;
	}
	Car1 displayDetails() {
		wheels=4;
		color="White";
		return this;
		
	}
}
	
class SUV extends Car1
{
	int seating_cap;
	
	SUV(){
		
	}
	SUV(int wheels,String color,int seating_cap){
		super(wheels,color);
		this.seating_cap=seating_cap;
	}
	@Override
	SUV displayDetails() {
		seating_cap=6;
		return this;
}
}

public class Car {

	public static void main(String[] args) {
		Car1 c;
		SUV s;
		
		Car1 c1=new Car1();
		c=c1.displayDetails();
		System.out.println(c);
		
		SUV s1=new SUV();
		s=s1.displayDetails();
		System.out.println(s);
	}

}
