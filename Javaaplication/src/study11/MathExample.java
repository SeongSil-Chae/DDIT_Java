package study11;

public class MathExample {
	public static void main(String[] args) {
		// Math 클래스 수학과 관련된 연산처리를 주로 해주는 클래스
		MathExample me = new MathExample();
//		me.method1();
//		me.method2();
//		me.method3();
//		me.method4();
//		me.method5();
		me.method6();
		
		
	}
	
	public void method6() {
		double r= Math.sqrt(4);
		System.out.println(r);
	}
	
	public void method5() {
		double bynary = Math.pow(2, 40);
		double ten = Math.pow(10, 12);
		System.out.println(bynary);
		System.out.println(ten);
		
		double percent = ten/bynary*100;
		System.out.println(percent+"%");
		
		double giga = ten/Math.pow(2, 30);
		System.out.println(giga+"GB");
		
		
	}
	
	public void method4() {
		double result = round(10.182, 3);
		System.out.println(result);
	}
	
	public double round(double d, int num) {
		double result = 0;
		
		int gop = 1;
		for(int i=1; i<num; i++) {
			gop*=10;
		}
		d = d*gop;
		result= (double)Math.round(d)/gop;
		return result;
	}
	
	public void method3() {
		long l = Math.round(10.6);
		System.out.println(l);
	}
	
	public void method2() {
		double d = Math.ceil(-10.121);
		System.out.println(d);
	}
	
	public void method1() {
		double result = Math.abs(-10.7);
		System.out.println(result);
	}
}
