package kr.or.ddit.db;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.or.ddit.member.MemberVo;

public class DBService {
	private Connection conn ;
	private Statement stmt;
	private ResultSet rs;

	public void selectAll() {
		
		conn = DBconn.getConnection();  // db 접속
		try {
			stmt = conn.createStatement();			
			String sql = "SELECT * FROM MEMBER";
			rs = stmt.executeQuery(sql);  
			while(rs.next()) {
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				System.out.println(id+"\t"+name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  // db에 쿼리 날려줌
		
	}
	
	
	
	public void member2() {
	    conn = DBconn.getConnection(); // db 접속
	    try {
	        stmt = conn.createStatement();
	        String sql = "INSERT INTO MEMBER2 (MEM_ID, MEM_NAME, MEM_BIR, MEM_ADD1, MEM_MAIL, MEM_JOB) " +
	                     "VALUES ('a020', '채성실', TO_DATE('2020-12-12', 'YYYY-MM-DD'), '대전시 서구 갈마동', 'deco@gmail.com', '개발자')";
	        int rowsInserted = stmt.executeUpdate(sql); // executeQuery 대신 executeUpdate 사용

	        if (rowsInserted > 0) {
	            System.out.println("회원 정보가 성공적으로 추가되었습니다.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public void retouch() {
	    conn = DBconn.getConnection(); // db 접속
	    try {
	        stmt = conn.createStatement();
	        String sql = "UPDATE  MEMBER2 SET MEM_MAIL = 'decoro@gmail.com', MEM_JOB = 'sw개발자' WHERE MEM_ID='a020'";
	        int rowsUpdate = stmt.executeUpdate(sql); // executeQuery 대신 executeUpdate 사용
	
	        if (rowsUpdate >0) {
	            System.out.println("회원 정보가 성공적으로 수정되었습니다.");
	        }
	        else {
	        	System.out.println("회원정보를 찾을 수 없습니다.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	
	public void dele() {
	    conn = DBconn.getConnection(); // db 접속
	    try {
	        stmt = conn.createStatement();
	        String sql = "DELETE FROM MEMBER2 WHERE MEM_ID = 'a020'";
	        int rowsdelet = stmt.executeUpdate(sql); // executeQuery 대신 executeUpdate 사용
	
	        if (rowsdelet >0) {
	            System.out.println("회원 정보가 성공적으로 삭제되었습니다.");
	        }
	        else {
	        	System.out.println("회원정보를 찾을 수 없습니다.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	
	public MemberVo[] memberList() {
		conn = DBconn.getConnection();  // db 접속
		MemberVo [] memberList = null;
		try {
			stmt = conn.createStatement();	
			
			String countSql = "SELECT COUNT(*) CNT FROM MEMBER";
			rs = stmt.executeQuery(countSql);  
			rs.next();
			int cnt = rs.getInt("CNT");
			memberList = new MemberVo[cnt];
			
			
			
			String sql = "SELECT * FROM MEMBER";
			rs = stmt.executeQuery(sql);  

			int num = 0;
			while(rs.next()) {
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				String bir = rs.getString("MEM_BIR");
				String add1 = rs.getString("MEM_ADD1");
				String mail = rs.getString("MEM_MAIL");
				String job = rs.getString("MEM_JOB");
				System.out.println(id+"\t"+name+"\t"+bir+"\t"+add1+"\t"+mail+"\t"+job);
				
				MemberVo mem = new MemberVo();
				mem.setMemId(id);
				mem.setMemName(name);
				memberList[num++] = mem;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		return memberList;
		
	}
}
