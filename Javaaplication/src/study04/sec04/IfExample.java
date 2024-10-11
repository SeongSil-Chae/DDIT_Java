package study04.sec04;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
		obj.process();
	}

	public void process() {
//		System.out.println("1. if 사용법");
//		System.out.println("2. 합격 여부");
//		System.out.println("3. 학점");
//		System.out.println("4. bmi");
//		System.out.println("5. 학점 상세");
//		System.out.println("6. 계절");
//
//		int select = sc.nextInt();
//		if(select ==1) {
//			method1();
//		}
//		if(select ==2) {
//			method2();
//		}
//		if(select ==3) {
//			method3();
//		}
//		if(select ==4) {
//			method4();
//		}
//		if(select ==5) {
//			method5();
//		}
//		if(select ==6) {
//			method6();
//		}
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
//		method6();

		

	}
	

	
	
	public void method6() {
		// 월을 입력 받고 계절을 출력하시오.
		// 12 1 2 -> 겨울
		// 3 4 5 -> 봄
		// 6 7 8 -> 여름
		// 9 10 11 -> 가을
		System.out.println("계절: ");
		int month = sc.nextInt();
		
		
		if (month ==12 || month == 1 || month ==2 ) {
			System.out.println("겨울");
		}
		else if (month >=3 && month<=5 ) {
			System.out.println("봄");
		}
		else if (month >=6 && month<=8 ) {
			System.out.println("여름");
		}
		else if (month >=9 && month<=11 ) {
			System.out.println("가을");
		}
		else {
			System.out.println("잘못 입력했습니다");
		}
		
		
	}

	public void method5() {
		// 점수를 입력받고 학점을 출력하시오.
		// 90 이상 A
		// 80 이상 90 미만 B
		// 70 이상 80 미만 c
		// 60 이상 70 미만 d
		// 60 미만 F
		// 끝자리가 0~3 - 4~6 0 7~9 +

		System.out.println("점수: ");
		int score = sc.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
		}
		else if(score>80) {
			grade = "B";
		}
		else if(score>70) {
			grade = "c";
		}
		else if(score>60) {
			grade = "D";
		}
	
		if (score<=3) {
			grade+="-";
		}
		else if (score<=6) {
			grade+="0";	
		}
		else {
			grade +="+";
		}
		System.out.println(grade);
	}

	public void method4() {
		// 키와 체중을 입력하여 BMI 지수를 구하고
		// BMI 지수에 따라 정보를 출력하시오.

		// 0~18.5 : 저체중
		// 18.5이상~23미만 : 정상
		// 23이상~25미만 : 과체중
		// 25이상~30미만 : 비만
		// 30이상~ : 고도비만

		// bmi = 체중 /(키*키)

		System.out.println("몸무게 = ");
		int we = sc.nextInt();
		System.out.println("키 = ");
		double hi = sc.nextDouble();

		double bmi = we / (hi * hi);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}

	}

	public void method3() {
		// 점수를 입력받고 학점을 출력하시오.
		// 90 이상 A
		// 80 이상 90 미만 B
		// 70 이상 80 미만 c
		// 60 이상 70 미만 d
		// 60 미만 F
		System.out.println("점수: ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) { // else if 를 쓰면 && score<90 이거 생략 가능
			System.out.println("B");
		}
		if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

	public void method2() {
		// 점수를 입력받고 60점 이상이면 합격을 출력
		System.out.println("점수: ");
		int score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	public void method1() {
		// if 조건식

		if (true) {
			System.out.println("if문 블록");
		}
		System.out.println("실행문");
	}
}
