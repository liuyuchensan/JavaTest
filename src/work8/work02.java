package work8;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class work02 {
	public static void main(String[] args) {
		Set<Train> set = new HashSet();
		Train[] a = new Train[7];
		Set<Train> set1 = new TreeSet();
		Train t1 = new Train(202,"普悠瑪","樹林","花蓮",400);
		Train t2 = new Train(1254,"區間","屏東","基隆",700);
		Train t3 = new Train(118,"自強","高雄","台北",500);
		Train t4 = new Train(1288,"區間","新竹","基隆",400);
		Train t5 = new Train(122,"自強","台中","花蓮",600);
		Train t6 = new Train(1222,"區間","樹林","七堵",300);
		Train t7 = new Train(1254,"區間","屏東","基隆",700);
		
		a[0]=t1;
		a[1]=t2;
		a[2]=t3;
		a[3]=t4;
		a[4]=t5;
		a[5]=t6;
		a[6]=t7;
		Arrays.sort(a);
		
		for(int i =0;i<a.length;i++) {
			set.add(a[i]);
		}
			
			Iterator sett = set.iterator();
			while(sett.hasNext()) {
				set1.add((Train)sett.next());		
			}
		
		for (Train tx : set) {
			System.out.println("班次 :"+tx.getNumber()+", 車種 :"+tx.getType()+
							   ", 出發地 :"+tx.getStart()+", 目的地 :"+tx.getDest()+
							   ", 票價 :"+tx.getPrice());
		}
		System.out.println("--------------");
		for (int i = 0; i < a.length; i++) {
			Train tc = a[i];
			System.out.println("班次 :"+tc.getNumber()+", 車種 :"+tc.getType()+
					   ", 出發地 :"+tc.getStart()+", 目的地 :"+tc.getDest()+
					   ", 票價 :"+tc.getPrice());
		}
		
		System.out.println("--------------");
		for (Train tx : set1) {
			System.out.println("班次 :"+tx.getNumber()+", 車種 :"+tx.getType()+
					   ", 出發地 :"+tx.getStart()+", 目的地 :"+tx.getDest()+
					   ", 票價 :"+tx.getPrice());

		}
		
	}
	
	
}
