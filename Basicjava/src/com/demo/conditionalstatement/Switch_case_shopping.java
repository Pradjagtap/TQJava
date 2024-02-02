package com.demo.conditionalstatement;

import java.util.Scanner;
public class Switch_case_shopping {

	public static void main(String[] args) {
		 
		/*5.show following categaries for E-commerce App
		1.Men
		2.Women
		3.Kids
		if user choose men show them options 1.footwear 2.Tshirt
		if user choose women show them options 1.jewellery 2.Saree
		if user choose kids show them options 1.Toys 2.educational game
		at last show which categeory and option choose by user*/
		Scanner sc=new Scanner(System.in);
		char categ;
		System.out.println("1.Men\n2.Women\n3.Kds\n");
		System.out.println("Enter category:");
		categ=sc.next().charAt(0);
				
		
		switch(categ) {
		case '1':
			System.out.println("1.footwear \n2.Tshirt");
			break;
		case '2':
			System.out.println("1.jewellery \n2.Saree");
			break;
		case '3':
			System.out.println("1.Toys \n2.Educational game");
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}


