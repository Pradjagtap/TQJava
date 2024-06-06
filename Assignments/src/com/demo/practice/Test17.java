package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee9
{
	String name;
	public Employee9()
	{
		
	}
	public Employee9(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	static class ComparatorName implements Comparator<Employee>{
		public int compare(Employee o1,Employee o2)
		{
			return o1.name.compareTo(o2.name);
		}
	}
}
public class Test17 {

	public static void main(String[] args) {
		Employee9 e1=new Employee9("ankit");
		Employee9 e2=new Employee9("brad");
		
		ArrayList<Employee9> list=new ArrayList<Employee9>();
		list.add(e1);
		list.add(e2);
		
		
	}

}
