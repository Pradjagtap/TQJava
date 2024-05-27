package com.demo.classobject;

class Employee{
	int eid=101;
	String ename="pooja";
	double esal=56000;
	
	public void setDetails() {
		eid=102;
		ename="Supriya";
		esal=45000;
	}
	public void showDetails() {
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee sal: "+esal);
		System.out.println("-------------------");
	}
}

public class Testemployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.showDetails();
		e2.showDetails();
		e3.setDetails();
		e3.showDetails();
		
		
		
		
	}

}
