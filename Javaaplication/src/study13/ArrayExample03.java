package study13;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample03 {
	public static void main(String[] args) {
		int [] arr = {412, 3, 31, 9};
		
//		int cnt= 0;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]%3 ==0) cnt++;
//		}
//
//		int [] result = new int [cnt];
//		
//		cnt=0;
//		for (int i = 0; i < result.length; i++) {
//			if(arr[i]%3 ==0) result[cnt++] = arr[i];
//		}
		
		
		List<Integer> list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3 ==0) list.add(arr[i]);
		}
		System.out.println(list);
	}
}
