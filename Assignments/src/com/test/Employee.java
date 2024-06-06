//package com.test;
//
//
//
//public class Employee implements Comparable<Employee>{
//	public int id;
//	public String name;
//	public double salary;
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Employee(int id, String name, double  salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double  getSalary() {
//		return salary;
//	}
//	public void setSalary(double  salary) {
//		this.salary = salary;
//	}
//	@Override
//	public int  compareTo(Employee o) {
//		if(this.getName().equals(o.getName()))
//			if(this.getSalary()==o.getSalary())
//				return 0;
//				if(this.getSalary()>o.getSalary())
//					return 1;
//				else
//					return 0;
//				if(this.getName().o.getName())
//					return 1;
//				else 
//					return 0;
//				
//				
//		}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//	
//}
