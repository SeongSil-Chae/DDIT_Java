package study03.sec03;

import java.util.Scanner;

public class CastingExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CastingExample02 obj = new CastingExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
	}

	public void method1() {
		// int -> String
		int i1 = 10;
//		String s1 = String.valueOf(i1); // 아래것과 결과가 같음.
		String s1 = "" + i1;
		System.out.println("s1=" + s1);
	}

	public void method2() {
		// String -> 기본타입 변환
		// 기본타입 변수명 = 기본타입 (앞글자 대문자).parse기본타입(앞글자 대문자)();
		// byte i1 = Byte.parseByte("12");
		// 기본타입 변수명 = 기본타입 (앞글자 대문자).valueOf("문자");
		// byte b1 = Byte.valueOf("12");
		
		String s1 = "1";
//		int i1 = (int)s1; // 원래 이렇게 했는데 String은 안된다.
		int i1 = Integer.parseInt(s1);
		System.out.println(i1 + 3);
		
		// String - Long
		String s2 = "100";
		long i2 = Long.parseLong(s2);
		System.out.println(i2 + 0);
		
		// String -> double
		String s3 = "12.31";
		double i3 = Double.parseDouble(s3);
		System.out.println(i3);
		
		// String -> boolean
		String s4 ="ture";
		boolean i4 = Boolean.parseBoolean(s4);
		System.out.println(i4);
		
		// String -> int
		String s5 = "-14";
		int i5 = Integer.parseInt(s5);
		System.out.println(i5);
	}
	public void method3() {
		System.out.println("국어 점수 :");
		String kor = sc.next();  // 클래스에 정의한 스캐너를 사용함.
		System.out.println("국어점수 : "+kor);
		
		System.out.println("영어 점수 :");
		String eng = sc.next();  
		System.out.println("영어점수 : "+eng);
		
		System.out.println("수학 점수 :");
		String math = sc.next();  
		System.out.println("수학점수 : "+math);
		
		String kor1 = kor;
		int k1 = Integer.parseInt(kor1);
		System.out.println(k1);
		
		String eng1 = eng;
		int e1 = Integer.parseInt(eng1);
		System.out.println(e1);
		
		String math1 = math;
		int m1 = Integer.parseInt(math1);
		System.out.println(m1);
		
		double sum = (double)(k1 + e1 + m1);
		System.out.println(sum);
		
		double avg = (double)(sum/3);
		int avg10 = (int)(avg*10);
		avg = avg10/10.0;
		System.out.println(avg);
		
		System.out.println("총점: " + sum + " 평균:"+ avg);
		
	}
}
