package kr.or.ddit.study01.vo;

public class Main {
	public static void main(String[] args) {
		Regions r = new Regions();
		r.setRegionId(10);
	
		
		System.out.println(r.getRegionId());
		System.out.println(r.toString());	
	}
}