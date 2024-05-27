package com.demo.constructor;

import java.util.Scanner;

class Employee2 {
	private int eid;
	private double ebasicsal, pf, hra, da, netsal;
	private String ename, dept;

	Employee2() {
		dept = "Financial";
	}
	Employee2(int eid, String ename, double ebasicsal,String dept){
		this.eid = eid;
		this.ebasicsal = ebasicsal;
		this.ename =ename;
		this.dept=dept;
	}
	
		public void displayDetails() {
		System.out.println("Eid: "+eid);
		System.out.println("Ename: "+ename);
		System.out.println("Ebasicsal: "+ebasicsal);
		System.out.println("Dept: "+dept);
		System.out.println("Pf is: "+pf);
		System.out.println("HRA: "+hra);
		System.out.println("da: "+da);
		System.out.println("netsal: "+netsal);
	}

	public void calculateSal() {
		pf = 0.10 * ebasicsal;
		hra = 0.15 * ebasicsal;
		da = 0.20 * ebasicsal;
		netsal = ebasicsal - pf + da + hra;

	}
}


public class Employee1 {

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(102,"puja",50000,"Financial");
		e1.calculateSal();
		e1.displayDetails();
		
		
	}

}
