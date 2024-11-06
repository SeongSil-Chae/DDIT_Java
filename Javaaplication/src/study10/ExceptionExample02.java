package study10;

import java.util.InputMismatchException;
import java.util.Scanner;

//import util.ScanUtil;

public class ExceptionExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			int a=10;
			
			int b = sc.nextInt();
			System.out.println(a+"/ "+ b+" = "+a/b);
			System.out.println("실행문1");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();  
		}
		catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요");
	
		}
		catch (Exception e) {
			System.out.println("숫자만 입력해주세요");
	
		}
		System.out.println("실행문 .....");
		
	}
}
