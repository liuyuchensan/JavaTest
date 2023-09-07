package work3;

import java.util.Scanner;

public class work301_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		work301 tryc = new work301();
		System.out.print("請輸入三個邊長 :");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		tryc.triangleTest(x, y, z);
		scanner.close();
	}
}
