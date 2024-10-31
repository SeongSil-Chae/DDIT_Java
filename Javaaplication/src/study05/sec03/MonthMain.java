package study05.sec03;

public class MonthMain {
	public static void main(String[] args) {
		MonthMain mm = new MonthMain();
		mm.process();
	}
	
	
	public void process() {
		month(Month.APR);
	}
	
//	public void Month(Month month) {
//		if(month == Month.JAN) System.out.println("1월");
//		if(month == Month.FEB) System.out.println("2월");
//		if(month == Month.MAR) System.out.println("3월");
//		if(month == Month.APR) System.out.println("4월");
//		if(month == Month.MAY) System.out.println("5월");
//		if(month == Month.JUN) System.out.println("6월");
//		if(month == Month.JUL) System.out.println("7월");
//		if(month == Month.AUG) System.out.println("8월");
//		if(month == Month.SEP) System.out.println("9월");
//		if(month == Month.OCT) System.out.println("10월");
//		if(month == Month.NOV) System.out.println("11월");
//		if(month == Month.DEC) System.out.println("12월");
//	}
	
	
	public void month(Month mon) {
		System.out.println(mon.num+"월");
	}
	
}
