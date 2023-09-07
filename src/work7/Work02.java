package work7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Work02 {
	
	public static void main(String[] args)  {
		try {
		FileOutputStream fis = new FileOutputStream("C:\\THA103_Worksoace\\ClassHomeWork\\src\\work7\\Data.txt\\");
		BufferedOutputStream bis = new BufferedOutputStream(fis);
		PrintStream ps = new PrintStream(bis);
		for(int i=0;i<10;i++) {
		ps.println((int)(Math.random()*1000));
		}
		ps.close();
		bis.close();
		fis.close();
		}catch (IOException e){}
	}
}