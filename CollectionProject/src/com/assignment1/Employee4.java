package com.assignment1;

public class Employee4 {
	int eid;
	String ename;
	double esalary;
	Department dept;
	public Employee4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee4(int eid, String ename, double esalary, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", dept=" + dept + "]";
	}
	
}
