package study06.sec01;

public class Person {
	// 이름 나이 성별 키 생일
	
	String name;
	int age;
	String gender;
	double height;
	String birth;
	
	
	// alt + shift + s + s =  tostring 하면 클래스 출력 시 아래 처럼 나옴.
	@Override
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", birth="
				+ birth + "]";
	}


	

}


