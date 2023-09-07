package work7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Work01 {
	static void p(String string) {
		System.out.println(string);
	}

	public static void main(String args[]) throws IOException  {
		int i ;
		int count =0;
		int countS=0;
		char t;
		 try {
				FileReader f2 = new FileReader("C:\\\\Users\\\\Tibame_T14\\\\Downloads\\\\Sample.txt");
				BufferedReader f2f = new BufferedReader(f2);
				
				 while ((i = f2f.read()) != -1) {
	                 System.out.print((char)i);
	                 char i2 =(char)i;
	                 count++;
				 }	
			} catch (IOException e) {}
	            File fr = new File("C:\\Users\\Tibame_T14\\Downloads\\Sample.txt");
	            Scanner s = new Scanner(fr);
	            while(s.hasNextLine()){
					 s.nextLine();
					 countS++;
				 }
	            p("位元數:"+fr.length());
	            System.out.println("字元數:"+count);
	            System.out.println("列數:"+countS);
	   }
}

