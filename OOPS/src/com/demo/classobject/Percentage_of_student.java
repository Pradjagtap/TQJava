package com.demo.classobject;

/*create student class assign marks and calculate the percentage and print the result 1st class,2nd
class etc*/

 class Student2{
	int marks;
	double percent;

	public void setDetails(int marks,double percent) {
		this.marks=marks;
		this.percent=percent;
	}
	public void showDetails() {
		System.out.println("marks: "+marks);
		System.out.println("percentage: "+percent);
		
	}
}

public class Percentage_of_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
