package study05.sec03;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.process();
	}
	
	
	public void process() {
		double result = cal(10, 5, Operator.ADD);
		System.out.println(result);
	}
	
	public double cal (int a, int b, Operator oper) {
		if(oper == Operator.ADD) return add(a,b);
		if(oper == Operator.SUB) return sub(a,b);
		if(oper == Operator.DIV) return div(a,b);
		if(oper == Operator.MUL) return mul(a,b);
		if(oper == Operator.PER) return per(a,b);
		return 0;
	}
//	public double cal(int a, int b, String oper) {
//		if(oper.equals("+")) return add(a,b);
//		if(oper.equals("-")) return sub(a,b);
//		if(oper.equals("/")) return div(a,b);
//		if(oper.equals("*")) return mul(a,b);
//			
//		System.out.println("사용할 수 없는 연산자입니다.");
//		
//		return 0;
//	}
	
	// + - / * 메소드 만들기
	
	private double add (int a, int b) {
		return a+b;
	}
	private double sub (int a, int b) {
		return a-b;
	}
	private double div (int a, int b) {
		return a/b;
	}
	private double mul (int a, int b) {
		return a*b;
	}
	private double per (int a, int b) {
		return a%b;
	}
	
	
}
