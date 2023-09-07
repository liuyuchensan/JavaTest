package work2;

public class work7 {
	public static void text(int j,int r) {   //方法二練習
		int i2 = j;
		for (int i = 1; i < r; i++) {
			for (int i1 = 1; i1 < i; i1++) {
				System.out.print((char)i2);
			}
			i2++;
			System.out.println();
		}
	}
	public static void main(String[] args) {

		for (char y = 'A'; y < 71; y++) {   //方法一練習
			for (int x = 64; x < y; x++)
				System.out.print((char) y);
			System.out.println();
		}
		System.out.println("================");
		text(64,8);

	}
}
