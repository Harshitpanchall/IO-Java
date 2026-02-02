package com.rays.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveDataType {
	
	public static void main(String[] args) throws Exception {
		
		DataOutputStream  out = new DataOutputStream(new FileOutputStream("D:/IO/primitivetype.txt"));
		
	out.writeInt(23);
	out.writeBoolean(false);
	out.writeDouble(23.23);
	out.writeChar('A');
	
	System.out.println("hello is sucessfully");
		
	out.close();
	
	DataInputStream in = new DataInputStream(new FileInputStream("D:/IO/primitivetype.txt"));
	
	System.out.println(in.readInt());
	System.out.println(in.readBoolean());
	System.out.println(in.readDouble());
	System.out.println(in.readChar());
	
	in.close();
	}

}
