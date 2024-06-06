package com.demo.enumdemo;

import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ticket type: ");
		System.out.println("1.Standard: "+MovieSeat.STANDARD.price);
		System.out.println("2.Premium: "+MovieSeat.PREMIUM.price);
		System.out.println("3.Recliner: "+MovieSeat.RECLINER.price);
		
		int seatType=sc.nextInt();
		
		System.out.println("Enter number of seats: ");
		
		int no=sc.nextInt();
		
		MovieSeat ms=null;
		
		switch(seatType)
		{
		case 1: ms=MovieSeat.STANDARD;
		break;
		case 2: ms=MovieSeat.PREMIUM;
		break;
		case 3: ms=MovieSeat.RECLINER;
		break;
		default: System.out.println("No such type of seat available");
		System.exit(0);
		}
		System.out.println("Ticket type: "+ms);
		System.out.println("Number of tickets: "+no);
		System.out.println("Total amount: "+(no*(ms.price)));
	}

}
