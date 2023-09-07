package work7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Work03 {
		public static void copyFile(File a,File b) throws IOException {
	
		
		FileReader in = new FileReader(a);
		FileWriter out = new FileWriter(b);
		int c;

		while ((c = in.read()) != -1) { 
			out.write(c);
		}

		in.close();
		out.close();
		}
	
	public static void main(String args[]) throws IOException {
		File in = new File("C:\\THA103_Worksoace\\ClassHomeWork\\src\\work7\\1.txt");
		File out= new File("C:\\THA103_Worksoace\\ClassHomeWork\\src\\work7\\2.txt");
		copyFile(in,out);
	}
}
