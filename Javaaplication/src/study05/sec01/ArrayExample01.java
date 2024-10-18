package study05.sec01;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
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
//		method8();
				
	}
	
	public void method8() {
		int[] arr = {1,2,3,4,5};
		
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			System.out.println(num);
//		}
		// 위 아래 똑같음
		// 향상된 for 문
		for (int num : arr) {
			System.out.println(num);
		}
		
	}
	
	public void method7() {
		
		int[] money = {10000, 5000, 1000, 500, 100, 50, 10};
		System.out.println("거스름돈을 입력 하세요.");
		int num = sc.nextInt();
		
		// 77770원 -> 10000원 7개 5000원 1개 1000원 1개 
		//            500원 1개 100원 2개 50원 1개 10원 2개
		
		for (int i = 0; i < money.length; i++) {
			int count = num/money[i];
			if(count==0) continue;
			System.out.println(money[i]+"원 "+count+"개");
			num %=money[i];
		}
	}
	
	public void method6() {
		int[] arr= {80, 90, 41, 67, 95};
		//최소값 구하기.
		int min = arr[0]; // or int min = integer.min_value;
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("최소값 : "+min);
	}
	
	public void method5() {
		
		int[] arr= {80, 90, 41, 67, 95};
		//최대값 구하기.
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : "+max);
	}
	
	public void method4() {
		
		// 변수 선언
		// int a;
		
		// 변수 선언 및 초기화.
		// int a = 10;
		
		int [] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public void method3() {
		//String 배열을 만들고 같은줄 사람들 이름 넣기
		// 반복문을 이용해서 출력해보기.
		
		String[] arr = new String[4];
		
		arr[0] = "김은영";
		arr[1] = "채성실";
		arr[2] = "허성진";
		arr[3] = "박현준";  
		// 참조값이 없으면 null 같이 나온다.
		// 기본값은 0 이 나온다. boolean은 false(0) 나옴.
		

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public void method2() {
		
		// int[] arr = new int[5];
		// 타입 [] 변수명 = new 타입[원소 개수];
		
		int[] arr = new int[5];
//		int arr[] = new int[5]; 가능한데 int 뒤에 [] 붙이는게 나음
		arr[0] =80;
		arr[1] =77;
		arr[2] =97;
		arr[3] =85;
		arr[4] =61;
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("총점 : "+sum+"평균 : "+(double)sum/arr.length);
		
		
	}
	
	public void method1() {
		// 학생 5명의 점수를 입력하고 평균 총점을 구하시오.
		
		int stu1 = 80;
		int stu2 = 77;
		int stu3 = 97;
		int stu4 = 85;
		int stu5 = 61;
		
		int sum = stu1 + stu2 + stu3 + stu4 + stu5;
		int avg = (stu1 + stu2 + stu3 + stu4 + stu5)/5;
		System.out.println(avg);
		System.out.println(sum);
		
		
	}
}
