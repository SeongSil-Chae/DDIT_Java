package study06.homework;

import study05.sec03.Month;

public class Homework16_1 {
	public static void main(String[] args) {
		Homework16_1 p = new Homework16_1();
		p.process();
	}
	public void process() {
//		Homework16_1 planet = new Homework16_1();
	
		Planet p1 = new Planet();
		p1.name = "MERCURY";
		p1.r = 2439;
		p1.perimeter = 2*p1.r*Math.PI;
		System.out.println("행성 이름:" +p1.name+"행성의 반지름: "+ p1.r+"행성의 둘레: "+p1.perimeter);
		
		Planet p2 = new Planet();
		p2.name = "VENUS";
		p2.r = 6051;
		p2.perimeter = 2*p2.r*Math.PI;
		System.out.println("행성 이름:" +p2.name+"행성의 반지름: "+ p2.r+"행성의 둘레: "+p2.perimeter);

	}
	
	
//	public void p(Planet pla) {
//		System.out.println(pla.name+", 반지름:"+ pla.r+", 둘레: "+ pla.perimeter+"km");
//	}
	

public class Planet {
	// 수금지화목토천해
	// 필드로 이름, 행성 반지름, 행성 둘레
	// 생성자 반지름 -> 둘레가 만들어지게 할 것.

	// ex) Planet.EARTH.print(); -> 지구, 반지름 : 6400km, 둘레 : 42000km

	
//	MERCURY("MERCURY",2439), VENUS("VENUS",6051), EARTH("EARTH",6371), MARS("MARS",3390),
//	JUPITER("JUPITER",69911), SATURN("SATURN",58232), URANUS("URANUS",25362), NEPTUNE("NEPTUNE",24622);
	
	
	
	String name;
	int r;
	double perimeter;
	
//	Planet(String name, int r){
//		this.name = name;
//		this.r = r;
//		this.perimeter = 2*r*Math.PI;
//	}
	

		
}	
	
}	


