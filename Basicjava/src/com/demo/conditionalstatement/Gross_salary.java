package com.demo.conditionalstatement;

import java.util.*;
public class Gross_salary {

	public static void main(String[] args) {
		// Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
		//DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%

			Scanner sc=new Scanner(System.in);
			
			float BS,HRA,DA,GS;
			
			BS=sc.nextFloat();
			System.out.println("Enter BS: ");
			
			HRA=sc.nextFloat();
			DA=sc.nextFloat();
			//Basic salary=salary+HRA+DA
			
			GS=BS+HRA+DA;
			
			if(BS<=10000) {
				GS=BS+0.02f*0.08f;
				System.out.println("Gross Salary is "+GS);
			}
			else if(BS<=20000 && HRA==0.25 && DA==0.90) {
				System.out.println("Gross salary is "+GS);
			}
			else if(BS>20000 && HRA==0.30 && DA==0.95) {
				System.out.println("Gross salary is "+GS);
			}
			
			
	}

}
