package work2;

public class work2 {
	public static int score(int x) {

		for (int i = x; i <= 10; i++) {
			x = i * x;
		}
		return x;
	}

	public static void main(String[] args) {

		System.out.println(work2.score(1));
	}
}
