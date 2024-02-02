package com.demo.conditionalstatement;
import java.util.Scanner;
public class Gross_salary1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double grosssalary;
		System.out.println("Enter salary: ");
		double salary=sc.nextDouble();
		if(salary<=10000)
		{
			grosssalary=salary+(0.2*salary)+(0.8*salary);
			System.out.println("salary is "+grosssalary);
			
		}
		else if(salary<=20000)
		{
			grosssalary=salary+(0.25*salary)+(0.9*salary);
			System.out.println("salary is "+grosssalary);
		}
		else if(salary>20000)
		{
			grosssalary=salary+(0.3*salary)+(0.95*salary);
			System.out.println("salary is "+grosssalary);
		}
		else
		{System.out.println("salary is "+salary);
			
		}
	}

}
