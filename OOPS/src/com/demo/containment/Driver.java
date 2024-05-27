package com.demo.containment;
//driverid, name, adharNo, salary
public class Driver {
	private int driverid;
	private String name;
	private int adharno;
	private double salary;
		
	public Driver(){
		
	}
	public Driver(int driverid,String name,int adharno,double salary) {
		this.driverid=driverid;
		this.name=name;
		this.adharno=adharno;
		this.salary=salary;
		
	}
	public void setDriverid(int driverid) {
		this.driverid=driverid;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAdharno(int adharno) {
		this.adharno=adharno;
	}
	public int getAdharno() {
		return adharno;
	}
	public void setSalary(Double salary) {
		this.salary=salary;
	}
	public Double salary() {
		return salary;
	}
	
	public String toString() {
		return "driverid: "+driverid+"Name: "+name+"AdharNo: "+adharno+"Salary: "+salary;
	}
}
