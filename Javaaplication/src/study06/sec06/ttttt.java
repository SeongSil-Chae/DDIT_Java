package study06.sec06;

public class ttttt {

	public static void main(String[] args) {
		Person2 p1 = new Person2( 1);
		p1.age = 0;
		p1.greet();
	}

	public static void method12() {
	}
}

class Person2 {
	int age;
	String name;


	public Person2(int age) {
		this("홍길동",age);
	}
	
	public Person2(String name, int age) {
		this.age = age;
		this.name = name;
		greet();

	}

	public void greet() {
		System.out.println("hello, my name is " + name+age);
	}

}