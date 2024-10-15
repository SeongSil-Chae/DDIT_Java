package study04.sec06;

import java.util.Scanner;

public class WileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WileExample obj = new WileExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
		
		
	}
		
	
	public void method4() {
		
		int i=0;
		while(++i>0) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		
		// 각 자리수의 합을 구하시오.
		int num = sc.nextInt();
		
		int sum =0;
		while(num>0) {
			sum += num%10;
			num /=10;
		}
		System.out.println(sum);
		
		
	}
	
	public void method2() {
		
		String menu = "==============커피 메뉴============\n";
		menu += "1. 아메리카노 \n";
		menu += "2. 카페라떼 \n";
		menu += "3. 딸기요거트스무디 \n";
		menu += "4. 종료 \n";
		
		String bill = "";
//		for(;true;) {             << 이거도 가능하다.

		while(true) 
		{
			System.out.println(menu);
			int sel=sc.nextInt();
			if(sel==1) bill+="아메리카노 \n";
			if(sel==2) bill+="카페라떼 \n";
			if(sel==3) bill+="딸기요거트스무디 \n";		
			if(sel==4) {
				
				System.out.println(bill);
				System.out.println("주문을 완료합니다.");
				break;
			}
		}
		
	}
	
	public void method1() {
		
		// while(조건식){
		//    실행문
		// } 
//		초기화식
		while(true) {
			System.out.println("실행문");
//			증감식
		}
	}
}