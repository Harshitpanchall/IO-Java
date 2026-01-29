package com.in.rays.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		
		File f = new File("D:/IO/ab.txt");
		
		if(f.exists()) {
			System.out.println("name : " + f.getName());//  name
			System.out.println("path" + f.getAbsolutePath());/// path
			
			//// check Access permission
			
			
			System.out.println("access permission");
			
			System.out.println("writer : " + f.canWrite());
			System.out.println("read: " + f.canRead());
			
			/////check if is dictory file 
			 
			System.out.println("is file " + f.isFile());
			System.out.println("is dir : " + f.isDirectory()); /// folder D: IO
			
			// last modifications
			
			Date d = new Date(f.lastModified());
			System.out.println(d);
			
			
			/// length of file
			long length = f.length();
			System.out.println(length);
			
		}else {
			System.out.println("file is not founf");
		}
		
	}

}
