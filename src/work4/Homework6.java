package work4;

public class Homework6 {
	public void MathTest(int[][] x) {
		int[] student =new int[x.length];
		int[] e=new int[x.length];
		for(int i = 0;i<x[0].length;i++) {
			int max =0;
			int maxp =0;
			for(int i2 = 0;i2<x.length;i2++) {
				e[i2] = x[i2][i];
				if (e[i2] > max) {
	                max = e[i2];
	                maxp = i2;
				}
			}
			 student[maxp] +=1;
		}
		for(int i =0 ;i<student.length;i++) {
			System.out.println("第"+(i+1)+"位同學拿到最高分的次數: "+student[i]+"次");
		}
			
}
	
	public static void main(String[] args){
		int[][] score = {{10,37,100,77,98,90},{35,75,70,95,70,80},{40,77,79,70,89,100},
						 {100,89,90,89,90,75},{90,64,75,60,75,50},{85,75,70,75,90,20},
						 {75,70,79,85,89,99},{70,95,90,89,90,75}};
		Homework6 h = new Homework6();
		h.MathTest(score);
		}
	
	}

