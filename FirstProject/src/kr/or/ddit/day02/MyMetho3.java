package kr.or.ddit.day02;

public class MyMetho3 {
	
	static String getGBB() {
		String ret="";
		double rnd = Math.random();
		System.out.println(rnd);
		if(rnd >=0.66) {
			ret="가위";
		}
		else if(rnd>=0.33) {
			ret="바위";
		}
		else {
			ret="보";
		}
		return ret;
	}
	
	
	public static void main(String[] args) {
		String com = getGBB();
		System.out.println("com: "+com);
	}
}
