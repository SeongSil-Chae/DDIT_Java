package study06.sec05;

import java.util.Arrays;

public class StaticExample01 {

	
	int a ;
	static int b;
	
	public static void main(String[] args) {
		StaticExample01 se = new StaticExample01();
		se.a=10;
		
		StaticExample01.b =11;
		System.out.println(b);
		

		
	}
}