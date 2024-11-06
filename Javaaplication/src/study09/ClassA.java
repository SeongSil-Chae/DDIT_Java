package study09;

public class ClassA {

	
	public static void main(String[] args) {
		// classB 객체 생성 후 b에다가 10 넣기
	
		// ClassC 객체 생성후 c에다가 20 넣기.
		
		new ClassA.ClassC().c = 20;
		ClassB Classb;
	}
	class ClassB{
		int b;
		
	}
	
	static class ClassC{
		int c;
	}
}