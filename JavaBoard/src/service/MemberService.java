package service;

import java.util.List;
import java.util.Map;

import dao.IMemberDao;
import dao.MemberDaoImpl;
import vo.MemberVo;

public class MemberService implements IMemberService {

	private static MemberService instance;

	private MemberService() {

	}

	public static MemberService getInstance() {
		if (instance == null)
			instance = new MemberService();
		return instance;
	}

	IMemberDao memberDao = MemberDaoImpl.getInstance();
	
	@Override
	public MemberVo login(List<Object> param) {
		return memberDao.login(param);
	}

	@Override
	public int join(List<Object> param) {
		return memberDao.join(param);
	}

	@Override
	public List<Map<String, Object>> list() {
		return memberDao.list();
	}

	@Override
	public Map<String, Object> mypage(int no) {
		return memberDao.mypage(no);
	}

	@Override
	public void update(List<Object> param) {
		memberDao.update(param);

	}

	@Override
	public void delete(int no) {
		memberDao.delete(no);
	}

}
