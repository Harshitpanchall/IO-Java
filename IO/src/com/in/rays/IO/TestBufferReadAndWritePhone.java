package com.in.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TestBufferReadAndWritePhone {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("D:/IO/Phone.txt");
		FileWriter file1 = new FileWriter("D:/IO/ValidPhone.txt");
		
		BufferedReader br = new BufferedReader(file);
		BufferedWriter bw = new BufferedWriter(file1);
		
		String i = br.readLine();
		
		while(i != null) {
			
			if(i.length()== 10) {
				System.out.println(i);
				bw.write(i);
				bw.newLine();
				
			}
			i = br.readLine();
			
		}
		
		br.close();
		bw.close();
		
		
	}

}
