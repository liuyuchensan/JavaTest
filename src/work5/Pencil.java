package work5;

public class Pencil extends Pen{
	
	public  void write() {
		System.out.println("削鉛筆再寫");
	}
	public int setPrice(double price) {
		int x = 0;
		if(price>0) {
		 x = (int)(price*0.8);
	}else {
		System.out.println("價格不能小於0");
	}
		
		return x;
   }
	public Pencil(double x) {
		System.out.println(setPrice(x));
	}
}
