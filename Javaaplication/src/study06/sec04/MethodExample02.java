package study06.sec04;

import java.util.Arrays;

public class MethodExample02 {

	public static void main(String[] args) {
		MethodExample02 me = new MethodExample02();
		me.method0();
		int method1 = me.method1();
		System.out.println("mehtod1 값 : " +method1);
		double method2 = me.method2();
		System.out.println("mehtod2 값 : " +method2);
		String method3 = me.method3();
		System.out.println("mehtod3 값 : " +method3);
		int[] method4 = me.method4();
		System.out.println("mehtod4 값 : " +Arrays.toString(method4));
	}

	public void method0() {
		int a= 10; // 10이면 if 문이 성립안되서 아래 실행문 1~4 나옴
		
		if(a>10) {
			System.out.println("a");
			return ;
		}
		
		System.out.println("실행문 1");
		System.out.println("실행문 2");
		System.out.println("실행문 3");
		System.out.println("실행문 4");     
	}
	public int method1() {
		System.out.println("method1");
		return 10;
	}
	
	public double method2() {
		return 10.4;
	}
	
	public String method3() {
		return "abc";
	}
	
	public int[] method4() {
		int[] arr = {1,2,3};
		return arr;
	}
	
}
