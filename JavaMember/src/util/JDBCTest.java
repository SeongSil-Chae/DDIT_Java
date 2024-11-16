package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {
	public static void main(String[] args) {
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
//		String sql = "SELECT * FROM MEMBER";
//		
//		List<Map<String, Object>> memberList = jdbc.selectList(sql);
//		for (Map<String, Object> map : memberList) {
//			System.out.println(map);
//		}
		
//		String sql = "SELECT * FROM MEMBER "
//				+ "   WHERE MEM_ID = ? "
//				+ "   AND MEM_PASS = ? ";
//		List<Object> param = new ArrayList();
//		param.add("a001");
//		param.add("asdfasdf");
//		Map<String, Object> map = jdbc.selectOne(sql, param);
//		System.out.println(map);
		
//		String sql = "INSERT INTO MEMBER2 \r\n"
//				   + "VALUES(?, sysdate, ?, ?, ?, ? ) ";
//		
//		List<Object> param = new ArrayList();
//		param.add("testId");
//		param.add("주소");
//		param.add("메일");
//		param.add("직업");
//		param.add("이름");
//		int result = jdbc.update(sql, param);
//		System.out.println(result);
		
		// 직업이 회사원인 사람 출력하기
//		String sql=   " SELECT * \r\n"
//					+ " FROM MEMBER\r\n"
//					+ " WHERE MEM_JOB = ? ";
//		
//		List<Object> param = new ArrayList();
//		param.add("회사원");
//		
//		List<Map<String, Object>> memberList = jdbc.selectList(sql, param);
//		System.out.println(memberList);
		
		// 성이 김씨인 사람 출력하기
		
		String sql =  "SELECT * \r\n"
					+ "FROM MEMBER\r\n"
					+ "WHERE MEM_NAME LIKE ?||'%'";
		
		List<Object> param = new ArrayList();
		param.add("이");
		System.out.println(jdbc.selectList(sql, param));
	
		
	}
}
