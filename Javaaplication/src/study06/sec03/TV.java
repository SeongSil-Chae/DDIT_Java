package study06.sec03;

public class TV {
	// 화소, 받침대 여부, 색깔, 인치, 브랜드
	// 필드는 속성이고 클래스가 사라지면 사라짐.
	int pixel;
	boolean pedestal;
	String color;
	double inch;
	String brand;
	
	public TV(int pixel, boolean pedestal , String color, double inch, String brand) {
		this.pixel = pixel;
		this.pedestal = pedestal;
		this.color = color;
		this.inch = inch;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "TV [pixel=" + pixel + ", pedestal=" + pedestal + ", color=" + color + ", inch=" + inch + ", brand="
				+ brand + "]";
	}
}