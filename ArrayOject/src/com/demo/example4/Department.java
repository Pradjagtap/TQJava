package com.demo.example4;
/*
 * Task
1>>
Create a class Department id, name, location
Create a class Employee having id,name and salary
and containment dept
--> Create 2 anonymous object and one object from
getter,setter
----> Create object using user input
---> Sort the employee on the basis of salary
--->Find the employee having max salary

 */
public class Department {
	private int did;
	private String name;
	private String location;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String name, String location) {
		super();
		this.did = did;
		this.name = name;
		this.location = location;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
