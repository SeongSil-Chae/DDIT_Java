package study03.sec01;

import java.util.Scanner;

public class UnaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method3() {
		int val = 10;
		
		
		System.out.println(val---val); // 10 -9 = 1
		System.out.println(--val-val); // 9 -9 = 0
	}
	
	public void method2() {
		// 증감연산자
		// ++변수 : 다른연산을 수행하기 전에 1을 증가 시킴
		// 변수++ : 다른연산을 수행한 후에 1을 증가 시킴
		// --변수 : 다른연산을 수행하기 전에 1을 감소 시킴
		// 변수-- : 다른연산을 수행한 후에 1을 감소 시킴
		
		int val =0;
		int res =0;
		
		val = 10;
//		res = ++val;
		val = val+1;
		res = val;
		
		System.out.println("Val =" + val);
		System.out.println("res =" + res);
		
		val = 10;
		res = val++;
		
		System.out.println("Val =" + val);
		System.out.println("res =" + res);
		
		val = 10;
		res = --val;
		System.out.println("Val =" + val);
		System.out.println("res =" + res);
		
		val = 10;
		res = val--;
		System.out.println("Val =" + val);
		System.out.println("res =" + res);
		
		// val--;
		// --val; 단일로 쓸떄는 둘 차이 없음
		
	}
	
	
	public void method1() {
		//부호 연산자
		int num = 100;
		int res = -num;
		System.out.println(res);
	}
}
