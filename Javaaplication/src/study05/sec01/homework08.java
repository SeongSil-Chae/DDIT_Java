package study05.sec01;

import java.util.Iterator;
import java.util.Scanner;

public class homework08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework08 obj = new homework08();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
//		method3();
	}
	public void method3() {
		// -2*4+2-3.4
		// 계산식을 입력 받았을때 해당 계산식을 완료하시오.
		String str = sc.next();
		
		// step0 부호연산자와 연산자 구분
		
		// step1 연산자와, 숫자를 분리 할것.
		
		// step2 4칙연산 우선순위를 확인할 것.
		
		// 전체 계산하기.
		
	}
	
	public void method2() {
		int[] arr = { 80, 91, 77, 65, -10, -1000 };
		// 배열값 두 개의 곱이 최소가 되는값을 출력하시오.

		int min = arr[0]*arr[1];
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++ ) {
				if(min>arr[i]*arr[j]) {
					min=arr[i]*arr[j];
				}
			}
		}
		System.out.println("뭐가 나올까? " + min);

	}

	public void method1() {
		int[] arr= {80,91,77,65,-10,-1000};
		// 배열값 두 개의 곱이 최대가 되는값을 출력하시오.
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int value = arr[i] * arr[j];
				if (value > max) {
						max = value;
					}
			}
		}
		System.out.println("뭐가 나올까? " + max);
		
		}
		
		
		
		
	}

