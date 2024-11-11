package study13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetExample01 {
	public static void main(String[] args) {
		// 순서를 보장하지 않고, 중복으로 허용하지 않는다.
		
//		
//		Set set = new HashSet();
//		
//		set.add("2");
//		set.add("1");
//		set.add("1");
//		set.add(1.1);
//		
//		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		set.remove("1");
//		
//		set.contains("1");
		
		
		Set set = new HashSet();
		while(set.size()<6) {
			set.add(new Random().nextInt(45)+1);
		}
		System.out.println(set);
		
		
	}
	
	
}
