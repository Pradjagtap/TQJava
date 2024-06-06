package com.demo.assignment;

import java.util.Scanner;

public class Exmple1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("Enter word: ");
			String word=sc.next();
			
			if(word.length()<3) {
				throw new InvalidWordsException ("Number of words should be greater than 3");
			//System.out.println("Word: "+word);
			}
					
			}
		finally
		{
			sc.close();
		}

	}
	

}

