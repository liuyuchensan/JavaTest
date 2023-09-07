package work4;

public class Homework3 { //,"e","i","o","u"
	public void MathTest(String[] s) {
		int count = 0;
		String[] squ = {"a","e","i","o","u"};
		for(int i = 0;i<s.length;i++) {
		  for(int i2 =0;i2<s[i].length();i2++) {
			for(int y = 0;y<5;y++) {
				if(s[i].substring(i2,i2+1).toLowerCase().contains(squ[y])) {
					count++;
			  }
			}
		  }
		}
		System.out.print(count);
	}
	public static void main(String[] args) {
		Homework3 h = new Homework3();//22213233
		String[] s = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
		h.MathTest(s);
	}
}
