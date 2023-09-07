package work8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class work01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
				System.out.println(it.next());
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		System.out.println();
		
		for(Object i:list) {
			System.out.println(i);
		}
		
		
		for (int i = list.size()-1; i >0 ; i--) {
			Object obj = list.get(i);
			if (!(obj instanceof Number)) {
				list.remove(obj);
			}
		}
		System.out.println("______________________");
		for(Object i:list) {
				System.out.println(i);
			}
	  }
}