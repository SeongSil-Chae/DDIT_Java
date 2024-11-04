package kr.or.ddit.Util;

import java.util.Scanner;

public class ScanUtil {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String next(String message) {
		System.out.println(message);
		return sc.nextLine();
	}
	
	
	
	public static int nextInt(String message) {
		System.out.println(message);
		return nextInt();
	}
	
	private static int nextInt() {
		
		while(true) {
			try {
				String text = sc.nextLine();
				int num = Integer.parseInt(text);
				return num;
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
		
//		return sc.nextInt();
	}
}
