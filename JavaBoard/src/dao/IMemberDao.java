package dao;

import java.util.List;
import java.util.Map;

import vo.MemberVo;

public interface IMemberDao {
	// 로그인 
	public MemberVo login(List<Object> param);
	
	// 회원가입
	public int join(List<Object> param);
	
	// 회원 리스트
	public List<Map<String, Object>> list();
	
	// 마이페이지 
	public Map<String, Object> mypage(int no);
	
	// 정보 수정 
	public void update(List<Object> param);
	
	// 회원 탈퇴
	public void delete(int no);
	
}
