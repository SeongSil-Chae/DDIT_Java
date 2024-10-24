package study06.sec04;

import java.util.Scanner;

public class Cal02 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Cal02 obj = new Cal02();
		obj.process();	
	}
	
	public void process() {
		// 숫자 a. b 스캐너로 입력 받기 연산자 입력받기. 
		// method를 통해서 결과값 리턴 받기.
		System.out.println("숫자 a : ");
		int a =sc.nextInt();
		System.out.println("연산자 : ");
		String oper =sc.next();
		System.out.println("숫자 b : ");
		int b =sc.nextInt();

		double result = cal(a,b,oper);
		System.out.println(a + oper + b+ " = " + result);
		
	}
	
	public double cal(int a, int b, String oper) {
		double result = 0;
		if(oper.equals("+")) result = add(a,b);
		if(oper.equals("-")) result =  sub(a,b);
		if(oper.equals("/"))  result = div(a,b);
		if(oper.equals("*")) result =  multi(a,b);
		return result;
	}
	
	public double add(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double multi(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		return a / b;
	}


}
