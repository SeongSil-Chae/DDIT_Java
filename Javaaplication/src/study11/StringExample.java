package study11;

import java.util.Scanner;

public class StringExample {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExample se = new StringExample();
//		se.method1();
//		se.method2();
//		se.method3();
//		se.method4();
//		se.method5();
//		se.method6();
//		se.method7();
//		se.method8();

	}
//	public void method8() {
//		String test = "%d * %d * %d= %d";
//		String a = String.format(test, i, j, k, i*j);
//		System.out.println(a);
//	}
	public void method7() {
		String test = " a b c\n\t";
		System.out.println("==========");
		System.out.println(test);
		System.out.println("==========");
		test = test.trim();
		System.out.println(test);
		System.out.println("==========");
	}
	
	public void method6() {
		String test = "a, b, c, d, e";
		
		String [] tokens = test.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		
	}
	public void method5() {
		String test = "2024.1024.0001.jpg";
		if(test.startsWith("2024")) {
			System.out.println("2024로 시작합니다.");
		}
		
		
		if(test.endsWith(".jpg"));{
			System.out.println("jpg로 끝납니다.");
		}
		String[] exts = {"jpg", "jpeg", "png"};
		
		boolean pass = false;
		for(String ext : exts) {
			if(test.endsWith(ext)) {
				pass = true;
				break;
			}
		}
	}

	public void method4() {
		while (true) {
			System.out.println("계속 하시겠습니까(yes/no)");
			String yn = sc.next();
//			yn = yn.toLowerCase();
//			if (yn.equals("no")) {
//				break;
//			}
			if(yn.equalsIgnoreCase("no")) break;

		}
		System.out.println("종료되었습니다.");

	}
	
	public boolean ignoreEqualsCase(String a, String b) {
		a = a.toLowerCase();
		b=b.toLowerCase();
		if(a.equals(b)) return true;
		else return false;
	}

	public void method3() {
		String test = "바보야 ";

		test = test.replace("바보", "");
		System.out.println(test);

		test = "abc123";
		test = test.replaceAll(test, test);
	}

	public void method2() {
		String test = "abc 입니다.";

		System.out.println(test);
		test = test.toUpperCase();
		System.out.println(test);
		test = test.toLowerCase();
		System.out.println(test);
	}

	public void method1() {
		String test = "abc 입니다.";

		// db = like
		if (test.equals("abc 입니다.")) {
			System.out.println("같은 문자열");
		}

		if (test.contains("abc")) {
			System.out.println("abc가 포함됨");
		}
	}
}
