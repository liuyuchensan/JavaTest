package work5;

public class InkBrush {
	public  void write() {
		System.out.println("沾墨汁再寫");
	}
	public int setPrice(double price) {
		int x = 0;
		if(price>0) {
		 x = (int)(price*0.9);
	}else {
		System.out.println("價格不能小於0");
	}
		
		return x;
   }
	public InkBrush(double x) {
		System.out.println(setPrice(x));
	}
}


