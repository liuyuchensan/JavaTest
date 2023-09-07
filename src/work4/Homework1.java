package work4;

public class Homework1 {
	public void arrayMathInput(int[] x) {
		int y =0;
		
		for (int a = 0; a < x.length; a++) {
				y+= x[a];
		}
		for(int b = 0;b<x.length;b++) {
			
				if(x[b]>y/x.length) {
					System.out.print(x[b]+" ");
				}
		}	
		System.out.print( "平均值 : "+y/x.length);
	}
	public static void main(String[] args) {
		Homework1 h = new Homework1();
		int[] x = {29,100,39,41,50,8,66,77,95,15};
		h.arrayMathInput(x);
	}
}
