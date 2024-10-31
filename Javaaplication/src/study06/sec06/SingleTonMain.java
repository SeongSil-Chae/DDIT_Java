package study06.sec06;

public class SingleTonMain {
	public static void main(String[] args) {
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		SingleTon s4 = SingleTon.getInstance();
		
		System.out.println(s4.a);
	}
}
