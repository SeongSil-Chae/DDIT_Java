package study04.sec06;

import java.util.Scanner;

public class cssHomework05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		cssHomework05 obj = new cssHomework05();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method1() {
		/*
		 *    ■
		 *    ■■ 
		 *    ■■■
		 *    .
		 *    ..
		 *    ■■■■■■■■
		 *    반복문을 이용해서 출력하시오.
		 *  
		 */
		
		int row = sc.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		/*
		 *         ■
		 *        ■■ 
		 *       ■■■
		 *         .
		 *  ■■■■■■■■
		 * 
		 */
		int row = sc.nextInt();
		
		int cnt = row-1;
		for(int i= 0; i<row; i++) {
			for(int j =0; j<row; j++) { // 만약 4인 경우는 ■를 만들어주고 나머지는 공백으로 채워준다.
				if(j >= cnt) {
					System.out.print("■");
				}
				else {
					System.out.print(" ");
				}
			}
			cnt--;
			System.out.println();
		}
		
		// 선생님 풀이
		
		
	}
	
	public void method3() {
		/*
		 *  ■■■■■■
		 *  .
		 *  .
		 *  ■■■
		 *  ■■
		 *  ■
		 * 
		 */
		int row = sc.nextInt();
		
//		int cnt=row-1;
//		for(int i=0; i<row; i++) {
//			for(int j=0; j<row; j++) {
//				if(j<=cnt) {
//					System.out.print("■");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			cnt--;
//			System.out.println();
//		}
		
		//선생님 풀이
		for(int i=0; i<row; i++){
			for(int j=0; j<row-i; j++)
			System.out.print("■");
		}
		System.out.println();
		
	}
	public void method4() {
		/*
		 *  ■■■■■■
		 *       .
		 *       .
		 *     ■■■
		 *      ■■
		 *       ■
		 * 
		 */
		int row = sc.nextInt();
	
//		int cnt=row;
//		for(int i=row-1; i>=0; i--) {
//			for(int j=row-1; j>=0; j--) {
//				if(j>=cnt ) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("■");
//				}
//			}
//			cnt--;
//			System.out.println();
//		}
		
		for(int i=0; i<row; i++) {
			for(int space=0; space<i; space++) {
				System.out.print(" ");
			}
			for(int j=0; j<row-i; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
		
	}
	public void method5() {
		/*
		 *       ■
		 *      ■■■
		 *     ■■■■■
		 *      ...
		 *      
		 *      .
		 *  ■■■■■■■■■■■■
		 */
		int row = sc.nextInt();
		

//		for(int i =0; i<row; i++) {
//			for(int space =0; space<row-i; space++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<(i*2+1); j++) {
//				System.out.print("■");
//			}
//			System.out.println();
//		}
//		
		
		for(int i=0; i<row; i++) {
			for(int space =0; space<row-1-i; space++) {
				System.out.print(" ");
			}
			for(int j =0; j<1+2*i; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
		
	}
	
	public void method6() {
		/*
		 *  ■■■■■■■■■■■■
		 *       .
		 *       .
		 *     ■■■■■
		 *      ■■■
		 *       ■
		 *  
		 */
		int row = sc.nextInt();
		
//		for(int i =0; i<row; i++) {
//			for(int s=0; s<i; s++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<row-i*2; j++) {
//				System.out.print("■");
//			}
//			for(int s=0; s<i; s++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
		
		for( int i =0; i<row; i++) {
			for(int space=0; space<i; space++) {
				System.out.print(" ");
			}
			for(int j=0; j<(row-i)*2-1; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
	}
	
	public void method7() {
		/*
		 *  ■■■■■
		 *  ■   ■
		 *  ■   ■
		 *  ■■■■■
		 * 
		 *  4 -> 4*4
		 *  7 -> 7*7
		 */
		
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			System.out.print("■");
		}
		System.out.println();
		
		for(int i=1; i<row-1; i++) {
			for(int j=0; j<row; j++) {
				if(j==0 || j==row-1) {
					System.out.print("■");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("■");
		}
		System.out.println();
		
		for(int i=0; i<row; i++) {
			System.out.print("■");
		}
		System.out.println();
		
		
	}
	
}
