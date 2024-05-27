package com.demo.interfaceDemo;

/*
 * Create class Fish { String name , int gills  } . Class Fish has method void swim() 
 * which has some default implementation. Create two subclasses of Fish , GoldFish and Whale.
 *  Override swim method in GoldFish by changing access modifier and Override in Whale 
 *  class by changing its return type.
 */
interface Fish{
		
	void swim() ;
	void displayDetails();
}
class Goldfish implements Fish{

	@Override
	public void swim() {
		System.out.println("Goldfish");
		
	}
	public void displayDetails() {
		System.out.println("It is a goldfish");
	}
	
}
class Whale implements Fish{

	@Override
	public void swim() {
		System.out.println("Whale");
		
		}
	public void displayDetails() {
		System.out.println("It is a whale");
	}
}

public class Fish_example {

	public static void main(String[] args) {
		Fish f;
		f=new Goldfish();
		f.swim();
		f.displayDetails();
		
		f=new Whale();
		f.swim();
		f.displayDetails();
	
	}

}
