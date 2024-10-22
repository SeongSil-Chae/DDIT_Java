package study06.sec03;

public class Constructor {
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10);
		Constructor c3 = new Constructor(10, 20);
	}
	
	// 기본 생성자
	public Constructor() {
		System.out.println("기본생성자");
	}
	
	// 생성자
	public Constructor(int a) {
		System.out.println("int a"+a+"를 파라미터로 가지는 생성자");
	}
	
	public Constructor(int a , int b) {
		System.out.println("int a, int b를 파라미터로 가지는 생성자");
	}
	
	public Constructor(String c , int d) {
		// 갯수는 2개지만 스트링 타입으로 섞이면 된다.
	}
	
	public Constructor( int c , String d) {
		
	}
}
