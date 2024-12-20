package study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		// 문자(char)와 문자열(String)
		// 문자 : 한 글자 데이터로 ''로 묶어 선언 => char
		
		// 문자열 : 복수개의 문자로 구성된 자료(기본타입은 아님) ""로 묶어 선언 =>String
		
		String str1 = "abcd";
		
		String str2 = "1234";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+str2);
		
		int a = 20;
		int b = 24;
		// a랑 b를 이용해서 2024 출력해보기
		String year = ""+a+b;   // ★ 숫자를 문자열로 변경할때 앞에 "" "" 를 붙이면 문자처럼 이어붙어짐.
								// "" "" 뒤에 넣으면 앞에 숫자는 더하기 됨.
		System.out.println(year);
		
	
		// 이스케이프 문자 \(역슬래시)
		// \n : 개행
		// \r : 개행
		// \r\n : 개행
		// \t : 탭 문자
		// \\ : 역슬래시 문자 출력
		// \" : 큰따옴표 출력
		// \' : 작은 따옴표 출력
		// \: 문자의 기능을 뺏어온다.
		
		// "채성실" <= 출력하기
		System.out.println("\"채성실\"");  // 이러면 "채성실" 출력됨.
		
//		// "404호", "채성실"
		System.out.println("\"404호, \"채성실\"");
		
		// \\ : "\" 문자 출력 
		System.out.println("\\\\ : \"\\\" 문자 출력");
		System.out.println("a\tb\tc"); // a,b,c, 사이에 탭 됨.
	}
}
