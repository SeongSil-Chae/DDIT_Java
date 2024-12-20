package study06.homework;

import study05.sec03.Month;

public class Homework16 {
	public static void main(String[] args) {
		Homework16 p = new Homework16();
		p.process();
	}
	public void process() {
		 p(Planet.EARTH);
	}
	
	public void p(Planet pla) {
		System.out.println(pla.name+", 반지름:"+ pla.r+", 둘레: "+ pla.perimeter+"km");
	}
	

enum Planet {
	// 수금지화목토천해
	// 필드로 이름, 행성 반지름, 행성 둘레
	// 생성자 반지름 -> 둘레가 만들어지게 할 것.

	// ex) Planet.EARTH.print(); -> 지구, 반지름 : 6400km, 둘레 : 42000km

	
	MERCURY("MERCURY",2439), VENUS("VENUS",6051), EARTH("EARTH",6371), MARS("MARS",3390),
	JUPITER("JUPITER",69911), SATURN("SATURN",58232), URANUS("URANUS",25362), NEPTUNE("NEPTUNE",24622);
	
	
	
	String name;
	int r;
	double perimeter;
	
	Planet(String name, int r){
		this.name = name;
		this.r = r;
		this.perimeter = 2*r*Math.PI;
	}
		
}	
	
}	


