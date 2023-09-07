package Work10;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Work03 {
	public static void main(String[] args) throws ParseException {

		Scanner s = new Scanner(System.in);
		String regex = "^\\d{4}(0?[1-9]|1[012])(0?[1-9]|[12][0-9]|3[01])$";
		String regex1 = "^[1-3]{1}";

		while (true) {
			System.out.println("輸入日期");
			String y = s.next();
			if (y.matches(regex)) {
				Date date = new SimpleDateFormat("yyyyMMdd").parse(y);
				System.out.println("(1)年/月/日 (2)月/日/年 (3)日/月/年");
				String ys = s.next();
				if (ys.matches(regex1)) {
					switch (ys) {
					case "1": {
						Format fy1 = new SimpleDateFormat("yyyy/MM/dd");
						System.out.println(fy1.format(date));
						break;
					}
					case "2": {
						Format fy2 = new SimpleDateFormat("MM/dd/yyyy");
						System.out.println(fy2.format(date));
						break;
					}
					case "3": {
						Format fy3 = new SimpleDateFormat("dd/MM/yyyy");
						System.out.println(fy3.format(date));

					}
					}
					s.close();
					break;
			
			
//			if (y.matches(regex)) {    //使用Builder
//				System.out.println("(1)年/月/日 (2)月/日/年 (3)日/月/年");
//				String yty = s.next();
//				if (yty.matches(regex1)) {
//					StringBuilder str = new StringBuilder(y);
//					str.insert(4, '-');
//					str.insert(7, '-');
//					String sty = str.toString();
//					String[] tokens = sty.split("-");
//
//					switch (yty) {
//					case "1":
//						System.out.println(tokens[0] + "/" + tokens[1] + "/" + tokens[2]);
//						break;
//					case "2":
//						System.out.println(tokens[1] + "/" + tokens[2] + "/" + tokens[0]);
//						break;
//					case "3":
//						System.out.println(tokens[2] + "/" + tokens[1] + "/" + tokens[0]);
//					}
//					s.close();
//					break;
				} else {
					System.out.println("請輸入正確格式");
				}

			} else {
				System.out.println("請輸入正確格式");
			}
		}
	}
}
