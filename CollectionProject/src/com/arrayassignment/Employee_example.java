 package com.arrayassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arraylistdemo.Employee;

/*
 * 1.	WAP to create Emp (id,name,sal) object and add 
 * 2objects to ArrayList. Sysout and see both variable 
 * memory space is printed. This is because toString is not 
 * overriden but if you would have done this for Integer then 
 * beautiful output would have been printed.
 * 
 * 2.	Now override toString for earlier assignment and now sysout 
 * and see values are printed
 *  
 * 
 */
public class Employee_example {
	
	public static void main(String[] args) {
		ArrayList <Employee1> emp = new ArrayList<>();
		emp.add(new Employee1(101,"Ram",5000));
		emp.add(new Employee1(102,"Sham",60000));
		
		//System.out.println(emp);//it gives a location without overriding tostring method
		
		for(Employee1 e: emp)
		{
			System.out.println(e);
		}
		System.out.println("-----------------");
		//3.	WAP to print Emp whose salary is > 10000
		for(Employee1 e: emp)
		{
			if(e.getSalary()>10000)
			{
				System.out.println(e);
			}
			
		}
		System.out.println("-----------------");
		
		ArrayList <Employee1> emp1 = new ArrayList<>();
		emp1.add(new Employee1(105,"Sachin",40000));	
		emp1.add(new Employee1(104,"Rohit",35000));
		emp1.add(new Employee1(103,"Nita",55000));
		for(Employee1 e: emp1)
		{
			System.out.println(e);
		}
		System.out.println("-----------------");
		//WAP to print Emp who have name "Sachin"
		for(Employee1 e: emp1)
		{
			if(e.getName()=="Sachin")
			{
				System.out.println(e);
			}
			
		}
		System.out.println("-----------------");
		//6.	WAP to use add all elements to ArrayList
		emp.addAll(emp1);
		//System.out.println(emp);
		for(Employee1 e: emp)
		{
			System.out.println(e);
		}
		System.out.println("-----------------");
	//	5.	WAP to print Emp who have highest number of salary
		double max=emp.get(0).salary;
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).salary>max) {
				max=emp.get(i).salary;
			}
			
		}
		System.out.println(max);
		System.out.println("--------------------");
		//7.	WAP to sort a given ArrayList
		Collections.sort(emp);
		for(Employee1 e: emp)
		{
			System.out.println(e);
		}
		System.out.println("---------------------");
		//8.	WAP to copy one ArrayList into another
		ArrayList<Employee1> emp2=new ArrayList<>(List.copyOf(emp));
		System.out.println("Original Arraylist: ");
		for(Employee1 e: emp)
		{
			System.out.println(e);
		}
		System.out.println("Copied Arraylist: ");
		for(Employee1 e: emp2)
		{
			System.out.println(e);
		}
		System.out.println("------------------");
		//9.WAP to compare two ArrayLists print if equal?
		System.out.println(emp.equals(emp2));
		System.out.println(emp.equals(emp1));
		System.out.println("--------------------");
		//10.	WAP to join two ArrayLists.
	}
}
		

