package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<>();
		
		elist.add(new Employee(101, "Anita",15000));
		elist.add(new Employee(103, "Amruta",15000));
		elist.add(new Employee(104, "Pradnya",15000));
		elist.add(new Employee(102, "Mandar",15000));
		elist.add(new Employee(107, "Riya",15000));
		elist.add(new Employee(105, "Supriya",15000));
		elist.add(new Employee(106, "Gunjan",15000));
		
		for(Employee e: elist)
		{
			System.out.println(e);
		}
		System.out.println("-----------------");
		
		//Collections.sort(elist,new EmployeeSalaryComparator());
		Collections.sort(elist,Collections.reverseOrder(new EmployeeSalaryComparator()));
		
		for(Employee e: elist)
		{
			System.out.println(e);
		}
		
	
	
	
	}

}
