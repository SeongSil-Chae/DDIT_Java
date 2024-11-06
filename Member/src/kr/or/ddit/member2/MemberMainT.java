package kr.or.ddit.member;

import kr.or.ddit.db.DBService;
import kr.or.ddit.util.ScanUtil;

public class MemberMain {
	DBService service = new DBService();
	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.process();
	}
	
	public void process() {
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원전체 조회");
			System.out.println("3. 회원수정");
			System.out.println("4. 회원삭제");
			int sel = ScanUtil.nextInt("선택 :");
			if(sel==1) memberCreate();
			if(sel==2) memberRead();
			if(sel==3) memberUpdate();
			if(sel==4) memberDelete();
		}
	}
	
	
	public void memberCreate() {
		System.out.println("==회원가입==");
		MemberVo member = new MemberVo();
		member.setMemId(ScanUtil.next("ID : "));
		member.setMemName(ScanUtil.next("이름"));
		member.setMemBir(ScanUtil.next("생일(YYYY.MM.DD) : "));
		member.setMemAdd1(ScanUtil.next("주소 : "));
		member.setMemMail(ScanUtil.next("이메일 : "));
		member.setMemJob(ScanUtil.next("직업 : "));
		service.memberInsert(member);
	}
	
	public void memberRead() {
		System.out.println("==회원전체 조회==");
		MemberVo[] memList = service.memberList();
		for(int i=0; i<memList.length; i++) {
			System.out.println((i+1)+". "+memList[i].toString());
		}
	}
	
	public void memberUpdate() {
		System.out.println("==회원수정==");
	}
	
	public void memberDelete() {
		System.out.println("==회원삭제==");
		MemberVo[] memList = service.memberList();
		for(int i=0; i<memList.length; i++) {
			System.out.println((i+1)+". "+memList[i].toString());
		}
		int sel = ScanUtil.nextInt("삭제할 번호 입력 : ");
		MemberVo mem = memList[sel-1];
		service.memDelete(mem);
	}
	
}





