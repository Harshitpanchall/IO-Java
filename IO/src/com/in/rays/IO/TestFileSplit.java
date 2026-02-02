package com.in.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileSplit {

	public static void main(String[] args) throws Exception {

		File f = new File("D:/IO/split.txt");

		BufferedReader filecount = new BufferedReader(new FileReader(f));

		/// file count karna ke liye
		String s = filecount.readLine();

		int count = 0;

		while (s != null) {
			count++;
			s = filecount.readLine();
		}

		System.out.println("total line of count: " + count);

		BufferedReader br = new BufferedReader(new FileReader(f));

		for (int i = 1; i <= count; i++) {

			String line = br.readLine();

			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/IO/split" + i + ".txt"));

			bw.write(line);
			bw.close();

		}
		br.close();
		filecount.close();
		System.out.println("filecount is " + count);
	}

}
