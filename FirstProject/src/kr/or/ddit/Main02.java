package kr.or.ddit;

public class Main02 {
	public static void main(String[] args) {
		int a=  1;
		float b =2.2f;
		
		String c = "3";
		
		boolean d = true;
		boolean e = false;
		
		System.out.println(a+b);
		System.out.println(a+Integer.parseInt(c));
		
		if(d || e) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
