package study11.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.ScanUtil;

public class Homework19 {
	public static void main(String[] args) {
		Homework19 obj = new Homework19();
		obj.process();
	}
	public void process() {
	
		Calendar cal = Calendar.getInstance();
		
//		cal.set(Calendar.YEAR, 2024);
//		cal.set(Calendar.MONTH, cc-1);
		cal.set(Calendar.DATE, 1);
	
		drawCalendar(cal);
		
		while(true){
			System.out.println();
			String move = ScanUtil.next("<이전달 , 다음달> : ");
			if(move.equals(">")){
				cal.add(Calendar.MONTH, 1);
			}
			else if(move.equals("<")) {
				cal.add(Calendar.MONTH, -1);
			}

			drawCalendar(cal);
		}
			//달력 출력
			// <이전달  다음달> 입력시 이전달과 다음달 달력을 출력하시오.
		
		
		// 요일에 따라서 공백 출력
		
	

				
	}
	
	public static void drawCalendar(Calendar cal){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("------------------------------------------------------");
		System.out.println("일"+"\t"+"월"+"\t"+"화"+"\t"+"수"+"\t"+"목"+"\t"+"금"+"\t"+"토"+"\t");
		System.out.println("------------------------------------------------------");
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		for (int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.printf("\t");
		}

		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			//3부터 7개 날짜 출력 후 줄바꾸기
			
			System.out.print(i +"\t");
			 if(day%7==0) {
				 System.out.println();
 
			 }
			 day++;
		}
	}
	
	
	
}
