package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {
	void writeFile(File f) throws IOException
	{
		FileOutputStream fo=new FileOutputStream(f);
		fo.write(67);
		String s=" "
				+ "India is beautiful country";
		byte arr[]=s.getBytes();
		fo.write(arr);
		
		fo.write(arr, 10, 9);
	}

	public static void main(String[] args) throws IOException   {
		FileWriting fr=new FileWriting ();
		File f=new File("e://java_progr/Hello1.txt");
		
		 try {
			fr.writeFile(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
