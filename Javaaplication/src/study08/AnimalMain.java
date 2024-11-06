package study08;

import util.ScanUtil;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani = null;
		int sel = ScanUtil.nextInt("선택 : ");
		if(sel==1) ani = new Cat();
		if(sel==2) ani = new Dog();
		ani.cry();

	}

}
