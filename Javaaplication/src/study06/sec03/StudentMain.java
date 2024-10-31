package study06.sec03;

public class StudentMain {

	public static void main(String[] args) {
		// 김영신 20 404호 한국
		Student s1 = new Student("김영신", 20);
		System.out.println(s1);
		// 정지훈 20 404호 한국
		Student s2 = new Student("정지홍", 20);
		// 홍두표 20 405호 한국
		Student s3 = new Student("홍두표", 20, "405호");
		// 오정균 20 401호 일본
		Student s4 = new Student("오정균", 20, "401호", "일본");
		

		
	}

	
}
