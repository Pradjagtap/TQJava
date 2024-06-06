package com.demo.example4;

import java.util.Scanner;

public class Company {
	static Scanner sc = new Scanner(System.in);

	static void enterEmployeeDetails(Employee e) {
		System.out.println("Enter employee id: ");

		e.setEid(sc.nextInt());

		System.out.println("Enter employee name: ");
		e.setEname(sc.next());

		System.out.println("Enter employee salary: ");
		e.setSalary(sc.nextDouble());

		e.setDepartment(new Department());
		System.out.println("Enter dept id: ");
		e.getDepartment().setDid(sc.nextInt());
		System.out.println("Enter dept name: ");
		e.getDepartment().setName(sc.next());
		System.out.println("Enter dept location: ");
		e.getDepartment().setLocation(sc.next());
		
		

	}

	static void displayAllEmployees(Employee et[]) {
		for (Employee e : et) {
			System.out.println(e);
		}
	}
	
	

	static void sortbysalary(Employee et[]) {

		Employee etemp = new Employee();
		for (int i = 0; i < et.length; i++) {
			for (int j = i + 1; j < et.length; j++) {
				if (et[i].getSalary() < et[j].getSalary()) {
					etemp = et[i];
					et[i] = et[j];
					et[j] = etemp;

				}
			}

		}
	}

	static void maxSalary(Employee et[]) {
		double max=et[0].getSalary();
		Employee etemp = new Employee();
		String name=et[0].getEname();
		for (int i = 1; i < et.length; i++) {
			
				if(et[i].getSalary()>max) {
					max=et[i].getSalary();
					name=et[i].getEname();
				
				
			}
			
		}
		System.out.println("Max: "+max+"Name: "+name);
		
	}

	
//	static void maxSalary(Employee et[])
//	{
//		double maxsalary=et[0].getSalary();
//		Employee etemp = new Employee();
//		
//		for(Employee e1: et) {
//			if(maxsalary<e1.getSalary())
//			{
//				etemp=e1;
//			}
//		}
//		System.out.println(etemp);
	//		
//		}

	public static void main(String[] args) {
		Employee emp[] = new Employee[2];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			enterEmployeeDetails(emp[i]);
		}
		
		sortbysalary(emp);
		displayAllEmployees(emp);
		maxSalary(emp);
		
		
	}
}
	
	

