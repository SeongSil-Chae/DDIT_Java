package study11.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import util.ScanUtil;

public class DateExample01 {
	
	public static void main(String[] args) {
		DateExample01 obj = new DateExample01();
		obj.process();
		
	}
	
	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
		method9();
			
	}
	public void method9() {
		// 스캐너를 통해서 입력 받은 날짜 만큼 더해서
		// 해당 날짜를 2024-12-11 형태로 출력하시오
		
		int day = ScanUtil.nextInt("더할 날짜 : ");
		long addTime = 86400L*1000*day;
		
		Date date = new Date();
		Date add = new Date(date.getTime() + addTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = sdf.format(add);
		System.out.println(result);
	}
	
	public void method8() {
		String str ="2025.05.08";
		// String 2 date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
			
			Date cur = new Date();
			long time = date.getTime() - cur.getTime();
			
			long days = time/86400/1000;
			System.out.println(str+"은 "+days+"일 후");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void method7() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		Date date = new Date();
		String result = sdf.format(date);
		System.out.println(result);
		
	}
	public void method6() {
		// 오늘 날짜로 부터 100일 뒤에 날짜를 출력하시오.
		Date date = new Date();
		Date add = new Date(date.getTime() + 1000L*60*60*24*100);
		System.out.println(add);
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
	System.out.println(sdf.format(add));

		
	}
	
	public void method5() {
		Date date = new Date();
		long time = date.getTime();
		while(true) {
			Date d = new Date(time);
			time+=1000;
			System.out.println(d);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
		}
		
	}
	
	public void method4() {
		// 시계 시 분 초 
		// 0시 0분 0초 -> 
		int sec =  0;
		int min = 0;
		int hour = 0;
		while(true) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
			}
			System.out.println(hour+"시 " + min + "분 "+ sec+"초");
			if(++sec==60){
				min++;
				sec=0;
			}
			if(min==60) {
				min=0;
				hour++;
			}
			if(hour==24) {
				hour=0;
			}
		}
	}
	public void method3() {
		Date d = new Date();
		
		long time = d.getTime();

		// x년 x일 x시 x분 x초 지났습니다,. 출력
		System.out.println("1970년 1월 1일 0시 0분 0초로부터");
		
	    long sec = 1000;
	    long min = sec*60;
	    long hour = min*60;
	    long day = hour*24;
	    long year = day*365;

		
		long years = time/year;
		time%=year;
		long days = time/day;
		time%=day;
		long hours = time/hour;
		time%=hour;
		long mins = time/min;
		time%=min;
		
		long secs = time/min;
		
		String form = "%d년 %d일 %d시 %d분 %d초";
				System.out.printf(form, years, days, hours, mins, secs);

	}
	
	public void method2() {
		Date d1 = new Date();
		System.out.println(d1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date d2 = new Date();
		System.out.println(d2);
		
		long time = d2.getTime() - d1.getTime();
		
		System.out.println(time);
		
	}
	
	public void method1() {
		
		Date date = new Date();
		System.out.println(date);
	}
}
