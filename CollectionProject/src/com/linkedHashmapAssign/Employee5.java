package com.linkedHashmapAssign;

public class Employee5 {
	public int id;
	public String name;
	public int salary;
	public Department d;
	public Employee5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee5(int id, String name, int salary, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee5 [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}
	
	
}
