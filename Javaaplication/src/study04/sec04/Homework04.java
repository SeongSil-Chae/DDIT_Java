package study04.sec04;

import java.util.Scanner;

public class Homework04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework04 obj = new Homework04();
		obj.process();
	}

	public void process() {
		// 가위 바위 보
		// 1 2 3
		// ex) user : 가위 com : 보
		// 결과 : 이겼다.

//		int user= (int)(Math.random()*3)+1;
		System.out.println("가위(1) 바위(2) 보(3)");
		int user = sc.nextInt();
		System.out.println("가위(1) 바위(2) 보(3)");
		int com = sc.nextInt();

		switch (user) {
		case 1:
			System.out.println("user: 가위");
			break;
		case 2:
			System.out.println("user: 바위");
			break;
		case 3:
			System.out.println("user: 보");
			break;

		default:
			break;
		}
		switch (com) {
		case 1:
			System.out.println("com: 가위");
			break;
		case 2:
			System.out.println("com: 바위");
			break;
		case 3:
			System.out.println("com: 보");
			break;

		default:
			break;
		}
		if((com==1 && user==2)||(com==2 && user==3)||(com==3 && user==1)) {
			System.out.println("user가 이겼다.");
		}	
		
		if((user==1 && com==2)||(user==2 && com==3)||(user==3 && com==1)) {
			System.out.println("com가 이겼다.");
		}

		if((user==1 && com==1)||(user==2 && com==2)||(user==3 && com==3)) {
			System.out.println("com과 user가 비겼다.");
		}
		
		
		// 선생님 풀이
//		int com = (int)(Math.random()*3)+1;
//		
//		if (comm==user) {
//			
//		}
//		else if((user ==1 && com==2) ||(user ==2 && com==3)||(user ==3 && com==1) )  {
//			System.out.println("컴이 이겼다.");	
//		}
//		else {
//			System.out.println("유저가 이겼다.");
//		}
		

	}
}