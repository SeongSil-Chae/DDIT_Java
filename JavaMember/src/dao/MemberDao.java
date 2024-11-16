package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDao {
	
	private static MemberDao instance;

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		if (instance == null)
			instance = new MemberDao();
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> list() {
		String sql = "SELECT * FROM MEMBER";
		return jdbc.selectList(sql);
	}
	
	public Map<String, Object> login(List<Object> param) {
		String sql = " SELECT * FROM MEMBER"
				+ "    WHERE ID =? AND PW =? ";
		return jdbc.selectOne(sql, param);
	}
	
}
