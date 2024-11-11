package study13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Homework20 {
	public static void main(String[] args) {
		Homework20 obj = new Homework20();
		obj.process();
	}

	public void process() {
		Homework20 obj = new Homework20();
		obj.printAll();
	}

	public void printAll() {
		// 모든 정보 출력하기
//		FOR문으로 SIZE로 꺼내기 리스트에서 맵이 나오고 하나씩 꺼내기
//		이터레이터 출력해도 됨 (랜덤으로 나와써 비추)
		List<Map<String, Object>> list = inputData();

		for (int i = 0; i < list.size(); i++) {

			Map<String, Object> map = list.get(i);
			System.out.print(map.get("EMP_ID") + "\t");
			System.out.print(map.get("EMP_NAME") + "\t");
			System.out.print(map.get("DEPARTMENT_ID") + "\t");
			System.out.print(map.get("SALARY") + "\t");
			System.out.println();
		}

		maxSalary(list);

	}

	public void maxSalary(List<Map<String, Object>> list) {
		// 월급 최대인 사람 정보 전체 출력하기.
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).get("SALARY");
			int cur = Integer.parseInt(list.get(i).get("SALARY").toString());
			if (cur > max) {
				max = cur;
			}
		}
		System.out.println(max);
		
		 for (int i = 0; i < list.size(); i++) {
		        int cur = Integer.parseInt(list.get(i).get("SALARY").toString());
		        if (cur == max) {
		            System.out.println("EMP_ID: " + list.get(i).get("EMP_ID"));
		            System.out.println("EMP_NAME: " + list.get(i).get("EMP_NAME"));
		            System.out.println("DEPARTMENT_ID: " + list.get(i).get("DEPARTMENT_ID"));
		            System.out.println("SALARY: " + list.get(i).get("SALARY"));
		            System.out.println("------");
		        }
		    }

	}

	public List<Map<String, Object>> inputData() {
//		101 Neena    90  18700
//		103 Alexander  60  9900
//		104 Bruce   60   6600
//		106 Valli  60  5280
//		107  Diana   60  4620
		List<Map<String, Object>> list = new ArrayList();

		Map emp1 = new HashMap();
		emp1.put("EMP_ID", "101");
		emp1.put("EMP_NAME", "Neena");
		emp1.put("DEPARTMENT_ID", "90");
		emp1.put("SALARY", "18700");

		Map emp2 = new HashMap();
		emp2.put("EMP_ID", "103");
		emp2.put("EMP_NAME", "Alex");
		emp2.put("DEPARTMENT_ID", "60");
		emp2.put("SALARY", "9900");

		Map emp3 = new HashMap();
		emp3.put("EMP_ID", "106");
		emp3.put("EMP_NAME", "Valli");
		emp3.put("DEPARTMENT_ID", "60");
		emp3.put("SALARY", "5280");

		Map emp4 = new HashMap();
		emp4.put("EMP_ID", "106");
		emp4.put("EMP_NAME", "Valli");
		emp4.put("DEPARTMENT_ID", "60");
		emp4.put("SALARY", "5280");

		Map emp5 = new HashMap();
		emp5.put("EMP_ID", "107");
		emp5.put("EMP_NAME", "Diana");
		emp5.put("DEPARTMENT_ID", "60");
		emp5.put("SALARY", "5620");

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);

		return list;
	}

}
