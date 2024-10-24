package study06.sec04;

public class MethodExample01 {
	public static void main(String[] args) {
		MethodExample01 me = new MethodExample01();
		me.method();
		me.method(1);
		me.method(2, 3);
	}
	
	public void method() {
		System.out.println("파라미터 없는 메소트");
	}
	public void method(int a) {
		System.out.println("파라미터 int a 없는 메소트 값 : "+a);
	}
	public void method(int a, int b) {
		System.out.println("파라미터 int a, int b 없는 메소트 값 : "+a+", "+b);
	}
	
}
