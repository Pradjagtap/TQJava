package com.demo.overloading;

class Employee {
	private int id;
	private String name;
	private int salary;
	
	Employee()
	{
		System.out.println("Default constructor...");
	}
	Employee(int id, String name)
	{
		this();
		System.out.println("Para constructor2....");
		this.id=id;
		this.name=name;
		System.out.println(this.id);
		System.out.println(this.name);
				
	}
	Employee(int id, int salary,String name){
		System.out.println("Para constructor3....");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;		
	}
	public int getSalary() {
		return salary;
		
	}
	//@override
	public String toString()
	{
		return "Employee: "+id+""+name+" "+salary;
	}
}
public class Company {
		
		public static void main(String[] args) {
		
		Employee e1=new Employee();
		System.out.println(e1);
		
		Employee e2=new Employee(101,"Riya");
		System.out.println(e2);
		
		Employee e3=new Employee(101,25000,"Riya");
		System.out.println(e3);
		
		

	}

}
