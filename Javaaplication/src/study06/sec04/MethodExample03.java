package study06.sec04;

public class MethodExample03 {
	public static void main(String[] args) {
		MethodExample03 me = new MethodExample03();
		me.a = 20;
		me.b = 30;
		me.method1();
		me.method2();

	}

	int a;

	int b;

	public void method1() {
		System.out.println("method1");
//		System.out.println("a : "+a);
//		System.out.println("b : "+b);
		MethodExample03 me = new MethodExample03();
		me.method2();

	}

	public void method2() {
		System.out.println("method2");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}