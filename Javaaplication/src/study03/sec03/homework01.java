package study03.sec03;

import java.util.Date;

public class homework01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		
		// time 값은 1970년 1월 1일 부터 부터 지난 시간(ms)이다.
		// 몇년 몇일 몇시 몇분 몇초가 지났는지 출력하시오
		long time = date.getTime();
		System.out.println(time);
		
		
//		int a = 3/2; = 출력하면 소수점 날아가고 1 됨.
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = day*365; 
		System.out.println(year);


		long YY = time/year; // 년
		time = time - YY*year; // 시간 - 년 // time = time%year;		
		long DD = time / day; // 일 
		time = time - DD * day; // 시간 - 년
		long HH = time / hour;
		time = time - HH* hour;
		long MM = time / min;
		time = time - MM * min;
		long SS = time / sec;
		

		System.out.println(YY);  // 년
		System.out.println(DD);  // D 나머지값에서 day 만큼 나눈 값
		System.out.println(HH);  // HH
		System.out.println(MM);  
		System.out.println(SS);  

		System.out.println(YY + "년 " + DD + "일 " + HH + "시간 " + MM + "분 " + SS + "초 ");
		
		
//		long y = time/year;
//		
//		long Y = time%year;
//		long m = Y/month;
//		long a = m%day;

	}
}
