package study06.sec06;

import util.ScanUtil;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.age = ScanUtil.nextInt("나이 : ");
//		if(p1.age<0) {
//			System.out.println("잘못 입력하셨습니ㅏㄷ.");
//			p1.age = ScanUtil.nextInt("나이 : ");
//		}
//		else{
//			break;
//		
//		}
		p1.setName();
		p1.name = ScanUtil.next("이름 : ");
		
		System.out.println(p1.age+", "+p1.name);
	}
}
