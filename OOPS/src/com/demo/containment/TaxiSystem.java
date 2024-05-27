package com.demo.containment;

import java.util.Scanner;

public class TaxiSystem {
	Scanner sc=new Scanner(System.in);
	
	public void enterDetails(Car c,Driver d) {
		System.out.println("Enter car No: ");
		c.setCarno(sc.nextInt());
		
		System.out.println("Enter car Brand: ");
		c.setBrand(sc.next());
		
		System.out.println("Enter car Model: ");
		c.setModel(sc.next());
		
		System.out.println("Enter driver id: ");
		d.setDriverid(sc.nextInt());
		
		System.out.println("Enter driver name: ");
		d.setName(sc.next());
		
		System.out.println("Adhar no of driver: ");
		d.setAdharno(sc.nextInt());
		
		System.out.println("Salary: ");
		d.setSalary(sc.nextDouble());
	}
		
	
	
	public static void main(String[] args) {
		TaxiSystem t1= new TaxiSystem ();
		
		Car c1= new Car();
		Driver d1=new Driver();
		t1.enterDetails(c1,d1);
		
		System.out.println(c1);
		System.out.println(d1);
		
		Car c2= new Car();
		Driver d2=new Driver();
		t1.enterDetails(c2,d2);
		System.out.println(c2);
		System.out.println(d2);
		
			
		}
			

	}


