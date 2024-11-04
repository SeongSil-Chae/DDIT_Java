package kr.or.ddit.day02;

public class MyMetho2 {
	// 숫자적 규칙을 발견
	static void showDan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	
	public static void main(String[] args) {
		showDan(3);
		
	}
}
