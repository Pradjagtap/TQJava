package com.demo.inheritance;

class Employee {
	protected int id;
	protected String name;
	protected double salary;

	Employee(){
		
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return id+" "+name+" "+salary+"";
	}
}

class Manager extends Employee
{
	String role;
	String wing;
	
	Manager(){
		
	}
	Manager(int id,String name,double salary,String role,String wing)
	{
		super(id,name,salary);
		this.role=role;
		this.wing=wing;
	}
	public String toString() {
		return "Manager:"+super.toString();
	}
}
public class Singleheritance {

	public static void main(String[] args) {
		Manager m1=new Manager(101,"Pradnya",56000,"Teamlead","HR");
		
		System.out.println(m1.id+""+m1.name+""+m1.salary);
		System.out.println(m1.role+" "+m1.wing);
	}

}
