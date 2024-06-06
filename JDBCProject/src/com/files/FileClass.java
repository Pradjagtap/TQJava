package com.files;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		File f=new File("e://Dp10_file/first.txt");
//		boolean b=f.createNewFile();
//		if(b)
//		{
//			System.out.println("new File created");
//		}
		System.out.println(f.canRead());
		System.out.println(f.canExecute());
		f.setWritable(false);
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		
		File f1=new File("e://java_progr");
		String arr[]=f1.list();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	
		
		

	}

}
