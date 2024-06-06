package com.demo.assignment;

public class Employee_department {
	private int eid, salary;
	private String empName;
	private Department department;

	private Employee_department() {

	}
	private Employee_department(int eid,String empName,int salary,  Department department){
		this.eid=eid;
		this.empName=empName;
		this.salary=salary;
		this.department=department;
			
	}
	public  void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public  void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	}
