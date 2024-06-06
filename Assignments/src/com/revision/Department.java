package com.revision;

public class Department {
	private int did;
	private String dept;
	private String city;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dept, String city) {
		super();
		this.did = did;
		this.dept = dept;
		this.city = city;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dept=" + dept + ", city=" + city + "]";
	}
	
}

