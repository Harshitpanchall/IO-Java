

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyWord {
	public static void main(String[] args) throws Exception {
		
		PrintWriter out = new PrintWriter("D:/IO/temp.txt");
		System.out.println("hey start is typing");
		
		InputStreamReader kb = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(kb);
		
		String line = in.readLine();
		
		while(!line.equals("exits")) { /// line jab tak exits nahi hoti hai 
			
		out.write(line);
		line = in.readLine();
			
			
		}
		
		in.close();
		out.close();
		kb.close();
	}

}
