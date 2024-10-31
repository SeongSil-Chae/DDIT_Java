package study06.sec06;

public class Temp {
	private double Celsius;
	private double fahrenheit;
	// 섭씨 넣을때 화씨로 변경 된 값을 저장
	
	public double getCelsius() {
		return Celsius;
	}
	public void setCelsius(double celsius) {
		Celsius = celsius;
		this.fahrenheit = celsius*9/5+32;
	}
	public double getFahrenheit() {
		return fahrenheit;
	}

	
	
	
	
}
