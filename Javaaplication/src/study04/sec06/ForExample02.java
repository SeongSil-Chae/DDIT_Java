package study04.sec06;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
//		method11();
		
	}
	
	public void method11() {
		//숫자를 입력받고 해당 숫자만큼 반복 후 종료
		
		int out = sc.nextInt();
		int cnt =0;
		end : for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					System.out.print(i+", "+j+"\t");
					if(++cnt==out) break end ;
			}
			System.out.println();
		}
	}
	
	public void method10() {
		// 라벨이라고 하는데 포문 앞에서 아무 문자 : 사용하고 브레이크 아무문자 : 두개 작성하면
		// 전체 포문 빠져나옴.
		
		
		A : for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(i+", "+"\t");
				if(j==5) break A;
			}
			System.out.println();
		}
		
	}
	
	public void method9() {
		//반복문이 43번 실행됬을때 종료.
		int cnt = 0;		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
					System.out.print(i+", "+j+"\t");
					if(++cnt==43) break;
			}
			if(cnt==43) break;
			System.out.println();
		}
		
	}
	
	public void method8() {
		// 구구단 출력하기
		// 입력한 숫자에 해당하는 단까지만 출력하기
		// break 문 사용
		System.out.println("제외할 단을 입력");
		int dan = sc.nextInt();

		for (int i = 2; i <= 9; i++) {
			if(i>dan) break;
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
	public void method7() {
		// break문
		// 반복문을 종료
		for(int i =1; i<=10; i++) {
			if(i==7) break;
			System.out.println(i);
		}
		
		
	}
	public void method6() {
		// 구구단 출력하기
		// 입력한 숫자에 해당하는 단까지만 출력하기
		System.out.println("제외할 단을 입력");
		int dan = sc.nextInt();

		for (int i = 2; i <= 9; i++) {
			if(i>dan) continue;
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		
	}

	public void method5() {
		// 구구단 출력하기
		// 입력한 숫자에 해당하는 단을 제외하고 출력하기
		// continue문 사용해보기  // 해당 루프만 패스한다.
		System.out.println("제외할 단을 입력");
		int dan = sc.nextInt();

		for (int i = 2; i <= 9; i++) {
			if(dan==i) continue;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			
		}

	}

	public void method4() {
		// continue 문
		// 해당 루프를 즉시 종료하고 다음 루프로 넘어간다.

		for (int i = 1; i <= 10; i++) {
			if (i == 3)
				continue;
			System.out.println(i);
		}
	}

	public void method3() {
		// 구구단 출력하기
		// 입력한 숫자에 해당하는 단을 제외하고 출력하기
		System.out.println("제외할 단을 입력");
		int dan = sc.nextInt();

		for (int i = 2; i <= 9; i++) {
			if (i != dan) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
			} else {

			}
			System.out.println();
		}

	}

	public void method2() {
		// 구구단 출력하기
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

	public void method1() {

		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j = " + j);
			}
		}

	}
}
