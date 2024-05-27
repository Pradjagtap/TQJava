package com.demo.constructor;

import java.util.Scanner;

class Folks{
	private int rollno,std;
	private String name;
	private int sub1,sub2,sub3,sub4,sub5;
	private double percentage;
	private int total;
	private char grade;
	
	Folks(){
		std=10;
	}
	Folks(int rollno,String name,int sub1,int sub2,int sub3,int sub4,int sub5){
		this.rollno=rollno;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
				
	}
	public void displayDetails() {
		System.out.println("rollno: "+rollno);
		System.out.println("name: "+name);
		System.out.println("Sub1: "+sub1);
		System.out.println("Sub2: "+sub2);
		System.out.println("Sub3: "+sub3);
		System.out.println("Sub4: "+sub4);
		System.out.println("Sub5: "+sub5);
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+percentage);
		//System.out.println("Grade: "+grade);
	}
	public void calculateMarks() {
		total=sub1+sub2+sub3+sub4+sub5;
		percentage=(100*total)/500;
		
	}
	public void calculateGrade() {
		if(percentage>90) {
			System.out.println("Grade A");
		}
			else if(percentage<90 && percentage>70) {
				System.out.println("Grade B+");
			}else if(percentage<70 && percentage>50) {
				System.out.println("Grade B");
			}else if(percentage<50) {
				System.out.println("Grade C");
					
		}
	}
	public void compareGrade(Folks obj) {
		
		if(percentage>obj.percentage) {
			System.out.println(this.name+" has greateer percentage than"+obj.name);
		}
		else {
			System.out.println(obj.name+" has greateer percentage than"+this.name);
			
		}
		
	}
	
}
public class Student2 {

	public static void main(String[] args) {
				
		Folks f1=new Folks(22,"Riya",65,56,78,66,56);
		Folks f2=new Folks(23,"Richa",89,89,98,90,78);
		f1.calculateMarks();
		f1.displayDetails();
		f1.calculateGrade();
		f2.calculateMarks();
		f2.displayDetails();
		f2.calculateGrade();
		f2.compareGrade(f1);

	}

}
