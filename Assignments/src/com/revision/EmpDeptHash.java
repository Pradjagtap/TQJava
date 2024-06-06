package com.revision;

import java.util.HashMap;
import java.util.Map;

public class EmpDeptHash {
	
		public static void main(String[] args) {
			HashMap<Employee,Department> emap=new HashMap<>();
			
			emap.put(new Employee(101,"Amit",17000.0), new Department(1,"IT","Pune"));
			emap.put(new Employee(102,"Nitu",27000.0), new Department(1,"Sales","Mumbai"));
			emap.put(new Employee(103,"Meena",21000.0), new Department(1,"IT","Pune"));
			emap.put(new Employee(101,"Amit",18000.0), new Department(1,"Sales","Mumbai"));
			
			for(Map.Entry<Employee, Department> e:emap.entrySet())
			{
				System.out.println(e.getKey());
				System.out.println(e.getValue());
			}
			System.out.println("-------------------");
		}



}
