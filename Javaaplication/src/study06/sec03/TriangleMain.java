package study06.sec03;

public class TriangleMain {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0, 0, 10, 0 ,0 ,10);
		System.out.println(t1);
		
		// 0,0 0,5 5,0
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(5, 0);
		Triangle t2 = new Triangle(p1, p2, p3);
		System.out.println(t2);
	}
}