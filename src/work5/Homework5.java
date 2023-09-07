package work5;

public class Homework5 {
	public void genAuthCode() {
		
		String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] sy =new  String[8] ;
		for(int i =0;i<8;i++) {
			
			if(i!=4 && i!=6&&i!= 7) {
			int ran = (int)(Math.random()*61);
			 String y = s.substring(ran,ran+1);
			 sy[i] = y; 
			}else {
			 int ran = (int)(Math.random()*9);
			 String y = s.substring(ran,ran+1);
			 sy[i] = y; 
			}
			System.out.print(sy[i]);
			}
		}
		
	public static void main(String[] args) {
		Homework5 h = new Homework5();
		h.genAuthCode();
		
	}

}
