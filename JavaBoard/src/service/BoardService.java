package service;

import java.util.List;

import dao.BoardDao;
import dao.IBoardDao;
import vo.BoardVo;

public class BoardService implements IBoardService {

	private static BoardService instance;

	private BoardService() {

	}

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardService();
		return instance;
	}
	
	IBoardDao boardDao = BoardDao.getInstance();
	
	@Override
	public List<BoardVo> boardList() {
		return boardDao.boardList();
	}

	@Override
	public BoardVo boardDetail(List<Object> param) {
		
		boardDao.boardUpdateCnt((int)param.get(0));
		
		return boardDao.boardDetail(param);
	}

	@Override
	public int boardInsert(List<Object> param) {
		return boardDao.boardInsert(param);
	}

	@Override
	public int boardUpdate(List<Object> param) {	
		return boardDao.boardUpdate(param);
	}

	@Override
	public int boardDelete(List<Object> param) {
		
		return boardDao.boardDelete(param);
	}

}
