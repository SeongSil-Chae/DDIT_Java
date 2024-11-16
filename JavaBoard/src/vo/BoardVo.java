package vo;

import lombok.Data;

@Data
public class BoardVo {
	private int board_no;
	private String title;
	private int mem_no;
	private String content;
	private String reg_date;
	private String delyn;
	private int cnt;
	
	private String name;
}
