package study05.sec03;

public class WeekMain {
		public static void main(String[] args) {
			WeekMain wm = new WeekMain();
			wm.process();
		}

	
	public void process() {
		week(Week.SUN);
		
		for(Week day : Week.values()) {
			System.out.println(day.name());
		}
		
	}
	
	public void week(Week day) {
		if(day == Week.SUN) System.out.println("일요일");
		if(day == Week.MON) System.out.println("월요일");
		if(day == Week.TUE) System.out.println("화요일");
		if(day == Week.WED) System.out.println("수요일");
		if(day == Week.THU) System.out.println("목요일");
		if(day == Week.FRI) System.out.println("금요일");
		if(day == Week.SAT) System.out.println("토요일");
	}
	
//	
//	public void week (int num) {
//		// 숫자를 파라미터로 할때 일~토요일까지를 출력하시오.
//		
//		if(num==0) {
//			System.out.println("일요일");
//		}
//		if(num==1) {
//			System.out.println("월요일");
//		}
//		if(num==2) {
//			System.out.println("화요일");
//		}
//		if(num==3) {
//			System.out.println("수요일");
//		}
//		if(num==4) {
//			System.out.println("목요일");
//		}
//		if(num==5) {
//			System.out.println("금요일");
//		}
//		if(num==6) {
//			System.out.println("토요일");
//		}
//		
//		
//	}
	
	
	
}