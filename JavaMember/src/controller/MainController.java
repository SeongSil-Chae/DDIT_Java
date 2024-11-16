package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.MemberService;
import util.ScanUtil;
import util.View;

public class MainController  {
	static public Map<String, Object> sessionStorage = new HashMap<>();
	
	MemberService service = MemberService.getInstance();
	
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
			case LIST:
				view = list();
				break;
			default:
				break;
			}
		}
	}

	private View list() {
		System.out.println("리스트");
		List<Map<String, Object>> list =service.list();
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
		return View.MAIN;
	}

	private View login() {
		System.out.println("로그인");
		
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		
		Map<String, Object> member = service.login(param);
		if(member == null) {
			System.out.println("로그인 정보가 없습니다.");
		}
		else {
			System.out.println(member.get("NAME")+"님 환영합니다.");
		}
		
		return View.MAIN;
	}

	private View home() {
		System.out.println("1. 로그인");
		System.out.println("2. 회원 리스트 출력");
		int sel = ScanUtil.nextInt("메뉴 선택 : ");
		if(sel == 1) return View.LOGIN;
		if(sel == 2) return View.LIST;
		System.out.println("잘못 입력하셨습니다.");
		return View.MAIN;
	}
}
