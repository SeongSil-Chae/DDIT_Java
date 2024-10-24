package study04.sec06;

import java.util.Scanner;

public class homework06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework06 obj = new homework06();
		obj.process();
	}

	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
	}
	
	public void method1() {
		// 구구단을 출력하시오.
		// 2*1=2 3*1=3 ........ 9*1=9
		// 2*2=2 3*2=6 ........ 9*2=18
		
		// 2*9=2 3*9=27 ....... 9*9=81
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" + i*j+ "\t");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		// 구구단을 출력 하시오.
		// 입력한 단을 제외하고 출력
		System.out.println("입력한 단을 입력");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j==dan) continue;
				System.out.print(j + "*" + i + "=" + i*j+ "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		// 구구단을 출력하시오.
		// 입력한 단까지 출력
		System.out.println("입력한 단을 입력");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j==dan) break;
				System.out.print(j + "*" + i + "=" + i*j+ "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		// 랜덤한 양의 정수 1~100이 주어질때
		// n이 홀수라면 n 이하의 모든 홀수의 합
		// n=> 5 1+3+5 =9
		// n이 짝수라면 n 이하의 모든 짝수*짝수의 합
		// n =>6 2*2 + 4*4 + 6*6 = 56
		// 을 출력하시오

		int n = (int) (Math.random() * 100) + 1;

		if (n % 2 != 0) {

			int a = 0;
			for (int i = 1; i <= 100; i += 2) {
				a += i;
				if (i == n)
					break;
			}
			System.out.println("홀수의 합? " + a);
		} else {
			{
				int b = 0;
				int m = 0;
				for (int j = 2; j <= 100; j += 2) {
					b = j * j;
					m += b;
					if (j == n)
						break;
				}
				System.out.println("짝수*짝수의 합? " + m);
			}		
			
		}
	}
}