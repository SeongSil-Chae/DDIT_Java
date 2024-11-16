package day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyOraSelect {
	public static void main(String[] args) throws Exception {

		

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.144.3:1588/FREEPDB1", "junyoung", "junyoung");
		String query = "";
		query += "delete from emp ";
		query += "where ";
		query += "    e_id = '3' ";

		PreparedStatement pstmt = con.prepareStatement(query);	
		int cnt = pstmt.executeUpdate(); 
		System.out.println("cnt" +cnt);

	
		

		
		 
         pstmt.close(); 
         con.close();   // 객체 생성한 반대 순으로 사용한 객체는 닫아준다.
	}
}
