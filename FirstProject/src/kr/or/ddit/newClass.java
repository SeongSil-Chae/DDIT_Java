package kr.or.ddit;

import java.util.Arrays;

public class newClass {
public static void main(String[] args) {
	

//	int i; 
//	double d;
//	char c; 
//	String s;
//	
//	int a= 10;
//	double b = 10.0;
//	char ch = 'c';
//	String ss = "helloworld";
//	
////	0. 배열 생성하기
//	int [] arr1 = new int[10];
//	int [] result = new int[10];
//	// 배열 생성과 동시에 초기화 하기 -> 요소값 10개
//	int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//	// 배열 생성만하고 밑에서 값을 넣어주기 -> 요소값 10개
//	result[0] = 1;
//	result[1] = 2;
//	result[2] = 3;
//	result[3] = 4;
//	result[4] = 5;
//	result[5] = 6;
//	result[6] = 7;
//	result[7] = 8;
//	result[8] = 9;
//	result[9] = 10;
//	// for 문 사용하여 넣기
////	for (int j = 0; j < arr.length; j++) {
////		result[j] += j; 
////	}
//	
//	
//	// 향상된 반복문 이용해서 10개 넣기
//	int [] arr3 = new int [10];
//	int idx = 0;
//	for(int arr4 : arr2) {
//		arr2[idx] = idx;
//	}

	// 5. 기존 배열의 값을 역순으로 새로운 배열에 저장하세요
	// 기존 배열 = [5,6,7,8,9}
	int [] arr1 = {5,6,7,8,9};
	int [] arr2 = new int [arr1.length];
	int [] arr3 = new int [5];
	int [] arr4 = new int [5];
	// 향상된 포문
	int idx = arr1.length-1;
	for(int i : arr1) {
		arr2 [idx] = i;
		idx--;
	}
	
	System.out.println(Arrays.toString(arr2));
	
	// 전통 for 문 
	int idx2=0;
	for (int i = arr1.length-1; i >=0; i--) {
		arr3 [idx2]  = arr1[i];
		idx2++;
	}
	System.out.println(Arrays.toString(arr3));
	
	
	// 전통 for문 no 인덱스
	
	for (int i = arr1.length-1; i >=0; i--) {
		arr4 [arr1.length-i-1]  = arr1[i];
		
	}
	System.out.println(Arrays.toString(arr4));
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
