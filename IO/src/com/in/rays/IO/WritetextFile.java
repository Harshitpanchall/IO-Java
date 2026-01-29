package com.in.rays.IO;

import java.io.FileWriter;

public class WritetextFile {
	
	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("D:/IO/a.txt");
		
		f.write("hello World");
		
		System.out.println("try succesful");
		
		f.close();
		
	}
	

}
