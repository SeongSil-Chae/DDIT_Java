package study06.sec01;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name ="홍길동";
		person1.age = 253;
		person1.gender = "남자";
		person1.birth = "10월 02일";
		person1.height =185.5;
		
		System.out.println(person1);  // ToString 사용하면 주소값 말고 한번에 출력 됨. 위 데이터
		
		
		Person person2 = new Person();
		person2.name ="윤석열";
		person2.age = 50;
		person2.gender = "여자";
		person2.birth = "05월 05일";
		person2.height =150;
		
				

	}

}
