package study04.sec06;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
//		method11();
		method12();
	}
	public void method12() {
		// 1+ 1/2 + 1/3 + 1/3 ....... 1/10 의 합을 구하시오.
		
		double sum = 0;
		for(double i = 1; i<11; i++) {
			sum += (1 / i);
					
		}System.out.println("합은? "+sum);
		
		
	}

	public void method11() {
		// 내가 입력한 문자부터 z까지 출력
		String str = sc.next();
		char ch = str.charAt(0);

		for (char c = 'z'; c >= ch; c--) {
			System.out.println(c);
		}
		
		// 두번째     
		for (; ch<= 'z'; ch++) {          // for 문은 항상 3개의 식이 있을 필욘 없다.
			System.out.println(ch);       // 하지만 ; 는 있어야 함.
		}
	}

	public void method10() {
		// a ~ 내가 입력한 문자까지 출력

		String str = sc.next();
		char ch = str.charAt(0);

		for (char c = 'a'; c <= ch; c++) {
			System.out.println(c);
		}

	}

	public void method9() {

		// a~z까지 출력해보기
		// 첫번째 방법
//		char ch = 'a';
//		for(int i = 0; i<26; i++) {
//		System.out.println((char)(ch+i));}

		// 두번째 방법
//		for(int i = 'a'; i<'a'+26; i++) {
//		}System.out.println((char)(i));

		// 세번째 방법
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);}
	

//	
	}

	public void method8() {
		// 30~50 까지 짝수의 합.
		int sum = 0;
		for (int i = 30; i < 51; i += 2) {
			sum += i;
		}
		System.out.println("30~50까지 짝수의 합? " + sum);

	}

	public void method7() {
		// 51~100까지 홀수의 합
		int sum = 0;
		for (int i = 51; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("51~100까지 홀수? " + sum);

	}

	public void method6() {
		// 반복문을 이용해서 1~10까지 짝수의 합을 구하시오.
		int sum = 0;
		for (int i = 2; i <= 10; i += 2) {
			sum += i;
		}
		System.out.println("짝수의 합" + sum);
	}

	public void method5() {

		// 반복문을 이용해서 1~10까지 홀수의 합을 구하시오.

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0)
				;
			{
				sum += i;
			}
		}
		System.out.println("1~10까지 홀수의 합은 " + sum);

	}

	public void method4() {

		// 11~20까지의 합을 구하시오.

		int sum = 0;
		for (int i = 11; i < 21; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	public void method3() {
		// 반복은을 이용해서 1~5까지의 합을 구하시오.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;

		}
		System.out.println(sum);
	}

	public void method2() {
		// 반복문
		// for
		// int i =0 <<== 초기화식
		// i < 10 <<== 조건식
		// i++ <<== 증감식
		for (int i = 1; i < 10; i++) {
			System.out.println("현재 i 값은 " + i);
		}
	}

	public void method1() {
		// 1+2+3+4+5

		int sum = 1 + 2 + 3 + 4 + 5;

		System.out.println("1~5까지 합은 : " + sum);

	}
}
