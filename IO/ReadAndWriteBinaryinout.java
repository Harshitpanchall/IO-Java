package com.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryinout {
	public static void main(String[] args) throws Exception {
		
		String s = "D:/IO/cat.jpg";
		String t = "D:/IO/other.jpg";
		
		FileInputStream in = new FileInputStream(s);
		FileOutputStream out = new FileOutputStream(t);
		
		int i = in.read();
		while(i != -1) {
			System.out.println(i);
			out.write(i);
		i = in.read();
			
		}
		in.close();
		out.close();
		System.out.println("sucessfully sir");
		
		
	}

}
