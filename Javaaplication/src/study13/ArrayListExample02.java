package study13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
	public static void main(String[] args) {
		// arrayList에 1~10의 값을 넣고 총합을 구하시오
		
		List<Integer> list = new ArrayList();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		int sum =0;
//		for (int i = 0; i < list.size(); i++) {
//			sum+=list.get(i);
//		}
		
		for(int num : list) {
			sum+=num;
		}
		
		System.out.println(sum);
		
		
	}
	
}
