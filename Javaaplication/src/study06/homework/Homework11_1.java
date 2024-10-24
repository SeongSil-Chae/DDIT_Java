package study06.homework;

public class Homework11_1 {
	public static void main(String[] args) {
	
		Point p1 = new Point(5,5);
		System.out.println(p1);
		Circle c1 = new Circle(p1, 7);
		System.out.println(c1);
		Cylinder cy1 = new Cylinder(c1, 10);
		System.out.println(cy1);
	}
	
}
class Cylinder{
	// 원, 높이, 부피 원의 넓이 * 높이 (생성자 호출시 부피 자동으로 계산) 
	int h;
	double volume;
	Circle circle;
	
	public Cylinder(Circle circle, int h) {
		this.circle=circle;
		this.h = h;
		volume= circle.area * h;
		
	}


	@Override
	public String toString() {
		return "Cylinder [h=" + h + ", volume=" + volume + "]";
	}
	
}

class Circle{
	Point pointer;
	double pi = Math.PI;
	double r;
	double area;
	double round;
	
	// 원 중심 좌표, 반지름 길이, 넓이:pi*r*r , 원의 둘레: pi*2*r (생성자 호출시 넓이, 둘레 계산되게 할 것)
	
	public Circle(Point pointer, double r) {
		this.pointer = pointer;
		this.r = r;
		area = r*r*pi;
		round = pi*2*r;
	}

	@Override
	public String toString() {
		return "Circle [pi=" + pi + ", r=" + r + ", area=" + area + ", round=" + round + "]";
	}


	}
	


class Point{
	 // x, y
	
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}