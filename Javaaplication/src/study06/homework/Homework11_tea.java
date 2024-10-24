package kr.or.ddit.homework;

public class Homework11 {
	public static void main(String[] args) {
		Point center = new Point(10, 0);
		
//		System.out.println(center.x+", "+center.y);
		System.out.println(center);
		
		Circle c = new Circle(new Point(10, 0), 5);
//		System.out.println("반지름 : "+c.r+"\n"+"중심좌표 : "+c.center.x+", "+c.center.y);
//		System.out.println("넓이 : "+c.area+"\t 둘레 : "+c.circum);
		System.out.println(c);
		
		Cylinder cy = new Cylinder(c, 10);
		
//		System.out.println("높이 : "+cy.height);
//		System.out.println("부피 : "+cy.volume);
//		System.out.println("반지름 : "+cy.c.r+"\n"+"중심좌표 : "+cy.c.center.x+", "+cy.c.center.y);
//		System.out.println("넓이 : "+cy.c.area+"\t 둘레 : "+cy.c.circum);
		System.out.println(cy);
				
	}

}
class Cylinder{
	// 원, 높이 , 부피 원의 넓이 * 높이 (생성자 호출시 부피 자동으로 계산)
	Circle c;
	int height; 
	double volume;
	
	Cylinder(Circle c, int height) {
		this.c = c;
		this.height = height;
		volume = c.area*height;
	}
	
	@Override
	public String toString() {
		return "높이 : "+height+"\n"
			+  "부피 : "+volume +"\n"
			 + "원 : "+c;
	}
}

class Circle{
	// 원 중심 좌표, 반지름 길이, 넓이pi*r*r , 원의 둘레 pi*2*r (생성자 호출시 넓이, 둘레 계산되게 할것.)
	Point center;
	int r; 
	double area; 
	double circum;
	Circle(Point center, int r){
		this.center = center; 
		this.r = r;
		area = Math.PI*r*r;
		circum = Math.PI*r*2;
	}
	
	
	@Override
	public String toString() {
		return "반지름 : "+r+"\n"
			 + "중심좌표 : "+center+"\n"
			 + "넓이 : "+area+"\n"
			 + "둘레 : "+circum;
	}
}

class Point{
	// x, y
	int x; 
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
}