package study07.phone;

public class PhoneMain {
	public static void main(String[] args) {
//		DmbPhone dmb = new DmbPhone();
//		dmb.dmb();
//		dmb.tell();
		
//		SmartPhone sp = new SmartPhone();
//		sp.tell();
//		sp.internet();
//		sp.touch();
//		sp.dmb();
//		sp.faceTime();
		
		IPhone ip = new IPhone();
		ip.airdrop();
		ip.appstore();
		ip.camera();
		ip.dmb();
		ip.faceTime();
		ip.tell();
		ip.internet();
		
		
	}
	
}
