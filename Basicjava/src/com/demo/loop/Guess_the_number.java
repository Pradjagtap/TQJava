package com.demo.loop;
import java.util.Scanner;
public class Guess_the_number {
	public static void guess(int n) {
		int i=0,count=0;
		while(n>0) {
			
			Scanner sc=new Scanner (System.in);
						
			if(n==65) {
				
				System.out.println("correct number");
				break;
				
				
			}
			else if(n>65) {
				System.out.println("Guess the less number");
				System.out.println("Enter any number: ");
				n=sc.nextInt();
				
			}
			else {
				System.out.println("Enter the greater number");
				System.out.println("Enter any number: ");
				n=sc.nextInt();
			}
			
			
			count++;
			
		}
		System.out.println("count: "+count);
		
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		guess(n);

}
}
