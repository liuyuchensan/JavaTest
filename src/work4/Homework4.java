package work4;

import java.util.Scanner;

public class Homework4 {
	public void MathTest(int[][] s,int money) {
		int count=0;
		
		for(int i = 0;i<s.length;i++){
			if(money<=s[i][s[i].length-1]) {	
				count++;
			}
		}
		System.out.println();
		if(count>0) {
		System.out.print("有錢可借的員工編號: ");
		for(int i = 0;i<s.length;i++){
			if(money<=s[i][s[i].length-1]) {	
				System.out.print(s[i][0]+" ");
			}
		}
		
		System.out.print("共 "+count+" 人");
		}else {
			System.out.println("沒人有錢可以借妳");
		}
	}
	public static void main(String[] args) {
		int[][] s = {{25,2500},{32,800},{8,500},{19,1000},{27,2700}};
		Homework4 h = new Homework4();
		Scanner m = new Scanner(System.in);
		int money = m.nextInt();
		h.MathTest(s,money);
		m.close();
	}
}
