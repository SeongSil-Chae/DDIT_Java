package study03.sec01;

import java.util.Scanner;

public class TrinomicalOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomicalOperator obj = new TrinomicalOperator();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method3() {
		
		// a,b 숫자를 입력 받고
		// a가 짝수라면 a+b
		// a가 홀수라면 a*b 결과를 출력하시오
		System.out.print("a 숫자 입력: ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.print("b 숫자 입력: ");
		int b = sc.nextInt();
		System.out.println(b);
		
		int c = a%2 == 0 ? a+b : a*b;
		System.out.println(c);
		
	}
	
	public void method2() {
		// 나이를 입력 받고 18세 이상이면 성년 아니면 미성년을 출력
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.println(age);
		String result = age>=18 ? "성년" : "미성년";
		System.out.println(result);
	}
	
	public void method1() {
		// 삼항 연산자 : 3개의 피연산자를 필요로 하는 연산
		//			  삼항 연산자는 ? 앞에 조건식의 결과에 따라 콜론 앞뒤의
		//			  피연산자가 선택 , 조건 연산식이라고도 함.
		
		String s = !true ? "참" : "거짓";
		
		System.out.println(s); //거짓
	}
}
