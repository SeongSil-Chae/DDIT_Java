package study06.sec04;

import java.util.Date;
import java.util.Scanner;

public class Recrucive {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Recrucive obj = new Recrucive();
		obj.process();
	}

	public void process() {
//		int mul= mul(10);
//		System.out.println(mul);
		Date d1 = new Date();
		Date d2 = new Date();
		long fibo = fibo(50);
		System.out.println(fibo);
		System.out.println(d2.getTime()-d1.getTime()+"ms");
		System.out.println(fibo);
	}
	
	// 1 1 2 3 5 8 13 21 34 55 89
	// 1+1+2+3+5+8
	long [] result = new long [200];
	public long fibo(int num3) {
		if(num3==1 || num3==2) return 1;
		
		if(result[num3]==0) result[num3]= fibo(num3-1) + fibo(num3-2);

		return result[num3];
	}
	
	// 1부터 num 까지의 곱을 재귀 함수로 구현하시오.
	public int mul (int num2) {
		if(num2==1) return 1;
		return mul(num2-1)*num2;
	}
	
	public int sum(int num) {
		if(num==1) return 1;
		return sum(num-1) + num;
	}
}
