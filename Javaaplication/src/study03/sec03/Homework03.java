package study03.sec03;

import java.util.Scanner;

public class Homework03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework03 obj = new Homework03();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
	}
	
	public void method1() {
		/*
		 *   question 변수에 랜덤한 숫자 
		 *   1~50이 있다 
		 *   
		 *   if문 조건식을 완성하여 해당 숫자를 맞추는 프로그램을 
		 *   완성하시오 
		 *   
		 *   1번 실행시 cnt 값 1 증가시킬것.
		 *   
		 */
		
		int question = (int)(Math.random()*50)+1;
		int cnt = 0; 
		while(true) {
			// cnt값 1 증가 시키기 
			cnt++;
			System.out.print("숫자를 입력하세요 : ");
			int ans = sc.nextInt();
			if(ans >question) {
				System.out.println("더 작은 수를 입력하세요");
			}
			if(ans <question) {
				System.out.println("더 큰 수를 입력하세요");
			}
			if(ans == question) {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println(cnt+"번 시행되었습니다.");
	}
	
	public void method2() {
		/*
		 *  윤년을 찾으시오.
		 *  400의 배수라면 윤년  
		 *  윤년 4의 배수이면서 100의 배수가 아닌값.
		 *  
		 *  4의 배수    :  1992 1996 2004
		 *  100의 배수(윤년 아님) : 1700 1800 1900 
		 *  400의 배수 : 1600 2000 2400 
		 */
		
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
//		boolean a = ((year%4==0) && (year!=year*100))&&((year*400==0)) ? true : false;
		if((((year%4==0) && (year%100 !=0))||(year%400==0)) ? true : false) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
	}
	
	
}
