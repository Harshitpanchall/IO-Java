package com.in.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TestReaderAndWriterBuffe {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("D:/IO/r.txt");
		FileWriter file1 = new FileWriter("D:/IO/validname.txt");
		
		BufferedReader s = new BufferedReader(file);
		BufferedWriter c = new BufferedWriter(file1);
		
		
		String i = s.readLine();
		
		while(i != null) {
			
			if(i.startsWith("hello")) {
				System.out.println(i);
				c.write(i);
				c.newLine();
				
			}
			i = s.readLine();
			
		}
		s.close();
		c.close();
	}

}
