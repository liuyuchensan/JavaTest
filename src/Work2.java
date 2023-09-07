
public class Work2 {
	public static void main(String[] args) {
		int egg = 200;
		int dozen = Math.floorDiv(egg, 12);	
		int remainder = egg%12;
		System.out.println("雞蛋總共是 :"+dozen+"打, "+remainder+"顆");
		}
}
