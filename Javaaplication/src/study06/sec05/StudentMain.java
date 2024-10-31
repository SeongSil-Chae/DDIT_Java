package study06.sec05;

public class StudentMain {
	public static void main(String[] args) {
		Student.year = 2024;
		
		Student s1 = new Student();
		s1.name = "지갑전사";
		s1.age = 22;
		
		System.out.println(s1.name+", "+s1.age+", "+s1.year);
		s1.nextYear();
		System.out.println(s1.name+", "+s1.age+", "+s1.year);
		
		Student s2 = new Student();
		s2.name = "지존마법사";
		s2.age = 9;
		
		
		System.out.println(s2.name+", "+s2.age+", "+Student.year);
		s2.nextYear();
		System.out.println(s2.name+", "+s2.age+", "+Student.year);
	}
}
