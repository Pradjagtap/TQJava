package com.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DeptasKey {
	static void displayDetails(ArrayList<Employee4> emp) {
		HashMap<Integer,ArrayList<Employee4>> hm=new HashMap<Integer,ArrayList<Employee4>>();
		
		Iterator<Employee4> itr=emp.iterator();
		while(itr.hasNext()) {
			Employee4 e=itr.next();
			Integer dept=e.getDept().getDid();
			if(hm.containsKey(dept)) {
				ArrayList<Employee4> emp1=hm.get(dept);
				emp1.add(e);
				hm.put(dept,emp1);
			}
			else
			{
				ArrayList<Employee4> emp1=new ArrayList<Employee4>();
				emp1.add(e);
				hm.put(dept,emp1);
			}
				
		}
		for(Entry<Integer, ArrayList<Employee4>> e: hm.entrySet()) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
			
	}
	public static void main(String[] args) {
		ArrayList<Employee4> emp=new ArrayList<Employee4>();
		
		emp.add(new Employee4(101,"puja",50000,new Department(1,"HR")));
		emp.add(new Employee4(105,"Sonal",72000,new Department(2,"IT")));
		emp.add(new Employee4(103,"Rupali",45000,new Department(1,"HR")));
		emp.add(new Employee4(102,"Kinjal",35000,new Department(2,"IT")));
		emp.add(new Employee4(104,"Priya",56000,new Department(3,"Manager")));
		
		for(Employee4 e:emp) {
			System.out.println(e);
		}
		displayDetails(emp);
	}

}
