package study13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample01 {
	public static void main(String[] args) {
		// HashMap
		// Key와 value로 이루어짐
		// Key 값은 중복을 허용하지 않고 순서를 보장하지 않음.
		
		// Map 타입의 대표 컬렉션
	
		Map<String, Integer> map = new HashMap();
		map.put("채성실", 95);
		map.put("카리나", 80);
		map.put("채성실", 70);
		map.put("웬디", 61);
		
		System.out.println(map.get("채성실"));
		System.out.println(map.get("카리나"));
		System.out.println(map.get("웬디"));

		System.out.println(map.remove("웬디"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String Key = it.next();
			int value = (int)map.get(Key);
			System.out.println(Key+"\t"+value);
		}
		
	}
	
}
