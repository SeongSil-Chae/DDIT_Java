package study07.phone;

public class SmartPhone extends DmbPhone {

	public void camera() {
		System.out.println("찰칵 ");
	}
	
	public void internet() {
		System.out.println("인터넷 기능");
	}
	
	public void touch() {
		System.out.println("터치 기능 추가");
	}
	
	@Override
	public void tell() {
		System.out.println("3g 전화걸기");
	
	}
	
	public void faceTime() {
		super.dmb();
		super.tell();
	}
	
}