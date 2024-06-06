package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trial {

	public static void main(String[] args) {
		File f=new File("C:/Users/User/Desktop/MithiPages/Page3.txt");
		try {
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
