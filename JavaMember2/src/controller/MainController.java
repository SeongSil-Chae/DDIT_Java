package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.IMemberService;
import service.MemberService;
import util.ScanUtil;
import util.View;

public class MainController {
	static public Map<String, Object> sessionStorage = new HashMap<>();

	IMemberService memService = MemberService.getInstance();

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
			case JOIN:
				view = join();
				break;
			case MYPAGE:
				view = mypage();
				break;
			case DELETE:
				view = delete();
				break;
			case UPDATE:
				view = update();
				break;
			case LIST:
				view = list();
				break;
			case GET:
				view = get();
				break;
			default:
				break;
			}
		}
	}

	private View get() {
		System.out.println("회원 한명 출력하기");
		int memNo = ScanUtil.nextInt("MEM_NO : ");
		System.out.println(memService.get(memNo));
		return View.MAIN;
	}

	private View list() {
		System.out.println("회원 목록 페이지");
		List<Map<String, Object>> memberList = memService.list();
		for(Map<String, Object> map : memberList) {
			System.out.println(map);
		}
		

		
		return View.MYPAGE;
	}

	private View update() {
		System.out.println("정보 수정 페이지");
		Map<String, Object> member = (Map) sessionStorage.get("member");
		BigDecimal decimal = (BigDecimal) member.get("MEM_NO");
		int memNo = decimal.intValue();
		
		
		String pw = ScanUtil.nextLine("PW : ");
		int age = ScanUtil.nextInt("AGE : ");
		String name = ScanUtil.nextLine("NAME : ");
		String gender = ScanUtil.nextLine("GENDER : ");
		List<Object> param = new ArrayList();
		param.add(pw);
		param.add(age);
		param.add(name);
		param.add(gender);
		param.add(memNo);
		
		memService.update(param);
		return View.MYPAGE;
	}

	private View delete() {
		System.out.println("회원탈퇴 페이지");
		Map<String, Object> member = (Map) sessionStorage.get("member");
		String yn = ScanUtil.nextLine("정말 탈퇴하시겠습니까? (y/n)");
		if(yn.equalsIgnoreCase("y")) {
		BigDecimal decimal = (BigDecimal) member.get("MEM_NO");
		int memNo = decimal.intValue();
		System.out.println(member.get("NAME")+"님이 탈퇴 되셨습니다.");
		memService.delete(memNo);
		sessionStorage.remove("member");
		}
		
		return View.MAIN;
	}

	private View mypage() {

		Map<String, Object> member = (Map) sessionStorage.get("member");
		BigDecimal decimal = (BigDecimal) member.get("MEM_NO");
		int memNo = decimal.intValue();

		Map<String, Object> mem = memService.mypage(memNo);
		System.out.println(mem);

		System.out.println("1. 정보수정");
		System.out.println("2. 회원탈퇴");
		System.out.println("3. 회원리스트 출력");
		int sel = ScanUtil.menu();
		if(sel==1) return View.UPDATE;
		if(sel==2) return View.DELETE;
		if(sel==3) return View.LIST;
		return View.MYPAGE;
	}

	private View login() {

		if (sessionStorage.containsKey("member")) {
			return View.MYPAGE;
		}
			String id = ScanUtil.nextLine("ID : ");
			String pw = ScanUtil.nextLine("PW : ");

			List<Object> param = new ArrayList();
			param.add(id);
			param.add(pw);

			Map<String, Object> member = memService.login(param);
			if (member == null) {
				// Map 값이 널이라면 로그인 실패
				System.out.println("로그인 실패");
				System.out.println("1. 재로그인");
				System.out.println("2. 회원가입");
				System.out.println("3. 회원리스트 출력");
			} else {
				// 아니라면 회원 이름 출력하기
				System.out.println(member.get("NAME") + "님 환영합니다.");
				sessionStorage.put("member", member);
				System.out.println(member);

			}
			return View.MYPAGE;
		}
	
ScanUtil
	private View join() {
		System.out.println("회원가입");
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		int age = ScanUtil.nextInt("AGE : ");
		String name = ScanUtil.nextLine("NAME : ");
		String gender = ScanUtil.nextLine("GENDER : ");
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		param.add(age);
		param.add(name);
		param.add(gender);

		memService.join(param);
		return View.MAIN;
	}

	private View home() {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 회원조회");
		int sel = ScanUtil.menu();
		if (sel == 1)
			return View.LOGIN;
		if (sel == 2)
			return View.JOIN;
		if (sel == 3)
			return View.GET;

		return View.MAIN;
	}
}
