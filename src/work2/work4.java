package work2;

public class work4 {

	public static void score(int x) {
		int y = 1;
		for (int i = 1; y <= 100; i++) {

			System.out.println(y);

			y += x += 2;

		}

	}

	public static void main(String[] args) {
		work4.score(1);
	}
}
