package study06.sec06;

public class Circle {
	private int r;
	public int x;
	public int y;
	private double area;
	
	public Circle(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		
		area=r*r*Math.PI;
	}
	
	public double getArea() {
		return area;
		
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
		area = r*r*Math.PI;
	}
	
}
