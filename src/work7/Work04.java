package work7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;




public class Work04 implements Serializable{
	
	
	public static void main(String args[])  throws Exception{
		try {
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}
		File file = new File("C:\\data\\Object.ser");
		animal[] w = new animal[2];
		w[0] = new Dog("Andy");
		w[1] = new Cat("Park");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < w.length; i++) {
			oos.writeObject(w[i]);
			
		}
		oos.close();
		fos.close();
	
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				(( animal ) ois.readObject()).speak();
				(( animal ) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	} catch (IOException e) {}
	}

	
}
