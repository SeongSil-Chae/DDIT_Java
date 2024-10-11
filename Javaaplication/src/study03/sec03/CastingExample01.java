package study03.sec03;

import java.util.Scanner;

public class CastingExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CastingExample01 obj = new CastingExample01();
		obj.process();
	}

	public void process() {
//		method1(); 
		method2();
		
	}
	
	public void method2() {
		
		//byte -> int 
		byte b1 = 20;
		int i1 = b1;
		System.out.println("i1="+i1);
		
		//int -> byte
		
		int i2 =50;
		byte b2 = (byte)i2;
		System.out.println("b2="+b2);
		
		//long -> double
		long i3 = 10000L;
		double d3 = i3;
		
		System.out.println("d3=" + d3);
		
		//double -> int 
		double d4 = 12.456;
		int i4 = (int)d4;
		System.out.println("i4=" +i4);
		
		//12.41231 소수점 첫째 자리만 출력하기
		double d5 =12.41231;
		int i5 = (int)(d5 * 10);
		double d6 = i5/10.0;
		System.out.println(d6);
		
		//  ** 아래 형변환 char, byte, short 등 서로 안된다. 인트는 됨. 범위가 커서
		
		// char -> byte
		
		char c7 = 'a';
		byte b7 = (byte)c7;
		System.out.println("b7="+b7);
				
		// byte -> char
		byte b8 = 90;
		char c8 = (char)b8;
		System.out.println("c8="+c8);
		
		// int -> char
		int i9 = 50;
		char c9 = (char)i9; 
		System.out.println("c9="+c9);
		
		// char -> int
		char c10 = 'a';
		int i10 = c10;
		System.out.println("c10="+c10);
		
		
		
	}
	
	public void method1 () {
		int kor = 80;
		int eng = 83;
		int math = 84;
		
		// 국어 : 80, 영어 : 83, 수학 : 84   <-- 출력하고
		// 총점 : ? 평균 : <- 출력하시고.
		
		System.out.println("국어: " + kor + "영어 " + eng + "수학 " + math);
		int sum = kor + eng + math;
		double avg = sum/3.0; // or double avg = (double)sum/3;
		int avg10 = (int)(avg*10);
		avg = avg10/10.0;
//		double c = ;
		System.out.println("총점: "+ sum + "평균: " +avg);
		System.out.println(avg); // 소숫점 첫번째 자리까지 나오게 하는 법
//	
	}
}
