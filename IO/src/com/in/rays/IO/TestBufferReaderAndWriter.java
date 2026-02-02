package com.in.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TestBufferReaderAndWriter {
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("D:/IO/Email.txt");
		FileWriter file1 = new FileWriter("D:/IO/ValidEmail.txt");

		BufferedReader s1 = new BufferedReader(file);
		BufferedWriter c2 = new BufferedWriter(file1);

		String i = s1.readLine();

		while (i != null) {

			if (i.endsWith("gmail.com")) {
				System.out.println(i);
				c2.write(i);
				c2.newLine();
			}
			i = s1.readLine();

		}
		s1.close();
		c2.close();
	}

}
