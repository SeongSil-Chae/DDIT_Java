package study05.sec01;

import java.util.Scanner;

public class ReferenceType02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType02 obj = new ReferenceType02();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
	}
	
	public void method2() {
		
		String test =null;
//		String test ="";   //<< 이렇게 하면 에러남.
		
		
//		if(test.equals("") || test == null) {
//			System.out.println("값이 없다.");
//		}
		
		
		
		
		if(test == null|| test.equals("") ) {
		System.out.println("값이 없다.");
	}
//		아래랑 위랑 같은 식임
//		if(test==null) {
//			System.out.println("값이 없다.");
//		}
//		else if(test.equals("")) {
//			System.out.println("값이 없다.");
//		}
	}
	
	public  void method1() {
		
		String a = "홍길동";          // 힙에 홍길동 생김 ,스택에는 String a
		String b = "홍길동";          //스택에는 b생기지만 힙 영역에 홍길동 가져다 쓴다.
		String c = new String("홍길동");   // 뉴라고 하는건 힙에 뭔가 하나 만들어짐.a랑 다름
		String d = new String("강감찬");
		String e = new String("강감찬");
		
		System.out.println(a==b);
		System.out.println(b==c);  // 얘네는 힙의 데이터가 같냐? 물어보는거 보단 스택을 물어보는거임.
		System.out.println(c==e); 
		
		//string1.equals(string2) 
		
		System.out.println(b.equals(c));
	}
}
