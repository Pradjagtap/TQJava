package com.mapDemo.HashmapDemo;

import java.util.Objects;

public class Employee {
	private int id;
	private String ename;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
//		public int hashCode()
//		{
//			//return Objects.hash(id,ename,salary);
//			return Objects.hash(id,ename);
//		}
	//	
//		@Override
	//
//		public boolean equals(Object obj)
//		{
//			if(this==obj)
//				return true;
//			if(obj==null)
//				return false;
//			if(this.getClass()!=obj.getClass())
//				return false;
//			
//			Employee emp= (Employee)obj;
//			if(this.id!=emp.id)
//				return false;
//			if(!this.ename.equals(emp.ename))
//				return false;
////			if(this.salary!=emp.salary)
////				return false;
//			
//		  return true;	  
//				
//		}
		
		
		
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
		
		}
		@Override
		public int hashCode() {
			return Objects.hash(ename, id, salary);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(ename, other.ename) && id == other.id
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
		

	}
