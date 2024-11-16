package dao;

import java.util.List;

import vo.BoardVo;

public interface IBoardDao {
	
	// 게시판 전체 조회
	public List<BoardVo> boardList();
	
	// 게시판 상세 조회
	public BoardVo boardDetail(List<Object> param);

	// 조회수 업데이트
	public void boardUpdateCnt(int boardNo);
	
	//게시판 등록 
	public int boardInsert(List<Object> param);
	
	//게시판 수정
	public int boardUpdate(List<Object> param);
	
	//게시판 삭제
	public int boardDelete(List<Object> param);
	
	
	
	
}
