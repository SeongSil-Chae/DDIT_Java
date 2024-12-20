package Homework;

import util.ScanUtil;

public abstract class Game extends Unit {
	public static void main(String[] args) {
		// Unit
		// move, attack 메소드 만들기

		// Mutal, Zealot, Marin Unit클래스 상속 받기.

		// Mutal(1번)
		// move -> 공중이동
		// attack -> 스플래시 공격

		// Zealot(2번)
		// move -> 지상이동
		// attack -> 근거리 공격

		// Marin(3번)
		// move -> 지상이동
		// attack -> 원거리 공격

		// while문을 통해서 유닛을 선택하기
		// 행동 선택하기.

		while (true) {
			int sel = ScanUtil.nextInt("1 질럿, 2 뮤탈, 3 마린");
			Unit unit = null;
			if (sel == 1) {
				unit = new Zealot2();
				System.out.println("질럿을 선택하셨습니다.");
			} else if (sel == 2) {
				unit = new Mutal2();
				System.out.println("뮤탈을 선택하셨습니다.");
			} else if (sel == 3) {
				unit = new Marin2();
				System.out.println("마린을 선택하셨습니다.");
			}
			else {
				System.out.println("1번, 2번, 3번을 고르세요."); continue;
			}
			 
			
			while(true) {
			int sel2 = ScanUtil.nextInt("행동을 고르시오 [1. 이동한다, 2. 공격한다.]");
			
			if(sel2==1) {
				unit.move();
			}
			else if(sel2==2){
				unit.attack();
			}
			else if(sel2==4) {
				System.out.println("종료합니다.");
			}
			else {
				System.out.println("1번, 2번을 고르시오.");
			}
			if(sel2==4) {
				break;
			}
			continue;
			

			}
		break;
		}

	}

}
