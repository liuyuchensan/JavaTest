package work3;

import java.util.Scanner;

public class work302 {
	
	public int RandomM() {
		int x = (int) ((Math.random()*100)+1);
		return x;
	}
	public static void main(String[] args) {
		work302 q = new work302();
		Scanner scanner = new Scanner(System.in);
		int c=1;
		int d=100;
		int x = q.RandomM();
		while(true) {
		int w = scanner.nextInt();
		if(w<100&&w>0) {
		if (w >x) {
			if(w<d) {
			d = w;
			System.out.print(d+"~"+c);
			}else {
				System.out.print("請輸入範圍內數字");
			}
		}else if(w<x){
			if(w>c) {
			c = w;
			System.out.print(d+"~"+c);
			}else {
				System.out.print("請輸入範圍內數字");
			}
		}else if(w==x){
			System.out.print("答對了, 答案就是"+x);
			break;
			}
		}else {
			System.out.print("請輸入正確數字或是在範圍內");
			}
		}
		scanner.close();
	}
}
