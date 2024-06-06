package com.files;

import java.io.File;
import java.io.IOException;

public class FileClass1 {

	public static void main(String[] args) throws IOException {
		File f=new File("d://DP10/Second.txt");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("new file created");
		}
		System.out.println(f.canRead());
		System.out.println(f.canExecute());
		f.setWritable(false);
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		
		File f1=new File("e://java_progr");
		String arr[]=f1.list();
		//System.out.println("new file created in e");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	

		

	}

}
