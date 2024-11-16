package service;

import java.util.List;
import java.util.Map;

public interface IMemberService {
	// 로그인
	public Map<String, Object> login(List<Object> param);
	
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
	
	// 회원 조회
	public Map<String, Object> get(int no);
		
}
