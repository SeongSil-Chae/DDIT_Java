package study11.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import util.ScanUtil;

public class CaladarExample {
	public static void main(String[] args) {
		CaladarExample obj= new CaladarExample();
		obj.process();
		
	}
	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method3() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		// 월은 +1 해줘야댐
		System.out.println(cal.get(Calendar.DATE));
		cal.add(Calendar.DATE, 3);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		// 일주일 중 몇번째냐? 목요일 =5 
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		// 월의 마지막 날 출력

	}
	public void method2() {
		// 스캐너를 통해 입력받은 날짜만큼 더해서
		// 해당 날짜를 2024-12-11 형태로 출력하시오.
				
		Calendar cal = Calendar.getInstance();
		int add = ScanUtil.nextInt("더할 날짜 : ");
		cal.add(Calendar.DATE, add);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(cal.getTime()));
	}
	
	public void method1() {
		Calendar cal = Calendar.getInstance();
		// add는 더해주고 빼주고 
		// set은 바꿀 수 있다.
		
//		cal.add(Calendar.DATE, 1);
//		cal.add(Calendar.HOUR, 2);
//		cal.add(Calendar.YEAR, 2);
		
		cal.set(Calendar.YEAR, 2000);
		
		Date date = cal.getTime();
		System.out.println(date);
	}
}	
