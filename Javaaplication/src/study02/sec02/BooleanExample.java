package study02.sec02;

public class BooleanExample {
	public static void main(String[] args) {
		// 논리형 : ture/false
		// 1 byte 조건문과 제어문의 실행 흐름을 변경하는데 사용
		
		boolean flag = false;
		System.out.println("flag="+flag);
		
		flag = 1<2; // 이게 맞다면 트루 라고 출력 되는 느낌.
		System.out.println("flag=" + flag);
	}
}
