package kr.or.ddit.member;

import java.util.Arrays;

import kr.or.ddit.Util.ScanUtil;
import kr.or.ddit.db.DBService;

public class MemberMain {
	DBService db = new DBService();
	
	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.process();
	}
	
	public void process() {
		DBService service = new DBService();
		
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원전체 조회");
			System.out.println("3. 회원수정");
			System.out.println("4. 회원삭제");
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel==1) memberCreate();
			if(sel==2) memberRead();
			if(sel==3) memberUpdate();
			if(sel==4) memberDelete();
		}
	}
	
	
	public void memberCreate() {
		System.out.println("==회원가입==");
		db.member2();
	}
	
	public void memberRead() {
		System.out.println("==회원전체 조회==");	
		System.out.println(Arrays.toString(db.memberList()));
	}
	public void memberUpdate() {
		System.out.println("==회원수정==");	// 직업 이메일 수정
		db.retouch();
		System.out.println("이메일과 직업이 수정되었습니다.");
	}
	public void memberDelete() {
		System.out.println("==회원삭제==");	
		db.dele();
		System.out.println("성공적으로 삭제하였습니다.");
	}
}