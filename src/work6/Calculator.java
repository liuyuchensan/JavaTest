package work6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator extends Exception {

	public void powXY() {
		while(true) {
		try {
			 Scanner s = new Scanner(System.in);
				try {
					System.out.print("請輸入數字: ");
					int x =s.nextInt();
					System.out.print("請輸入次方: ");
					int y =s.nextInt();
					if(y>=0) {
						System.out.print(x+"的"+y+"次方是: "+(int)(Math.pow(x,y)));
						s.close();
					}else if(x==0&&y==0){
						throw new CalException ("0的0次方沒有意義\n");
					
					}else if (y<0) {
						throw new CalException ("次方不得負數\n");
						}
					
				}catch(InputMismatchException e){
						throw new CalException ("輸入格式不正確\n");
						}
			break;
		}catch(CalException e) {
			System.out.print(e.getMessage());
			}
		}
	}
}

