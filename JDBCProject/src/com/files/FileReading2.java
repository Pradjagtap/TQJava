package com.files;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading2 {
	
	void read(File f) throws IOException 
	{
		FileInputStream fs=null;
		int x;
		
			
				 fs=new FileInputStream(f);
				 BufferedInputStream bs=new BufferedInputStream(fs);
				 System.out.println(fs.available());
					byte arr[]=new byte[fs.available()];
			
					byte arr1[]=new byte[fs.available()];
		
			
}

	public static void main(String[] args) throws IOException {
		FileReading  fr=new FileReading ();
		File f=new File("C:/Users/User/Desktop/MithiPages/Page3.txt");
		
		 fr.read(f);
		

	}

}
