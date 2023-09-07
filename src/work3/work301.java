package work3;

import java.util.Arrays;

public class work301 {
	
	public void triangleTest(int x,int y,int z) {
		int[] ar = new int[3];
		ar[0] = x;
		ar[1] = y;
		ar[2] = z;
		Arrays.sort(ar);
		double ar1 =Math.pow(ar[0], 2)+Math.pow(ar[1], 2);
		double ar2 = Math.pow(ar[2], 2);
		int e = ar[0]+ar[1];
		String c =  e>ar[2]?ar1==ar2?"直角三角形":x == y||x==z? y ==z?"正三角形":"等腰三角形":"其他三角形":"不是三角形";
		System.out.print(c);
	}

}
