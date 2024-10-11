package study04.sec04;

import java.util.Scanner;

public class IfExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample02 obj = new IfExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();

	}
	
	public void method5() {
		// a, b 숫자 2개 입력 받고 큰 값을 먼저 출력하시오.
		
		System.out.println("a 숫자? ");
		int numa = sc.nextInt();
		System.out.println("b 숫자? ");
		int numb = sc.nextInt();
		
		if (numa>numb) {
			System.out.println(numa);
			System.out.println(numb);
		}
		else {
			System.out.println(numb);
			System.out.println(numa);
		}
		
	}
	
	
	public void method4() {
		// 월을 입력 받고 마지막 일을 출력하시오.
		// 1 3 5 7 8 10 12 -> 31
		// 2 -> 28, 29
		// 나머지 30일
		System.out.println("월은? ");
		int num2 = sc.nextInt();
		
		if (num2==1 || num2== 3 || num2== 5 || num2== 7 || num2== 8 || num2== 10 ||num2== 12) {
			System.out.println("31일 입니다.");
		}
		else if (num2== 2) {
			System.out.println("28, 29일 입니다.");
		}
		else {
			System.out.println("30일입니다.");
		}
	}
	
	public void method3() {
		// 숫자를 입력받고 짝수인지 홀수인지 출력하시오.
		
		System.out.println("홀짝이냐? ");
		int num1 = sc.nextInt();
		System.out.println(num1);
		if (num1%2 ==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다");
		}
	}

	public void method2() {
		// a, b 숫자를 입력 받고 연산자를 입력 받아 계산 처리하시오.
		// ex) a= 2 b= 3 연산자 = + => 2+3 =5

		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("연산자 : ");
		String op = sc.next();

		System.out.println("b : ");
		int b = sc.nextInt();

		if (op.equals("+")) {
			System.err.println(a + b);
		}
		if (op.equals("-")) {
			System.err.println(a - b);
		}
		if (op.equals("*")) {
			System.err.println(a * b);
		}
		if (op.equals("/")) {
			System.err.println(a / b);
		}
	}

	public void method1() {
		// 정보처리 기사 점수를 입력하고 합격 여부를 판단하시오.
		// 한과목이라도 40점 미만이면 불합격
		// 평균 60점 미만이면 불합격

		System.out.println("DB : ");
		int db = sc.nextInt();

		System.out.println("전자계산기 : ");
		int cal = sc.nextInt();

		System.out.println("데이터통신 : ");
		int data = sc.nextInt();

		System.out.println("소프트웨어 공학 : ");
		int soft = sc.nextInt();

		System.out.println("OS : ");
		int os = sc.nextInt();

		if (db + cal + data + soft + os >= 300) {
			System.out.println("합격입니다.");
		} else if (db >= 40 && cal >= 40 && data >= 40 && soft >= 40 && os >= 40) {

		} else {
			System.out.println("불합격입니다.");
		}

		{

		}

	}
}
