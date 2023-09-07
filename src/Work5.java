
public class Work5 {
	public static void main(String[] args) {
		int money = 150_0000;
		double interestRate = 0.02;
		double moneyR = money*(Math.pow(1+interestRate, 10));
		System.out.printf("本利和  %.2f:",moneyR);
		
	}
}
