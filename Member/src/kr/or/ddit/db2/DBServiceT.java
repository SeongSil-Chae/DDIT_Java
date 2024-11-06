package kr.or.ddit.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.or.ddit.member.MemberVo;

public class DBService {
	private Connection conn ;
	private Statement stmt;
	private ResultSet rs;
	
//	public DBService() {
//		conn = DBConn.getConnection();
//		try {
//			stmt = conn.createStatement();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	public void selectAll() {
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql =" SELECT * FROM MEMBER";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				System.out.println(id+"\t"+name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void memberInsert(MemberVo member) {
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
			String sqlFormat = "INSERT INTO MEMBER2\r\n"
					+ "VALUES( '%s',TO_DATE('%s','YYYY.MM.DD'), '%s','%s','%s','%s')";
			
			String sql = String.format(sqlFormat, 
					member.getMemId(),member.getMemBir(), member.getMemAdd1()
					, member.getMemMail(), member.getMemJob(), member.getMemName());
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public MemberVo[] memberList() {
		conn = DBConn.getConnection();
		MemberVo[] memberList = null;
		try {
			stmt = conn.createStatement();
			
			String countSql = "SELECT COUNT(*) CNT FROM MEMBER2";
			rs = stmt.executeQuery(countSql);
			rs.next(); 
			int cnt = rs.getInt("CNT");
			memberList = new MemberVo[cnt];
			
			
			String sql ="SELECT  MEM_ID, MEM_NAME,  TO_CHAR(MEM_BIR,'YYYMMDD') "
					+ "  MEM_BIR, MEM_ADD1, MEM_MAIL, MEM_JOB FROM MEMBER2";
			rs = stmt.executeQuery(sql);
			int num =0;
			while(rs.next()) {
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				String bir = rs.getString("MEM_BIR");
				String add = rs.getString("MEM_ADD1");
				String mail = rs.getString("MEM_MAIL");
				String job = rs.getString("MEM_JOB");
				
				MemberVo mem = new MemberVo();
				mem.setMemId(id);
				mem.setMemName(name);
				mem.setMemBir(bir);
				mem.setMemAdd1(add);
				mem.setMemMail(mail);
				mem.setMemJob(job);
				memberList[num++] = mem;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	public void memDelete(MemberVo mem) {
		conn = DBConn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql ="DELETE MEMBER2 WHERE MEM_ID ='"+mem.getMemId()+"'";
			stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
