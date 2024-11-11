package study13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample01 {
	public static void main(String[] args) {
		// 순서를 보장하고 중복을 허용한다.
		List list = new ArrayList();

		list.add("1");
		list.add("abc");
		list.add(3);
		list.add("1");
		list.add(new Member("이름"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Member member = (Member)list.remove(4);
		
		System.out.println(member.name+"님이 탈퇴 하셨습니다.");
		
	}
}
class Member{
	String name;
	public Member(String name) {
		super();
		this.name = name;
	}
	
}