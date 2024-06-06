package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter w=new FileWriter("e://java_progr/FileW1.txt",true);
		//char c[]=new char[30];
		//w.write(69);
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter String");
		String s=sc.nextLine();
		w.write(s);
//		w.write(c);
//		w.write(c,0,7);
		
		System.out.println("file written succesfully");
		w.close();
		
		FileReader r=new FileReader("e://java_progr/FileW1.txt");
		while((x=r.read())!=-1)
		{
			System.out.print((char)x);
		}
		

	}

}
