package Work10;

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Work02 {
	public static void main(String args[]) {
	    boolean b = true;
		while (b) {
			try {
				Scanner s = new Scanner(System.in);
				out.println("請輸入數字");
				double num1 = s.nextDouble();
				out.println("請選擇想要表示的方式: 1.千分位, 2.百分比, 3.科學記號");
				int num2 = s.nextInt();
				switch (num2) {
				case 1:
					Format dfm1 = new DecimalFormat("#,###");
					out.println("千分位為 : " + dfm1.format(num1));
					break;
				case 2:
					Format dfm2 = new DecimalFormat("0%");
					out.println("百分比為 : " + dfm2.format(num1));
					break;
				case 3:
					Format dfm3 = new DecimalFormat("#.##E0");
					out.println("科學記號為 : " + dfm3.format(num1));
				case 4:
					s.close();
					
				}
				b=false;
			} catch (InputMismatchException e) {
				out.println("請輸入正確格式");
				
			}
		}

	}
}
