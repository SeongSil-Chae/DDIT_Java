package kr.or.ddit.day02;

public class MyMetho {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int a = 4;  
		int b = 2; // 초기화 
			
		int sum = add(a,b);
		int min = minus(a,b);
		int mul = multiply(a,b);
		int div = divide(a,b);
		
		System.out.println("sum : "+sum);
		System.out.println("min : "+min);
		System.out.println("mul : "+mul);
		System.out.println("div : "+div);
		
		
	}
}
