package com.demo.inheritance;
//solved by me
class Student {
	int id;
	String name;
	
	Student(){
		
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public String toString() {
		return "ID: "+id+"Name of the teacher: "+name;
	}
}
class Teacher extends Student {
	double salary;
	Teacher(){
		
	}
	Teacher(int id,String name,int salary){
		super(id,name);
		this.salary=salary;
		
		
	}
	public String toString() {
		return "Teacher: "+salary+super.toString();
	}
}
public class Singleinheritance1 {

	public static void main(String[] args) {
		Teacher t1=new Teacher(101,"Rohan",50000);
		
		System.out.println(t1.id+"ID"+t1.name+"name"+t1.salary+"salary");
		

	}

}
