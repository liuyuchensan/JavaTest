package work3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class work303 {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String w = scanner.next();
			
			int[] int1 = new int[6];
			int count = 1;
			while(true) {
				int cv = 0;
				int x = (int) ((Math.random()*49)+1);
				String t = x + "";
				if (t.contains(w)) {
					continue;
				}
				for(int i = 0;i<5;i++) {
					
					if(int1[i]==x) {
						cv++;
						}
					}
					if(count<=6&&cv==0) {					
					System.out.print(x+" ");
					count++;
					}else if(cv==1){
						continue;
					}
				else {
					break;
				}
			}
			scanner.close();
		}

}


