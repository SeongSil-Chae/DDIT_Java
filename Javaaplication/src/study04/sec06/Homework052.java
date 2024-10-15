package study04.sec06;

import java.util.Scanner;

public class Homework052 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework052 obj = new Homework052();
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
		
		for(int i=0; i<row; i++) {
			for(int space = 0; space<row -1 -i; space++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
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
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
		
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
		
		for(int i=0; i<row; i++) {
			for(int s=0; s<i; s++)
			System.out.print(" ");
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
		for(int i=0; i<row; i++) {
			for(int space =0; space<row-1-i; space++) {
				System.out.print(" ");
			}
			for(int j=0; j<1+2*i; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		/*
		 * row =3 -> 5
		 * row =5 -> 9
		 *  ■■■■■■■■■■■■
		 *       .
		 *       .
		 *     ■■■■■
		 *      ■■■
		 *       ■
		 *  
		 */
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int s=0; s<i; s++) {
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
		 * ■■■■ ■ ■ ■ ■ ■■■■ 4 -> 4*4 7 -> 7*7
		 */
		int row = sc.nextInt();

		for (int i = 0; i < row; i++) {
				System.out.print("■");
			}
			System.out.println();

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < row; j++) {
					if (j == 0 || j == row - 1) {
						System.out.print("■");
					} 
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
			
			for (int i = 0; i < row; i++) {
				System.out.print("■");
			}
			System.out.println();

		}
	}


