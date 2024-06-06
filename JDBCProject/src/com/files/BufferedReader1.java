package com.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("Enter name");
		String name=br.readLine();
		System.out.println("Enter name");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		double salary=Double.parseDouble(br.readLine());
		System.out.println("Enter character");
		char ch=(char) br.read();
		
		System.out.println("name is...."+name);
		System.out.println("age is...."+age);
		System.out.println("salary is...."+salary);
		System.out.println("gender..."+ch);


	}

}
