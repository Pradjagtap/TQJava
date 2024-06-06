package com.demo.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String name;
	public Employee() {}
	public Employee(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	static class ComparatorName implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		
	}
}
public class Test13 {

	public static void main(String[] args) {
		Employee e1=new Employee("Ankit");
		Employee e2=new Employee("brad");
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		
		Collections.sort(list,new Employee.ComparatorName());
		System.out.println(list);

	}

}
