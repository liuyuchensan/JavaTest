package work5;

public class Homework2 {
	public void randAvg() {
		
		int sum=0;
		for(int num =0;num<10;num++) {
			int x=(int)(Math.random()*100);
			System.out.print(x+" ");
			sum+=x;
		}
		System.out.println("平均為:  "+sum/10);
	}
	public static void main(String[] args){
		Homework2 h = new Homework2();
		h.randAvg();
	}
}
