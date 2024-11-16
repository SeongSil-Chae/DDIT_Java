package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.BoardService;
import service.IBoardService;
import service.IMemberService;
import service.MemberService;
import util.ScanUtil;
import util.View;
import vo.BoardVo;
import vo.MemberVo;

public class MainController  {
	static public Map<String, Object> sessionStorage = new HashMap<>();
	
	IMemberService memService = MemberService.getInstance();
	IBoardService boardService = BoardService.getInstance();
	
	public static void main(String[] args) {
		new MainController().start();
	}
	
	private void start() {
		View view = View.MAIN;
		while (true) {
			switch (view) {
			case MAIN:
				view = home();
				break;
			case LOGIN:
				view = login();
				break;
			case BOARD_LIST:
				view = boardList();
				break;
			case BOARD_INSERT:
				view = boardInsert();
				break;	
			case BOARD_UPDATE:
				view = boardUpdate();
				break;	
			case BOARD_DELETE:
				view = boardDelete();
				break;	
			default:
				break;
			}
		}
	}

	private View boardDelete() {
		if(!sessionStorage.containsKey("member")) {
			sessionStorage.put("view", View.BOARD_DELETE);
			return View.LOGIN;
		}
		
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		int boardNo = (int) sessionStorage.get("boardNo");
		List<Object> param = new ArrayList();
		param.add(boardNo);
		BoardVo  board = boardService.boardDetail(param);
		if(board.getMem_no() != member.getMem_no()) {
			System.out.println("삭제 권한이 없습니다.");
			return View.BOARD_LIST;
		}
		
		param = new ArrayList();
		param.add(boardNo);
		
		boardService.boardDelete(param);
		
		
		return View.BOARD_LIST;
	}

	private View boardInsert() {
		if(!sessionStorage.containsKey("member")) {
			sessionStorage.put("view", View.BOARD_INSERT);
			return View.LOGIN;
		}
		
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		int memNo = member.getMem_no();
		String title =ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		
		List<Object> param = new ArrayList();
		param.add(title);
		param.add(memNo);
		param.add(content);
		
		boardService.boardInsert(param);
		
		return View.BOARD_LIST;
	}

	private View boardUpdate() {
		if(!sessionStorage.containsKey("member")) {
			sessionStorage.put("view", View.BOARD_UPDATE);
			return View.LOGIN;
		}
		
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		int boardNo = (int) sessionStorage.get("boardNo");
		List<Object> param = new ArrayList();
		param.add(boardNo);
		BoardVo  board = boardService.boardDetail(param);
		if(board.getMem_no() != member.getMem_no()) {
			System.out.println("수정 권한이 없습니다.");
			return View.BOARD_LIST;
		}
		
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		
		param = new ArrayList(); 
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		boardService.boardUpdate(param);
		
		
		return View.BOARD_LIST;
	}
	
	private View boardDetail(int boardNo) {
		// 상세 게시판.
		List<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		sessionStorage.put("boardNo", boardNo);
		
		BoardVo board = boardService.boardDetail(param);
		System.out.println("========= 제목 ==================");
		System.out.println(board.getTitle());
		System.out.println("게시번호\t작성자\t작성일\t조회수");
		System.out.println(board.getBoard_no()+"\t"+board.getName()+"\t"+board.getReg_date()+"\t"+board.getCnt());
		System.out.println("========= 본문 ==================");
		System.out.println(board.getContent());
		
		System.out.println("1. 수정");
		System.out.println("2. 삭제");
		System.out.println("3. 게시글 리스트");
		int sel = ScanUtil.menu();
		if(sel == 1) return View.BOARD_UPDATE; 
		if(sel == 2) return View.BOARD_DELETE;
		if(sel == 3) return View.BOARD_LIST;
		
		return View.BOARD_DETAIL;
	}
	
	private View boardList() {
		System.out.println("전체 게시판");
		List<BoardVo> boardList = boardService.boardList();
		for(BoardVo board : boardList) {
			int boardNo = board.getBoard_no();
			String title = board.getTitle();
			String content = board.getContent();
			String date = board.getReg_date();
			String name = board.getName();
			int cnt = board.getCnt();
			System.out.println(boardNo+"\t"+title+"\t"+content+"\t"+date+"\t"+name+"\t"+cnt);
		}
		
		
		System.out.println("1. 상세게시판 조회");
		System.out.println("2. 홈");
		int sel = ScanUtil.menu();
		if(sel ==1) {
			int boardNo = ScanUtil.nextInt("게시 번호 선택 :");
			return boardDetail(boardNo);
		}
		if(sel ==2) return View.MAIN;
		return View.BOARD_LIST;
	}

	private View login() {
		
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		List<Object> param  = new ArrayList();
		param.add(id);
		param.add(pw);
		
		MemberVo member = memService.login(param);
		if(member == null) {
			// Map 값이 널이라면 로그인 실패
			System.out.println("로그인 실패");
			System.out.println("1. 재로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 홈");
			return View.LOGIN;
		}
		else {
			// 아니라면 회원 이름 출력하기
			System.out.println(member.getName()+"님 환영합니다.");
			sessionStorage.put("member", member);
		}
		View view = (View) sessionStorage.get("view");
		if(view!=null) return view;
		
		return View.MAIN;
	}

	private View home() {
		System.out.println("1. 전체게시판 조회 ");
		System.out.println("2. 게시판 등록");
		int sel = ScanUtil.menu();
		if(sel == 1) return View.BOARD_LIST;
		if(sel == 2) return View.BOARD_INSERT;
		
		return View.MAIN;
	}
}
