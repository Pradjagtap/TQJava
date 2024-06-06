package com.arraylistdemo.aasigncomp;

import com.arraylistdemo.Employee;

public class Employee2 implements Comparable<Employee2> {
	private int id;
	private String name;
	private String designation;
	private int age;

	public Employee2(int id, String name, String designation, int age) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}

	public int compareTo(Employee2 e) {
		if (this.id== e.id)
			return 0;
		else if (this.id> e.id)
			return 1;
		else
			return -1;
	}

	public int compare(Employee2 e) {

		return this.getName().compareTo(e.getName());
		
	}

}
