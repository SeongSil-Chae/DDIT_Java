package study06.sec03;

public class Constructor02 {
	
	public static void main(String[] args) {
		Constructor02 c2 = new Constructor02();
		
	}
	
	public Constructor02() {
		this("a");
		System.out.println("기본생성자");
	}
	public Constructor02(String a) {
		this(a, "b");
		System.out.println("String a 파라미터로 가지는 생성자");
	}
	public Constructor02(String a, String b) {
		System.out.println("String a, String a 파라미터로 가지는 생성자");
	}
}
