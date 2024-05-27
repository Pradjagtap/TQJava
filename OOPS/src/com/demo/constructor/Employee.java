package com.demo.constructor;
//in one class we can have only one default constructor
//default constructor invoked when we call object
//one class can have both constructor default and parameteried
//we can have multiple parameterized constructor with different parameter

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	
	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(int eid) {
		System.out.println("Parameterized constructor");
	}
	public Employee(int eid,String ename) {
		System.out.println("p2");
	}
	//public Employee(int a,String n){ is not possible bcoz int and string parameters are repeating in constructor
}
