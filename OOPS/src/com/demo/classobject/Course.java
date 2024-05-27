package com.demo.classobject;

public class Course {
	int courseid;
	String coursename;
	int coursefees;
	
	public void setDetails(int id,String name,int fees) {
		courseid=id;
		coursename=name;
		coursefees=fees;
	}
		
	public void displayData() {
			System.out.println("Courseid: "+courseid);
			System.out.println("Coursename: "+coursename);
			System.out.println("coursefees: "+coursefees);
			
		}
	
		
		
	}


