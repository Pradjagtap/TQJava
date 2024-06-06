package com.HashSetDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {
		
		public static void main(String[] args) {
			
			LinkedHashSet<Employee> elhs=new LinkedHashSet<>();
			elhs.add(new Employee(1,"Pradnya",30000.0));
			elhs.add(new Employee(2,"Neha",20000.0));
			elhs.add(new Employee(3,"Raj",35000.0));
			elhs.add(new Employee(4,"Anuja",27000.0));
			elhs.add(new Employee(1,"Pradnya",30000.0));
			
			//System.out.println(elhs);
			
			for(Employee e:elhs) {
				System.out.println(e);
			}
			System.out.println("-------------------------------------------------");
			Iterator<Employee> itr=elhs.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	}
	
	
		

}
