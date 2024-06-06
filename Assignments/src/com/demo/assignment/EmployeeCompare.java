package com.demo.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCompare {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1,"Sushma",50000));
		al.add(new Employee(2,"Aniket",60000));
		al.add(new Employee(3,"Sania",50000));
		al.add(new Employee(4,"Dhruv",35000));
		al.add(new Employee(5,"Tejmal",20000));
		
		for(Employee e:al)
		{
			System.out.println(e);
		}
		
		System.out.println("---------------------");
		
		Collections.sort(al);
		
		for(Employee e:al)
		{
			System.out.println(e);
		}
	}

}
