package study07.Animal;

import util.ScanUtil;

public class AnimalMain {

	public static void main(String[] args) {
		
//		Animal ani = new Cat();
//		
//		
//		Animal ani2 = new Dog();
//		Dog dog = (Dog)ani2;   // 강제 타입 변환
		
//		Dog dog = new Animal();   // 이렇게는 안들어감.
		
		int sel = ScanUtil.nextInt("1 고양이, 2 강아지, 3 오리");
		Animal ani = null;
		if(sel ==1) {
			ani = new Cat();
			
			Cat cat = new Cat();
			cat.grum();    // 캣에만 있는 메소드는 다형성이 구현 안되서 형변환 한건 사용 못함.
			
		}
		if(sel==2) {
			ani = new Dog();
		}
		if(sel==3) {
			ani = new duck();
		}
		ani.cry();

	}
	
}
