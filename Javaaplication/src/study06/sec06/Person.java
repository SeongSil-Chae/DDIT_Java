package study06.sec06;

public class Person {
	// 나이 이름
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		while(true) {
			if(age<0 || age>122) {
				System.out.println("나이 잘못 입력하셨습니다.");
				System.out.println("나이 : ");
			}
		
			else {
				break;
			}
		}
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}	
	
	