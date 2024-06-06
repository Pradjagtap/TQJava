package com.arraylistdemo.aasigncomp;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Now do descending sort of Employee.id in Employee 
 * arraylist using < , > & == technique.
 * 8.Create and add 4 more Employee objects in ArrayList. 
 * Print ArrayList. Sort ArrayList using
Collections.sort(list) based on name. If name are same 
then sort on id. Print arrayList
 */
public class EmployeeTest {

	
	public static void main(String[] args) {
		ArrayList <Employee2>al = new ArrayList<>();
		al.add(new Employee2(1,"Ram","Hr",30));
		al.add(new Employee2(3,"Kinjal","Manager",29));
		al.add(new Employee2(4,"Shyam","Programmer",25));
		al.add(new Employee2(2,"Puja","Employee",28));
		
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
		System.out.println("------------------------");
		Collections.sort(al);
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
		Collections.reverse(al);
		System.out.println("-----------------");
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
		System.out.println("------------------------");
		ArrayList <Employee2>al2 = new ArrayList<>();
		al2.add(new Employee2(5,"Snehal","Hr",30));
		al2.add(new Employee2(7,"Nikita","Manager",29));
		al2.add(new Employee2(6,"Ram","Programmer",25));
		al2.add(new Employee2(8,"Rutuja","Employee",28));
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
		System.out.println("-------------------");
		al.addAll(al2);
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
		System.out.println("--------------");
		Collections.sort(al);
		
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
		System.out.println("--------------");
		Collections.reverse(al);
		
		for(Employee2 e:al)
		{
			System.out.println(e);
		}
	}

}
