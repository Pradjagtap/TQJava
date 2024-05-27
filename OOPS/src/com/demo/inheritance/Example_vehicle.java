package com.demo.inheritance;
/*
A vehicle has four wheels and a color assigned to it.
A car is a vehicle with a seating capacity of four.
An SUV is a car which has a 800 horsepower engine. Create a model detailing the same.
*/
class Vehicle10 {
	int wheels;
	String color;
	
	Vehicle10(){
		
	}
	Vehicle10(int wheels, String color){
		this.wheels=wheels;
		this.color=color;
	}
	public void setWheels(int wheels) {
		this.wheels=wheels;
	}
	public int getWheels() {
		return wheels;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return " "+wheels+" "+color;
	}
	
}
class Car10 extends Vehicle10 
{
	int seating_cap;
	Car10(){
		
	}
	Car10(int wheels, String color,int seating_cap){
		super(wheels,color);
		this.seating_cap=seating_cap;
	}
	public void setSeating(int seating_cap) {
		this.seating_cap=seating_cap;
	}
	public int getSeating() {
		return seating_cap;
	}
	public String toString() {
		return super.toString()+" "+seating_cap;
	}
	
}
class SUV1 extends Car10
{
	int power;
	SUV1(){
		
	}
	SUV1(int wheels, String color,int seating_cap,int power){
		super(wheels,color,seating_cap);
		this.power=power;
	}
	public void setPower(int power) {
		this.power=power;
	}
	public int getPower() {
		return power;
	}
	public String toString() {
		return super.toString()+"Horsepower engine "+power;
	}
}

public class Example_vehicle {

	public static void main(String[] args) {
		Vehicle10 v1=new Vehicle10();
		v1.setWheels(4);
		v1.setColor("White");
		System.out.println(v1);
		
		Car10 c1=new Car10(4,"White",4);
		System.out.println(c1);
		
		SUV1 s1=new SUV1(4,"White",4,800);
		System.out.println(s1);	
		
		}

}
