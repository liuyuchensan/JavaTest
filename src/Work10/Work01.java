package Work10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Work01 {

	public static void isP(int y) {
		boolean b = true;

		for (int i1 = 2; i1 < y; i1++) {
			if (y % i1 == 0) {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println(y + " 是質數");
		} else {
			System.out.println(y + " 不是質數");
		}
	}

	public static void main(String[] args) {
		int count = 0;
		while (count < 5) {
			int y = (int) (Math.random() * 100) + 2;
			isP(y);
			count++;
		}
	}
}
