package com.rays.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedInputAndOutputStreamBinary {
	
	public static void main(String[] args) throws Exception {
	
	String source = "D:/IO/lion.jpg";
	
	String target = "D:/IO/other1.jpg";
	
	BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
	BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));
	
	int i = in.read();
	
	while(i != -1) {
		
		System.out.println(i);
		out.write(i);
		i = in.read();
		
		
	}
	
	in.close();
	out.close();
	
	

}
}