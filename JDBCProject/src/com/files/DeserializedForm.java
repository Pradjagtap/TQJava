package com.files;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class DeserializedForm {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("e://java_progr/Emploser1.ser");
		FileInputStream fos=new FileInputStream(f);
		
		ObjectInputStream ois=new ObjectInputStream(fos);
		
		
//        Employee e=(Employee) ois.readObject();
//        System.out.println(e);
		
		
		
		ArrayList<Employee> al=(ArrayList<Employee>)ois.readObject();
		System.out.println(al);
		ois.close();
	}

}
