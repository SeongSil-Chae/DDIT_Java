package study06.sec01;

public class TvMain {

	public static void main(String[] args) {
		
		TV tv1 = new TV();
		tv1.pixel = 800000;
		tv1.pedestal = true;
		tv1.color = "black";
		tv1.inch = 27;
		tv1.brand ="삼성";
		

		TV tv2 = new TV();
		tv2.pixel = 100000000;
		tv2.pedestal = false;
		tv2.color = "white";
		tv2.inch = 95;
		tv2.brand = "LG";
		
		System.out.println(tv1.brand + "\t" + tv1.pixel + "\t" + tv1.pedestal+"\t"+tv1.color+"\t"+tv1.inch);
		System.out.println(tv2.brand + "\t" + tv2.pixel + "\t" + tv2.pedestal+"\t"+tv2.color+"\t"+tv2.inch);
		
	}

}
