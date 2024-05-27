//package com.demo.abstractmathod;
//
//abstract class Vehicle{
//	private int wheels;
//	private String colors;
//	static int cap;
//	
//	static
//	{
//		System.out.println("capacity is: "+6+"person");
//	}
//	Vehicle(){
//		
//	}
//	Vehicle(int wheels, String colors,int cap){
//		this.wheels=wheels;
//		this.colors=colors;
//		this.cap=cap;
//	}
//	public int getWheels() {
//		return wheels;
//	}
//	public void setWheels(int wheels) {
//		this.wheels = wheels;
//	}
//	public String getColors() {
//		return colors;
//	}
//	public void setColors(String colors) {
//		this.colors = colors;
//	}
//	public static int getCap() {
//		return cap;
//	}
//	public static void setCap(int cap) {
//		Vehicle.cap = cap;
//	}
//	abstract void mileage();
//	
//	public String toString() {
//		return "wheels"+wheels+"colors"+colors+"capacity"+cap;
//	}
//	
//	
//}
//abstract class Car extends Vehicle{
//	private static Object accessories1;
//	private String accessories;
//	
//	public Car() {
//		
//	}
//	public Car(int wheels, String colors,int cap,String accessoris) {
//		super(wheels,colors,cap,accessories1);
//		this.accessories1=accessoris;
//	}
//}
//public class Vehicle_example {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
