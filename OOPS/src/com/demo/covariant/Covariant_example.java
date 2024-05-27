package com.demo.covariant;

class Employee2 
{
	int id;
	String name;
	
	Employee2(){
		
	}
	Employee2(int id,String name){
		this.id=id;
		this.name=name;
	}
	Employee2 displayDetails() {
		name=name+"HCL";
		return this;
	}
}
class Programmer extends Employee2
{
	String skills;
	
	Programmer(){
		
	}
	Programmer(int id,String name,String skills){
		
		super(id,name);
		this.skills=skills;
	}
	Employee2 showDetails(){
		name=name+"HCL";
		skills=skills+"coding";
		return this;
	}
	Programmer displayDetails() {
		name=name+"HCL";
		skills=skills+"coding";
		return this;
	}
	
}

public class Covariant_example {

	public static void main(String[] args) {
		Employee2 e;
		Programmer p;
		
		Employee2 e1=new Employee2(1,"Richa");
		e=e1.displayDetails();
		System.out.println(e.id+" "+e.name);
		
		

	}

}
