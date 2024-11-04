package day03;

public class HumanTest {
	public static void main(String[] args) {
		Human hum = new Human();
		System.out.println("age"+hum.age);
		System.out.println("flag_lang: "+hum.flag_lang);
		hum.momstouch();
		hum.eatDekkuk();
		System.out.println("age"+hum.age);
		System.out.println("flag_lang: "+hum.flag_lang);
	}
}
