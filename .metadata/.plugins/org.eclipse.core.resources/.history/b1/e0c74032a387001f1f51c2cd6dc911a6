package study04.sec04;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method4() {
		// 회원 등급
		// 1: VIP
		// 2: 우수
		// 3: 일반회원
		// 그외: 잘못 입력하셨습니다. 출력
		
		System.out.println("회원등급은? ");
		int point = sc.nextInt();
		
		switch (point) {
		case 1:
			System.out.println("VIP");
			break;
		case 2:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("일반회원");
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
	}
	
	public void method3(){
		// KOR -> 한국
		// JPN -> 일본
		// CHN -> 중국
		
		System.out.println("나라를 입력하세요.");
		String nation = sc.next();
		
		
		switch (nation) {
		case "KOR" :       // 넣어주는 변수랑 같은 타입으로 넣어야 함.
			System.out.println("한국");
			break;
		case "JPN" :
			System.out.println("일본");
			break;
		case "CHN" :
			System.out.println("중국");
			break;

		default:
			break;
		}
		
	}
	public void method2() {
		// 학점 구하기 문제 2
		int score = 90;
		
		switch (score/10) {
		case 10: // 10이 문제 없으면 통과 될 수 있다.
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
	
	public void method1() {
		int num = 2;
		
		switch (num) {
		case 1 :
			System.out.println("1");
		case 2 :
			System.out.println("2");	
		default:
			System.out.println("그 외 값들");
			break;
		}
	}
}
