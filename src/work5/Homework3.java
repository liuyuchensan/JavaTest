package work5;

public class Homework3 {
	public int arrayMathInput(int[][] x) {
		int max =0;
		for (int a = 0; a < x.length; a++) {
			for (int b = 0; b < x[a].length; b++) {
				if(x[a][b]>max) {
				max = x[a][b];
			}
		  }
		
	  }
		return max;
  }
	public double arrayMathInput(double[][] x) {
		double max =0;
		for (int a = 0; a < x.length; a++) {
			for (int b = 0; b < x[a].length; b++) {
				if(x[a][b]>max) {
				max = x[a][b];
			}
		  }
		
	  }
		return max;
  }
	public static void main(String[] args){
		int[][] intArray= {{1,6,3},{9,5,2}};
		double[][] doubleArray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		Homework3 h = new Homework3();
		System.out.println(h.arrayMathInput(doubleArray));
		System.out.println(h.arrayMathInput(intArray));
	}
}
