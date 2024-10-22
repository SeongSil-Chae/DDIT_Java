package study06.sec03;

public class Student {
	// 학생 이름, 나이, 국적, 호실
	String name;
	int age;
	String nation;
	String roomNo;
	
	public Student(String name, int age) {
		this(name, age, "404호");
	}
	
	public Student(String name, int age, String roomNo) {
		this(name, age, roomNo, "한국");
	}
	
	public Student(String name, int age, String roomNo, String nation) {
		this.name = name;
		this.age = age;
		this.roomNo = roomNo;
		this.nation = nation;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", nation=" + nation + ", roomNo=" + roomNo + "]";
	}
	
}
