package study03.sec01;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		obj.process();
	}

	public void process() {
		// 이항연산자 : 대부분의 연산자 (a+b)< 두개의 연산자 있어서
		//           산술연산자, 관련연산자, 논리연산자, 비트 연산자, 대입 연산자
		
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		
	
	}
	
	public void method6() {
		// 대입 연산자
		// = += -= *= /= %=
		// 우선순위가 가장 늦다
		
		int a=10;
		int b=7;
		System.out.println("a=a+b => a+=b =>" + (a+=b)); //a=a+b => a+=b =>17
		System.out.println("a=a-b => a-=b =>" + (a-=b)); //a=a-b => a-=b =>10
		System.out.println("a=a*b => a*=b =>" + (a*=b)); //a=a*b => a*=b =>70
		System.out.println("a=a/b => a/=b =>" + (a/=b)); //a=a/b => a/=b =>10
		System.out.println("a=a%b => a%=b =>" + (a%=b)); //a=a%b => a%=b =>3
		
	}
	
	public void method5(){
		//비트 연산자
		// << >>
		// 2진법으로 적어서 숫자를 왼쪽 오른쪽으로 옮겨서 계산한다. (잘 안씀)
		int a = 20;
		System.out.println(a>>2); // 나누기 4와 같다. // a>>3이면 8 나누기
		System.out.println(a<<2); // 곱하기 4와 같다.
	}
	
	
	public void method4() {
		// 논리 연산자 2 (잘안씀)
		// & |
		// 2진법으로 변경하여 두가지 숫자의 &: 중복되는 부분 합 | : 하나라도 해당되는 값 합
		int a = 24;
		int b = 40;
		
		System.out.println(a&b);
		System.out.println(a|b);
		
	}
	
	public void method3() {
		//논리 연산자
		// && || !
		// ! : 부정
		// A && B : A B 중 하나라도 거짓이면 거짓
		// A || B : A B 중 하나라도 참이면 참
		
		boolean a = true;
		boolean b = false;
		
		System.out.println((a&&b)&&(a||b)); // 실행안됨 (드 모르간의 법칙 검색)
		System.out.println(!a||b); // 거짓
		System.out.println(a||b); // 참
		System.out.println(a&&b); // 거짓
		
	}
	public void method2() {
		//관계 연산자
		// > < == >= <= !=
		
		int a = 10 ;
		int b = 7;
		
		if (a>b) {
			System.out.println("a가 b 보다 크다");
		}
		if(a<b) {
			System.out.println("a가 b보다 작다");
		}
		if(a==b) {
			System.out.println("a b 같이 같다");
		}
		if(a>=b) {
			System.out.println("a가 b 보다 같거나 크다");
		}
		if(a<=b) {
			System.out.println("a가 b 보다 같거나 작다");
		}
		if(a!=b) {
			System.out.println("a b 값이 같지 않다.");
		}
		
	}
	
	public void method1() {
		// 산술연산자
		// + - / * %
		
		int a = 10;
		int b = 7;
		System.out.println("a : "+a +"b : " +b);
		System.out.println("a+b =" +(a+b));
		System.out.println("a-b =" +(a-b));
		System.out.println("a/b =" +(a/b));
		System.out.println("a*b =" +(a*b));
		System.out.println("a%b =" +(a%b));

	}
}
