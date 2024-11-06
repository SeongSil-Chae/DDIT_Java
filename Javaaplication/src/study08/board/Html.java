package study08.board;

import util.ScanUtil;

public class Html {
	
	public void inputData() {
		String title = ScanUtil.next("제목 :");
		String content = ScanUtil.next("내용 :");
		String date = ScanUtil.next("날짜 :");
		String writer = ScanUtil.next("작곡가 :");
		
		IBoard board = new BoardImpl();
	    int page = board.insertBoard(title, writer, content, date);
		System.out.println(page + "로 이동");
	}
}
