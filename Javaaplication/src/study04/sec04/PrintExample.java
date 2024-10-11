package study04.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
	}
	public void method2() {
		//printf
		// ("형식지정문자열" , 변수 리스트)
		System.out.printf("문자열 : %s, 정수 : %d, 실수 : %f ", "abc", 1, 0.3);
		
		// 정수형
		// "%[[-|0]n]d 10진 정수
		// - : 왼쪽 정렬
		// 0 : 남은 왼쪽 빈공간에 0으로 채움

		
		System.out.printf("%d  \n", 1000 );
		System.out.printf("%8d  \n", 1000 );   // 왼쪽 4칸 공백
		System.out.printf("%-8d  \n", 1000 );  // 오른쪽 4칸 공백
		System.out.printf("%08d  \n", 1000 );  // 왼쪽 4칸 0으로 채움
	}
	
	public void method1() {
		// println (다음줄로 넘기고 출력함)
		System.out.println("println");
		System.out.println("대전시");
		System.out.println("중구");
		System.out.println("계룡로");
		
		// print (다음줄로 안넘기고 출력됨)
		System.out.print("print  ");
		System.out.print("대전시  ");
		System.out.print("중구   ");
		System.out.print("계룡로");
		
	}
}
