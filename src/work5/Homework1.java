package work5;

public class Homework1 {
	public void numI(int x,int y) {
		for(int i = 0;i<y;i++) {
			for(int i2=0;i2<x;i2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Homework1 h = new Homework1();
		h.numI(5, 4);
	}
}
