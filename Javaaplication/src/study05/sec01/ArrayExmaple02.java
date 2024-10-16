package study05.sec01;

import java.util.Scanner;

public class ArrayExmaple02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExmaple02 obj = new ArrayExmaple02();
		obj.process();
	}

	public void process() {
//		method1();	
//		method2();
//		method3();
//		method4();
		method5();
//		method6();

	

	}

	public void method6() {
		// 선택 정렬
		// 최소값 혹은 최대값을 맨 앞 부터 차례로 쌓아나감.

		int[] arr = { 77, 85, 61, 49, 90 };

		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		for (int num : arr)
			System.out.println(num + "\t");
	}

	public void method5() {

		// 로또 만들기.

		// 로또 45개 배열 만들기
		int[] arr = new int[45];		
		// 1~45까지 값 담기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1; 
		}
		// 배열 섞기

		for (int i = 0; i < 10000; i++) {
			int ran = (int)(Math.random()*arr.length);
			int temp = arr[0];
			arr[0]= arr[ran];
			arr[ran] = temp;
			
		}
		// 6개짜리 배열 만들기
		int[] lotto = new int[6];
		// System.arraycopy 이용해서 잘라 넣기
		System.arraycopy(arr, 0, lotto, 0, 6);
		// 6개 배열 정렬하기.
		for(int l : lotto) System.out.print(l+"\t");
		
	}

	public void method4() {
		int[] arr = { 80, 77, 92, 65, 41 };

		// 배열의 길이 -1 만큼 반복

		// 뒤에값과 비교하는 반복문
		// 마지막에는 비교할 값이 없기 때문에 배열 길이 -1 만큼 반복
		for (int i = 0; i < arr.length - 1; i++) {
			boolean pass = true; // 정렬이 완료되면 이프문 정지하기 위해
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					pass = false;
				}
			}
			if (pass)
				break;
		}
		for (int num : arr)
			System.out.print(num + "\t");
	}

	public void method3() {
		// 버블 정렬

		int[] arr = { 80, 77, 92, 65, 41 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int num : arr)
			System.out.print(num + "\t");
	}

	public void method2() {
		// 깊은 복사(deep copy)
		// 배열 공간을 별도로 확보함.
		// 1. 반복문 이용
		// 2. System.arraycopy()
		// 3. clone

		// 1. 반복문 사용
//		int[] source = {1,2,3,4,5};
//		int[] target = new int[source.length];
//		
//		for(int i=0; i<source.length; i++) {
//			target[i]=source[i];	
//		}

		// 2. System.arraycopy()
//		int[] source = {1,2,3,4,5};
//		int[] target = new int[source.length];
//		
//		System.arraycopy(source, 0, target, 0, 5);   // 소스 첫번째 부터 복사해서 타겟 첫번째부터 5번째까지 저장한다. 

//		 3. clone
		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = source.clone();

		// 배열값
		System.out.println("원본 값");
		for (int s : source)
			System.out.print(s + "\t");
		System.out.println();
		System.out.println("복사된 배열 값");
		for (int t : target)
			System.out.print(t + "\t");
		System.out.println();
		target[2] = 10;

		System.out.println("원본 값");
		for (int s : source)
			System.out.print(s + "\t");
		System.out.println();
		System.out.println("복사된 배열 값");
		for (int t : target)
			System.out.print(t + "\t");
		System.out.println();
		target[2] = 10;
	}

	public void method1() {
		// 배열 복사.
		// 얕은 복사 , 깊은 복사

		// 얕은 복사 (shallow copy)
		// 주소값만 복사. 복사된 배열이나 원본배열이 같은 주소값을 가지므로
		// 둘중에 하나가 변경되면 같이 변경됨.
		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = source;

		// 배열 값
		System.out.println("원본 값");
		for (int s : source)
			System.out.print(s + "\t");
		System.out.println();
		System.out.println("복사된 배열 값");
		for (int t : source)
			System.out.print(t + "\t");
		System.out.println();
		target[2] = 10;

		System.out.println("원본 값");
		for (int s : source)
			System.out.print(s + "\t");
		System.out.println();
		System.out.println("복사된 배열 값");
		for (int t : source)
			System.out.print(t + "\t");
		System.out.println();
		target[2] = 10;

	}

}
