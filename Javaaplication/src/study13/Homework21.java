package study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Homework21 {
	List<Map<String, Object>> data;

	public static void main(String[] args) {
		Homework21 obj = new Homework21();
		obj.process();
	}

	public void process() {
		data = inputData();
		parkTime();

		// 전체 차량의 주차 시간, 주차 요금을 출력
//		Set<String> carSet = getCarSet();
//		System.out.println(carSet);
		
//		Iterator carSet = get.iterator();
//		while(carSet.hasNext()) {
//			System.out.println(carSet.next());
//		}
		// 차량 번호가 같으면 입차시간 출차시간 주차시간 요금 출력
//		while() {
//		if(carSet==차량번호) {
//			 System.out.println("차량번호: " + data.get(i).get("차량번호"));
//			 if(상태==입차) {
//	         System.out.println("입차시간: " + data.get(i).get("시간"));
//			 }
//			 if(상태==출차) {
//		         System.out.println("출차시간: " + data.get(i).get("시간"));
//			 }
//	            System.out.println(partTime);
//	            System.out.println(pay);
//		}
//		
//		}
	}

	// 차량번호의 집합
	public Set<String> getCarSet() {
		Set<String> set = new HashSet();
		for (int i = 0; i < data.size(); i++) {
			Map<String, Object> map = data.get(i);
			String carNum = (String) map.get("차량번호");
			set.add(carNum);
		}

		return set;
	}

	// 주차 시간을 받아서 요금 계산
	public int pay(int parkTime) {
		// 기본요금 기본시간 단위요금 단위시간
		// 5000 180분 500원 10분
		int pay = 5000;
		if (parkTime > 180) {
			pay+=(parkTime-180)/10*500;
		}
		return pay;
	}

	// 차 번호 받으면 getMin으로 inputData에서 출차 - 입차 시간해서 시간 계산
	public int parkTime() {
//		Map<String, Object> map = data.get(1);
//		System.out.println(map.get("차량번호"));
//		System.out.println(map.get("시간"));
//		System.out.println(map.get("상태"));

//		Iterator<String> cn = carNum.iterator();

//		for (Map<String, Object> entry : data) {
		System.out.println("차량번호\t입차시간\t출차시간\t사용시간\t요금");
		for (int i = 0; i < data.size(); i++) {
			for (int j = i + 1; j < data.size(); j++) {
				Map<String, Object> car1 = data.get(i);
				Map<String, Object> car2 = data.get(j);
				if (car1.get("차량번호") == car2.get("차량번호") && car2.get("상태") == "출차") {
					int mMin = getMin(car2.get("시간") + "") - getMin(car1.get("시간") + "");
					System.out.print(car1.get("차량번호")+"\t");
					System.out.print(car1.get("시간")+"\t");
					System.out.print(car2.get("시간")+"\t");
					System.out.print(mMin+"\t");
					System.out.println(pay(mMin));
					
					System.out.println();
					break;
				}
				
			}
		}
		return 0;
	}

	public int getMin(String time) {
		String hour = time.split(":")[0];
		String min = time.split(":")[1];
		return Integer.parseInt(hour) * 60 + Integer.parseInt(min);

	}

	public List<Map<String, Object>> inputData() {
		// 차량번호 시간 상태
		List<Map<String, Object>> data = new ArrayList();
		Map data1 = new HashMap();
		// 5961 05:34 입차
		data1.put("차량번호", "5961");
		data1.put("시간", "05:34");
		data1.put("상태", "입차");

		Map data2 = new HashMap();
		// 0000 06:00 입차
		data2.put("차량번호", "0000");
		data2.put("시간", "06:00");
		data2.put("상태", "입차");

		Map data3 = new HashMap();
		// 0000 06:34 출차
		data3.put("차량번호", "0000");
		data3.put("시간", "06:34");
		data3.put("상태", "출차");

		Map data4 = new HashMap();
		// 5961 07:59 출차
		data4.put("차량번호", "5961");
		data4.put("시간", "07:59");
		data4.put("상태", "출차");

		Map data5 = new HashMap();
		// 0148 07:59 입차
		data5.put("차량번호", "0148");
		data5.put("시간", "07:59");
		data5.put("상태", "입차");

		Map data6 = new HashMap();
		// 0000 18:59 입차
		data6.put("차량번호", "0000");
		data6.put("시간", "18:59");
		data6.put("상태", "입차");

		Map data7 = new HashMap();
		// 0148 19:09 출차
		data7.put("차량번호", "0148");
		data7.put("시간", "19:09");
		data7.put("상태", "출차");

		Map data8 = new HashMap();
		// 5961 22:59 입차
		data8.put("차량번호", "5961");
		data8.put("시간", "22:59");
		data8.put("상태", "입차");

		Map data9 = new HashMap();
		// 5961 23:00 출차
		data9.put("차량번호", "5961");
		data9.put("시간", "23:00");
		data9.put("상태", "출차");

		Map data10 = new HashMap();
		// 0000 23:00 출차
		data10.put("차량번호", "0000");
		data10.put("시간", "23:00");
		data10.put("상태", "출차");

		data.add(data1);
		data.add(data2);
		data.add(data3);
		data.add(data4);
		data.add(data5);
		data.add(data6);
		data.add(data7);
		data.add(data8);
		data.add(data9);
		data.add(data10);

		return data;
	}
}
