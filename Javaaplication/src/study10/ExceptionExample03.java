package study10;

import util.ScanUtil;

public class ExceptionExample03 {
	public static void main(String[] args) {
		ExceptionExample03 obj = new ExceptionExample03();
		obj.method1();

	}

	public void method1() {
		// throw
		// 예외 강제 발생
		// 일반 메소드 내부에서 사용
		// 사용 형식
		// throw 예외클래스 객체명
		// -> throw new Exception();

		while (true) {
			String name = ScanUtil.next("닉네임 : ");
			try {
				method2(name);
			} catch (NickNameException e) {
				e.printStackTrace();
			}
		}
	}

	public void method2(String name) throws NickNameException {
		if (name.contains("바보")) {
			throw new NickNameException();
		}

	}
}
class NickNameException extends RuntimeException{
	public NickNameException() {
		super("부적절한 닉네임");
	}
}


