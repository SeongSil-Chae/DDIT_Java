package study02.sec01;

public class VarExample04 {
	
	static int a = 10;

	public static void main(String[] args) {
		int b = 11;
		
		if(true) {
			int c = 12;
		}

		int c = 13;
	}

	public static void method1() {
		int b = 14;
		int e = 15;
	}
}
// 위 블럭에 따라 사용할 수 있는 변수가 다르다. 사용할 수 있는 위치 구분