package day03;

public class Human extends Animal {
	boolean flag_lang = false;
	
	public Human() {
		flag_lang = true;
		System.out.println("난 생성자");
	}
	
	void momstouch() {
		flag_lang =true;
	}
	void eatDekkuk() {
		age+= 5;
	}
	
}
