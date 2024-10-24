package study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		double add = cal.add(10, 7);
		System.out.println("add : " + add);
		double sub = cal.sub(10, 7);
		System.out.println("sub : " + sub);
		double div = cal.div(10, 7);
		System.out.println("div : " + div);
		double multi = cal.multi(10, 7);
		System.out.println("mul : " + multi);
	}

	// 파라미터 a,b 더하기 빼기 나누기 곱하기 결과물 리컨하시오.

	public double add(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double multi(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		return a / b;
	}

}
