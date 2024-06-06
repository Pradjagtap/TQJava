package com.multithreading;



import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {
	
	void read(File f) throws IOException 
	{
		FileInputStream fs=null;
		int x;
				
				 fs=new FileInputStream(f);
				 BufferedInputStream bs=new BufferedInputStream(fs);
				 byte arr[]=new byte[fs.available()];
				 byte arr1[]=new byte[fs.available()];
		//System.out.println("rest of the code");
//			while( (x=fs.read())!=-1)
//{
//				
//				System.out.print((char)x);
//}
				 
				 
				 //2 read method
				bs.read(arr);
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.print((char)arr[i]);
				}
				
				
}

	public static void main(String[] args) throws IOException {
		FileReading  fr=new FileReading ();
		File f=new File("C:/Users/User/Desktop/MithiPages/Page1.txt");
		
		 fr.read(f);
		

	}

}
