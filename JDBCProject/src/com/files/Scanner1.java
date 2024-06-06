package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("e://java_progr/Hello.java");
		//try-with-resource(ARM)
		try (Scanner sc = new Scanner(f)) {
			while(sc.hasNextLine())
			{
			System.out.println(sc.nextLine());
			}
		}
	

	}

}

