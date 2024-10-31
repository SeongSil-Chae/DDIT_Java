package study06.sec06;

public class TempMain {
	public static void main(String[] args) {
		Temp t = new Temp();
		t.setCelsius(22);
		
		System.out.println("섭씨 온도 : "+t.getCelsius());
		System.out.println("화씨 온도 : "+t.getFahrenheit());
	}
}
