package com.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializedForm1 {

	public static void main(String[] args) throws IOException {
		File f=new File("e://java_progr/Emploser1.ser");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e1=new Employee(1,"Sonali",15000,1234);
		Employee e2=new Employee(1,"Monali",16000,1235);
		
		al.add(e1);
		al.add(e2);
		
		Employee e3=new Employee(1,"Mrunal",17000,12345);
		Employee e4=new Employee(1,"Gargi",19000,12346);
		al.add(e3);
		al.add(e4);
		
		oos.writeObject(al);
		
		System.out.println("Data written successfully");
		
		oos.close();
		
	}

}
