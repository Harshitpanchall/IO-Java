package com.in.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferWriter {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter file = new BufferedWriter(new FileWriter("D:/IO/a.txt"));
		
		file.write("my name is harshit");
		file.newLine();
		
		file.write("from my b.tech cse");
		file.newLine();
		
		file.write("collage name is medicaps");
		file.newLine();
		
		file.write("my jurney is a software developer");
		file.newLine();
		
		System.out.println("file  write is successfully ");
		
		file.close();
		
	}

}
