package com.in.rays.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class TestBufferReader {
	public static void main(String[] args) throws Exception {
		
		BufferedReader  file = new BufferedReader(new FileReader("D://IO//a.txt/"));
		
		String line = file.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = file.readLine();		
		}
		
		file.close();
		
	}

}
