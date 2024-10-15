package study02.sec02;

public class CharExample {
	public static void main(String[] args) {
		// char : 부호없는 2byte 정수(0~65535)
		
		char c1 = 65;
		System.out.println("c1=" +c1); // 출력값이 c1=A 라고 뜸.
		
		char c2 ='a';
		System.out.println("c2="+c2); // 출력값이 c2=a 라고 뜸.
		
		char c3 = (char)(c1+1);
		System.out.println("c3="+c3);
		
		char c4='가';
		System.out.println(c4+0); // 한글 '가'를 숫자로 뭔지 알아보려면 0을 더해보면 됨. 인트로 변경되서
		
		char c5 = 44032;
		System.out.println("c5="+c5); // 44032가 '가'다.
		
		System.out.println((int)c2); 
		
		char c6 = 'E';
		System.out.println((int)c6);
		char c7 = (char)(c6 + 32);    // E 숫자를 알아보고 대문자 소문자 변경 함.
		System.out.println(c7);
		
		
	}
}