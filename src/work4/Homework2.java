package work4;

public class Homework2 {
	 public String  reverse1(String a) {
		 String s = "";
		 for(int xy = a.length();xy>0;xy--) {
			 s+=a.charAt(xy-1);
				}
		 return s;
			}
	 public static void main(String[] args) {
		 Homework2 h = new Homework2();
		 String s = "Hello World";
		 System.out.print(h.reverse1(s));
		 System.out.println();
		 for(int x = s.length();x>0;x--) {
			 System.out.print(s.substring(x-1,x));
		 }
		 
	 }
}
