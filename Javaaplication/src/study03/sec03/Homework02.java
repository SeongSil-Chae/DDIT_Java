package study03.sec03;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Homework02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework02 obj = new Homework02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해 문자를 입력 받고 
		 *  소수점 2째짜리 까지 출력하시오 
		 *  
		 */

		System.out.println("실수를 입력해주세요.");
		String num = sc.next();
		
		System.out.println(num);
		String num1 = num;
		int num2 = Integer.parseInt(num1);
		System.out.println(num2);
		
		int sum = num2*100;
		System.out.println(sum);
		double sum2 = (double)(num2/100.00);
		System.out.println(sum2);
		
		//선생님 풀이
		double d = Double.valueOf(num);
		
		int d100 = (int)(d*100);
		d= d100/100.0;
		System.out.println("소수점 2째자리 출력: " +d);
				
		

	}
	
	public void method2() {
		/*
		 *  영어 대문자를 입력 받고 소문자로 변환 
		 */
		System.out.println("영어 대문자를 입력하시오");
		String s = sc.next();
		char ch = s.charAt(0); // 대문자 A 출력함
		int i = (int)ch;
		System.out.println(i);// char ch를 소문자 a로 변경해야함.
		i = i+32;
		char a = (char)i;
		System.out.println(a);
	
		// 선생님 풀이
//		System.out.println("영어 대문자를 입력하시오");
//		String s = sc.next();
//		char ch = s.charAt(0);
//		System.out.println(ch);
//		ch=(char)(ch+32);
//		System.out.println("소문자 : " +초);
//		

		

		
	}
	
	public void method3() {
		/*
		 *  영어 소문자를 입력 받고 대문자로 변환
		 */
		System.out.println("영어 소문자를 입력하시오");
		String s = sc.next();
		char ch = s.charAt(0);
		int i = (int)ch;
		System.out.println(i);// char ch를 소문자 a로 변경해야함.
		i = i-32;
		char a = (char)i;
		System.out.println(a);
	}
	
	public void method4() {
		/*
		 * 	스캐너를 통해서 3자리 숫자를 입력 받고 각 자리수의 
		 *  합을 구하시오.
		 *  ex) 123 -> 1+2+3 -> 6 
		 */
		
		System.out.println("3자리 숫자를 입력하세요");
		String s = sc.next();
		System.out.println(s);
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		
		int a1 = (int) (a-48);
		int b1 = (int) (b-48);
		int c1 = (int) (c-48);
		
		System.out.println(a1+b1+c1);
		
		//선생님 풀이
//		System.out.println("3자리 숫자를 입력하세요");
//		String s = sc.next();
//		
//		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		char c3 = s.charAt(2);
		
		int sum = c1 -'0'+'0'+c3-'0';
		System.out.println("3자리 숫자의 합은 = " +sum);
		
		//2번째 방법 선생님
		int i = Integer.parseInt(s);
		
//		int a = i/100;
//		i= i-100*a;
//		
//		int b = i/10;
//		i = i-10*b;
//		
//		int c = i;
		
		System.out.println(a+b+c);
		
	
		
	}
	
	public void method5() {
		/*
		 * (풀 수 있는 사람만)
		 *  스캐너를 통해 문자를 입력 받고 
		 *  소수점 2째짜리 까지 '반올림'하여 출력하시오 
		 *  ex) 12.1213 -> 12.12
		 *      12.1271 -> 12.13 
		 */
		
//		double a = 12.616;
		String s = sc.next();
		
		double a = Double.parseDouble(s);
		
		// 선생님 첫번째 방법
	
//		int b = (int)a;
//		int c = (int)((a-b)*2);
//		System.out.println(b+c);
		// 내가 한 방법
//		
		a = (int)(a*100 +0.5) / 100.00;
		System.out.println(a);
		
		//선생님 두번째 방법
		a = a+0.005;
		// 소수점 2째자리까지 표기 / 1번문제랑 같이 하면됨.(현재 미완성)
		int b = (int) a;
	}
	
}
