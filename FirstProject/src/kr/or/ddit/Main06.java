package kr.or.ddit;

import java.util.Arrays;

public class Main06 {

	static void changeVal(int p) {
		p = 3;
	}

	static void changeRdf(int[] p) {
		p[0] = 4;
		System.out.println(Arrays.toString(p)); // 찍히는 값
		// {4}
	}

	static void changeStr(String p) {
		p = "chunjae";
	}
	
	
	public static void main(String[] args) {
		int a = 0;
		Main06 m= new Main06(); 
		String b = "";
		int[] c = {1, 2, 3, 4, 5};
		b = "허성진";
		changeStr(b);
		System.out.println(b); // 찍히는 값
		// 허성진
		
		
		changeRdf(c);
		System.out.println(Arrays.toString(c)); // 찍히는 값
		//{1, 2, 3 , 4 ,5}
		
		a +=  m.method1(5); // 안되는 이유 확인 후 가능하게 변경
		
	}

	public  int method1(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i;
		}
		
		return result;
	}
}
