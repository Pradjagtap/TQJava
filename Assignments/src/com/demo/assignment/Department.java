package com.demo.assignment;

/*
 * Create a class Department having did, deptName
Create a class Employee having eid, empName, salary and department
Create 3 objects
  > 1.using anonymous department
  > 2. using department object : using contsructor
  > 3. using getter and setter: giving values from your own
check the hashcode generated for department in 1st and 2 nd object
Also print the details of all Employees
 */
public class Department {
	private int did;
	private String deptName;

	Department() {

	}

	Department(int did, String deptName) {
		this.did = did;
		this.deptName = deptName;
	}
	public void setDid(int did)
	{
		this.did=did;
	}
	
	public int getDid()
	{
		return did;
	}
	
	public void setDeptname(String Deptname)
	{
		this.deptName=deptName;
	}
	
	public String getDeptname()
	{
		return deptName;
	}
	public String toString()
	{
		return "Department:"+did+" Department name: "+deptName;
	}

}
