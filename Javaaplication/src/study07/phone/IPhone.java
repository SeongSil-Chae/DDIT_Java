package study07.phone;

public class IPhone extends SmartPhone{
	
	
	public void appstore() {
		System.out.println("앱스토어 ");
	}
	
	public void airdrop() {
		System.out.println("파일 전송");
	}
	
	@Override
	public void camera() {
		System.out.println("우수한 촬영");
	}
	
}