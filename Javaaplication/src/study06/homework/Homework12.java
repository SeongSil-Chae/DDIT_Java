package study06.homework;

public class Homework12 {
	public static void main(String[] args) {
		Work peo = new Work();
		peo.process();	
	}
}

class Work {
	public void process() {

		// 학생 3명 생성하기
		People p1 = new People();
		p1.name = "카리나";
		p1.job = (int) (Math.random() * 11) + 10;
		People p2 = new People();
		p2.name = "오해원";
		p2.job = (int) (Math.random() * 11) + 10;
		People p3 = new People();
		p3.name = "윈터";
		p3.job = (int) (Math.random() * 11) + 10;
		// job 크기 10~20 랜덤값 만들기.
//		int job = (int) (Math.random() * 11) + 10;
		// while문 반복 하는동안 각 학생들이 work메소트 실행하기
		// work 숫자 만큼 job 값을 감소
		// job이 0이 된다면 end= true
		// 20% 확률로 help 실행시킴
		int hour = 6;
		while (hour++ < 10) {

			// 출력값
			if (!p1.end) {
//				System.out.println(p1.name + " 남은 작업 : " + p1.job);
				p1.work();
				p1.help();
				
				if(p1.job <=0) {
					p1.job = 0 ;
					p1.end();
				}
				System.out.println(p1.name + " 남은 작업 : " + p1.job);
			}
			
			if (!p2.end) {
				
				p2.work();
				p2.help();
				
				if(p2.job <=0) {
					p2.job = 0 ;
					p2.end();
				
				}
				System.out.println(p2.name + " 남은 작업 : " + p2.job);
			}
			
			if (!p3.end) {
				
				p3.work();
				p3.help();
				
				if(p3.job <=0) {
					p3.job = 0 ;
					p3.end();
				}
				System.out.println(p3.name + " 남은 작업 : " + p3.job);
			}
			System.out.println("================================================");
		}
	}

}

class People {
	String name;
	int job;
	boolean end;
	
	




	

	public int work() {
		// work 3~10 랜덤값
		int work = (int)(Math.random()*8)+3;
		job -= work;
	
		return work;
		
	}

	public int help() {
		// help 1~5숫자 중 3이 당첨되면 발현
		// help 당첨되면 job에 0~3 랜덤값 부여
		int help = (int) (Math.random() * 5) + 1;
		if (help == 3) {
			job += (int) (Math.random() * 4);
		}
		return help;
	}

	public void end() {
		end = true;
		System.out.println(name + " 탈출");
	}
}