package study05.sec01;

import java.util.Scanner;

public class homework09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework09 obj = new homework09();
		obj.process();
	}

	public void process() {
	method1();	
		
	}

	public void method1() {
		String[] name = { "영수", "영식", "광수", "영철", "성실" };

		// 국 영 수 총점 평균 등수
		int[][] scores = { { 80, 91, 92, 0, 0, 1 }, 
						   { 31, 100, 47, 0, 0, 1 },
						   { 66, 80, 52, 0, 0, 1 },
						   { 41, 73, 85, 0, 0, 1 }, 
						   { 55, 80, 62, 0, 0, 1 } };
		// 총점 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores.length - 2; j++) {
				sum += scores[i][j];
			}
			scores[i][3] = sum;
		}

		for (int i = 0; i < scores.length; i++) {
			scores[i][4] = scores[i][3] / 3;
		}

		// 등수 구하기

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][3] < scores[j][3]) {
					scores[i][5]++;
				}
			}
		}

		System.out.println("정렬전");
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("====================================================");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================================");

		// 정렬하기.
		// 정렬은 1차원 배열 자체를 바꾼다.
//		int [][] temp = new int[5][6]; 
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length-1; j++) {
				if(scores[j][5]>scores[j+1][5]) {
					int []  temp =	scores[j];
					scores[j] = scores[j+1];
					 scores[j+1] = temp;
					 
						String temp1 =	name[j];
						name[j] = name[j+1];
						name[j+1] = temp1;
				}
			}
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
