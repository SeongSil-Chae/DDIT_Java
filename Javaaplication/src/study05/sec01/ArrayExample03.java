package study05.sec01;

import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
		method8();
		
	
	}
	public void method8() {
		// 1  10 11 20 21
		// 2  9  12 19 22
		// 3  8  13 18 23
		// 4  7  14 17 24
		// 5  6  15 16 25
		int [][] arr = new int [5][5];
		
		int cnt=1;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = cnt;
				cnt++;
			  }
			}
			else if(i%2!=0) {
				for (int j2 = arr.length-1; j2 >=0 ; j2--) {
					arr[j2][i] = cnt;
					cnt++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.print(arr[i][k]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public void method7() {
		// 1  2  3  4  5
		// 10 9  8  7  6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		
		int [][] arr = new int [5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i%2==0) {
					arr[i][j] = j+5*i+1;
				}
				else {
					arr[i][j] = 5*(i+1) -j;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void method6() {
		// 1 6 11 16 21
		// 2 7 
		// 3 8
		// 4 9
		// 5 10      25
		
		int [][] arr = new int [5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i+j*5+1;
			}
		}
		
		
		// 출력하는 식
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public void method5() {
		//  1 2 3 4 5
		//  6 7 8 9
		

		// 21 22 23 24 25
		
		int [][] arr= new int [5][5];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i+j+1;
			}
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	public void method4() {
		int[][] arr = new int [3][];
		
		System.out.println(arr);    //주소값이 나옴.
		arr[0] = new int[] {1,2,3};
		System.out.println(arr[0]);  // 주소값이 나옴.
		arr[1] = new int[] {3,4,5,6};
		arr[2] = new int[] {7,8,9,10};

		for(int i =0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void method3() {
		//학생1, 학생2, 학생3
		// 국 영 수
		int [][] arr = { {80, 70, 60 }, {92, 84, 75 }, {41, 66, 98} };
		
		// 학생1 수학 점수 출력
		int s1Math = arr[0][2]; 
		// 학생2 국어 점수 출력
		int s2kor = arr[1][0]; 
		// 학생3 영어 점수 출력
		int s3eng = arr[2][1]; 
		
		// 국어 점수 총합 / 평균
		double korSum = 0;
		double koravg = 0;
		for(int i=0; i<arr.length; i++) {
			korSum = arr[i][0];
		}
		koravg = korSum/3;
		// 영어 점수 총합 / 평균
		double engSum = 0;
		double engavg = 0;
		for(int i=0; i<arr.length; i++) {
			engSum = arr[i][1];
		}
		engavg = engSum/3;
		// 수학 점수 총합 / 평균
		double mathSum = 0;
		double mathavg = 0;
		for(int i=0; i<arr.length; i++) {
			mathSum = arr[i][2];
		}
		mathavg = mathSum/3;
		// 전체 평균 출력
		for(int i=0; i<arr.length; i++) {
			double sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
			System.out.println(sum+", "+sum/arr[i].length);
		}
		
		
	}
	
	public void method2() {
		// 학생 1 : 80 70 60
		// 학생 2 : 92 84 75		
		int [][] arr = new int [2][3];
		
		int[] stu1 = arr[0];
		stu1[0] = 80;
		stu1[1] = 70;
		stu1[2] = 60;
		
		arr[1][0] = 92;
		arr[1][1] = 84;
		arr[1][2] = 75;
		
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j = 0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("총점 : " +sum + "평균 : "+sum/3.0);
		}
		
		
		
	}
	
	public void method1() {
		int [][] arr = new int [4][5];
		int [] a1 = arr[0];
		int i = a1[0];
		int i2 = arr[1][2];
	}
}
