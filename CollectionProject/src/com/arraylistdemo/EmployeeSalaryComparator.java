package com.arraylistdemo;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
//		if(e1.getSalary()==e2.getSalary())
//		return e1.getName().compareTo(e2.getName());
//		else
//			if(e1.getSalary()>e2.getSalary())
//				return 1;
//			else
//				return -1;
		
		if(e1.getSalary()==e2.getSalary())
			return e1.getName().compareTo(e2.getName());
			else
				return (int)(e1.getSalary()-e2.getSalary());
		
		
	}

}
