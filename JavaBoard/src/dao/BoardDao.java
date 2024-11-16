package dao;

import java.util.List;

import util.JDBCUtil;
import vo.BoardVo;

public class BoardDao implements IBoardDao {

	private static BoardDao instance;

	private BoardDao() {

	}

	public static BoardDao getInstance() {
		if (instance == null)
			instance = new BoardDao();
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	
	@Override
	public List<BoardVo> boardList() {
		String sql = 
				  " SELECT BOARD_NO, SUBSTR(TITLE , 0, 20) TITLE, NAME, \r\n"
				+ "       SUBSTR(CONTENT, 0, 20) CONTENT, REG_DATE,  CNT\r\n"
				+ " FROM BOARD B , MEMBER M \r\n"
				+ " WHERE B.MEM_NO = M.MEM_NO\r\n"
				+ " AND B.DELYN = 'N'"
				+ " ORDER BY BOARD_NO DESC";
		
		
		return jdbc.selectList(sql, BoardVo.class);
	}

	@Override
	public BoardVo boardDetail(List<Object> param) {
		String sql = ""
				+ "SELECT BOARD_NO, TITLE, NAME, CONTENT, REG_DATE, CNT, B.MEM_NO\r\n"
				+ "FROM BOARD B, MEMBER M \r\n"
				+ "WHERE B.MEM_NO = M.MEM_NO\r\n"
				+ "AND BOARD_NO =?";
		return jdbc.selectOne(sql, param, BoardVo.class);
	}

	@Override
	public void boardUpdateCnt(int boardNo) {
		String sql = 
				  "UPDATE BOARD\r\n"
				+ "SET CNT = CNT+1\r\n"
				+ "WHERE BOARD_NO = " + boardNo;
		
		jdbc.update(sql);
		
	}

	@Override
	public int boardInsert(List<Object> param) {
		String sql = 
				  "INSERT INTO BOARD \r\n"
				+ "VALUES((SELECT NVL(MAX(BOARD_NO),0)+1 FROM BOARD), \r\n"
				+ "       ?,?,?,SYSDATE, 'N',0)";
		
		return jdbc.update(sql, param);
	}

	@Override
	public int boardUpdate(List<Object> param) {
		String sql = 
				"UPDATE BOARD\r\n"
				+ "SET TITLE =?,\r\n"
				+ "    CONTENT=?\r\n"
				+ "    WHERE BOARD_NO=?";
		return jdbc.update(sql, param);
	}

	@Override
	public int boardDelete(List<Object> param) {
		String sql = "UPDATE BOARD "
				+ "    SET DELYN = 'Y' "
				+ "    WHERE BOARD_NO = ? ";
				
		return jdbc.update(sql, param);
	}


}
