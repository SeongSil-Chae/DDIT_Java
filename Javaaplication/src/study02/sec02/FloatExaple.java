package study02.sec02;

public class FloatExaple {
	public static void main(String[] args) {
		// 1) float  : 4byte(부호 1bit , 지수 8bit, 가수 23bit )
		//				데이터 끝에 F(f) 추가
		// 2) double : 8byte(부호 1bit , 지수 11bit, 가수 52bit )
		//				기본 실수형
		// ** 실수로 정수 표현 하지만 완전 정확하진 않음. 3.2 * 10의 3승 이런식으로 표현 됨.
		// ** 대신 정수보다 훨씬 크게 표현은 가능.
		// ** 더블이 훨씬 크기 때문에 정확도가 더 높다.
		
		float f1 = 3.1415926f;
		double d1 = 3.1415926;
		
		if (f1 ==d1) {
			System.out.println("같다");
			
		}else {
			System.out.println("다르다");
			// 다르다로 출력 됨.
		}

	}
}
