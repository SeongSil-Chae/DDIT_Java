package study02.sec02;

public class IntegerExaple {
	public static void main(String[] args) {
		// 정수형
		// 1) byte  : 1byte(-128 ~ 127)
		// 2) short : 2byte(-32768 ~ 32767)
		// 3) int   : 4byte(-2^31 ~ 2^31-1) 기본 정수형
		// 4) long  : 8byte(-2^63 ~ 2^63-1) 데이터 끝에 L(l)을 추가
		
		byte b1 = 127;
		System.out.println("b1="+b1);
//		byte b2 = 128; 컴파일 예외
		
		byte b2 = (byte)(b1 + 1);
		System.out.println("b2="+b2);
		// 오버플로우: 최대값에서 초과되는 현상 
		// 언더플로우: 최소값에서 초과되는 현상
		
		short s1 = 100;
		System.out.println("s1="+s1);
//		short s2 = s1+10; // s1= short이지만 10은 int 라서 출력이 안됨. 그래서 short 잘 안씀.
		short s2 = (short)(s1+10);
		// short 타입으로 변환 해줌 . 먼저 해줘야되서 괄호로 묶어줌 뒤에꺼도.
		// 큰걸 작은걸로 바꾸는거라 강제 타입 변환. 
		// 작은거 -> 큰거는 자동 변환.
		
		int i1 = 200;
		System.out.println("i1="+i1);
		int i2 = i1 + 100;
		
		long l1 = 100;
		long l2 = 10000000000L;
		long l3 = 200*300*400*500*600L;
		long l4 = 200L*300*400*500*600;
		// 200에 L 붙이면 뒤 전부 롱 타입으로 변경되고 
		// 600에 L 붙이면 앞에 다 인트고 뒤에만 롱 타입.
		System.out.println(l3);
		System.out.println(l4);
	}
}
