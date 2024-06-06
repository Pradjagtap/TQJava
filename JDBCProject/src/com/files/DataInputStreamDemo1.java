package com.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamDemo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("e://java_progr/Data1.dat");
		f.createNewFile();
		FileOutputStream fs=new FileOutputStream(f);
		if(f.exists())
		{
			DataOutputStream din=new DataOutputStream(fs);
			din.writeUTF("Pradnya Jagtap");
			din.writeInt(35);
			din.writeDouble(105.5);
			din.writeChar(90);
		}
		fs.close();
		
		FileInputStream fs1=new FileInputStream(f);
		DataInputStream ds1=new DataInputStream(fs1);
		System.out.println(ds1.readUTF());
		System.out.println(ds1.readInt());
		System.out.println(ds1.readDouble());
		System.out.println(ds1.readChar());
	}

}
