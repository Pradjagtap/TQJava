package com.files;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading3 {
	
	void read(File f) throws IOException 
	{
		FileInputStream fs=null;
		int x;
		
			
				 fs=new FileInputStream(f);
				 BufferedInputStream bs=new BufferedInputStream(fs);
				 System.out.println(fs.available());
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
				
				//3rd read method
				fs.read(arr1, 0, 6);
				for(int i=0;i<=6;i++)
				{
					System.out.print((char)arr[i]);
				}
			
			
}

	public static void main(String[] args) throws IOException {
		FileReading  fr=new FileReading ();
		File f=new File("C:/Users/User/Desktop/MithiPages/exclude-words.txt");
		
		 fr.read(f);
		

	}

}

