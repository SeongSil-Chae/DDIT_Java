package study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Homework21_1 {
	public static void main(String[] args) {
		Homework21_1 obj = new Homework21_1();
		obj.process();
	}
	
	boolean deb = false;
	
	List<Map<String, Object>> data;
	public void process() {
		data = inputData();
		// 전체 차량의 주차 시간, 주차 요금을 출력
		Map<String, Integer> parkMap =parkTime();
		System.out.println(parkMap);
	}
	
	public int pay(int parkTime) {
		// 기본요금  기본시간  단위요금   단위시간   
		// 5000    180분   500원     10분
		// 211분 
		if(parkTime<=180) return 5000;
		return 5000+(parkTime-180+9)/10*500;
	}
	
	
	public Map<String, Integer> parkTime() {
		Map<String, Integer> parkMap = new HashMap();
		
		Map<String, Integer> inTimeMap = new HashMap();
		for(int i=0; i<data.size(); i++) {
			Map<String, Object> map = data.get(i);
			String carNum = (String) map.get("차량번호");
			String state  = (String) map.get("상태");
			String time   = (String) map.get("시간");
			
			if(state.equals("입차")) 	inTimeMap.put(carNum, getMin(time));
			else {
				int parkTime = getMin(time)-inTimeMap.get(carNum);
				if(parkMap.containsKey(carNum)) parkTime += parkMap.get(carNum);
				parkMap.put(carNum, parkTime);
			}
		}
		return parkMap;
	}
	
	public int getMin(String time) {
		String hour = time.split(":")[0];
		String min = time.split(":")[1];
		return Integer.parseInt(hour)*60 + Integer.parseInt(min);
	}
	
	
	public List<Map<String, Object>> inputData(){
		// 차량번호  시간     상태 
		// 5961   05:34   입차
		// 0000   06:00   입차 
		// 0000   06:34   출차 
		// 5961   07:59   출차 
		// 0148   07:59   입차 
		// 0000   18:59   입차 
		// 0148   19:09   출차 
		// 5961   22:59   입차
		// 5961   23:00   출차
		// 0000   23:00   출차
		
		List<Map<String, Object>> data = new ArrayList();
		Map data1 = new HashMap();
		data1.put("차량번호", "5961");
		data1.put("시간", "05:34");
		data1.put("상태", "입차");
		
		Map data2 = new HashMap();
		data2.put("차량번호", "0000");
		data2.put("시간", "06:00");
		data2.put("상태", "입차");
		
		Map data3 = new HashMap();
		data3.put("차량번호", "0000");
		data3.put("시간", "06:34");
		data3.put("상태", "출차");
		
		Map data4 = new HashMap();
		data4.put("차량번호", "5961");
		data4.put("시간", "07:59");
		data4.put("상태", "출차");
		
		Map data5 = new HashMap();
		data5.put("차량번호", "0148");
		data5.put("시간", "07:59");
		data5.put("상태", "입차");
		// 0000   18:59   입차 
		// 0148   19:09   출차 
		// 5961   22:59   입차
		// 5961   23:00   출차
		// 0000   23:00   출차
		Map data6 = new HashMap();
		data6.put("차량번호", "0000");
		data6.put("시간", "18:59");
		data6.put("상태", "입차");
		
		Map data7 = new HashMap();
		data7.put("차량번호", "0148");
		data7.put("시간", "19:09");
		data7.put("상태", "출차");
		
		Map data8 = new HashMap();
		data8.put("차량번호", "5961");
		data8.put("시간", "22:59");
		data8.put("상태", "입차");
		
		Map data9 = new HashMap();
		data9.put("차량번호", "5961");
		data9.put("시간", "23:00");
		data9.put("상태", "출차");
		
		Map data10 = new HashMap();
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
