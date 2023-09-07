package work2;

public class work3 {
	public static int score(int x) {
		int i = x;
		while (i < 10) {
			i++;
			x = i * x;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(work3.score(1));
	}
}
