package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		FileWriter w=new FileWriter("e://java_progr/FileW2.txt",true);
		
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		w.write(s);
		
		System.out.println("file written successfully");
		w.close();
		
		FileReader r=new FileReader("e://java_progr/FileW2.txt");
		while((x=r.read())!=-1)
		{
			System.out.println((char)x);
		}
		
		

	}

}
