package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.MemberVo;

public class MemberDaoImpl implements IMemberDao {

	private static MemberDaoImpl instance;

	private MemberDaoImpl() {

	}

	public static MemberDaoImpl getInstance() {
		if (instance == null)
			instance = new MemberDaoImpl();
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	
	
	@Override
	public MemberVo login(List<Object> param) {
		String sql =  "SELECT MEM_NO, ID, AGE, NAME \r\n"
					+ "FROM MEMBER\r\n"
					+ "WHERE ID = ? \r\n"
					+ "AND PW = ?";
		
		return jdbc.selectOne(sql, param, MemberVo.class);
	}

	@Override
	public int join(List<Object> param) {
		String sql = "INSERT INTO MEMBER \r\n"
				+ "   VALUES ((SELECT NVL(MAX(MEM_NO),0)+1 FROM MEMBER),"
				+ "   ?, ?, ?, ?, SYSDATE, ? )";
		
		return jdbc.update(sql, param);
	}

	@Override
	public List<Map<String, Object>> list() {
		String sql =
				      "SELECT MEM_NO, ID, AGE, NAME, \r\n"
					+ "       TO_CHAR(JOIN_DATE, 'YYYY/MM/DD')  JOIN_DATE, GENDER\r\n"
					+ "FROM MEMBER\r\n"
					+ "WHERE DELYN ='N'";
		return jdbc.selectList(sql);
	}

	@Override
	public Map<String, Object> mypage(int no) {
		String sql = 
				  "SELECT MEM_NO, ID, AGE, NAME, \r\n"
				+ "       TO_CHAR(JOIN_DATE, 'YYYY/MM/DD') JOIN_DATE, GENDER\r\n"
				+ "FROM MEMBER\r\n"
				+ "WHERE MEM_NO = " + no;
		
		return jdbc.selectOne(sql);
	}

	@Override
	public void update(List<Object> param) {
		String sql ="UPDATE MEMBER\r\n"
					+ "SET \r\n"
					+ "    PW = ?,\r\n"
					+ "    AGE = ?,\r\n"
					+ "    NAME = ?,\r\n"
					+ "    GENDER = ?\r\n"
					+ "WHERE MEM_NO = ?";
		jdbc.update(sql, param);
	}

	@Override
	public void delete(int no) {
		String sql = 
				  "UPDATE MEMBER\r\n"
				+ "SET \r\n"
				+ "    AGE = NULL,\r\n"
				+ "    NAME = NULL,\r\n"
				+ "    JOIN_DATE = NULL,\r\n"
				+ "    GENDER = NULL,\r\n"
				+ "    DELYN = 'Y'\r\n"
				+ "WHERE MEM_NO = "+no;
		jdbc.update(sql);

	}

}
