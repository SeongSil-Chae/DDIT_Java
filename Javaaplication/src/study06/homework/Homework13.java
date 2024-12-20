package study06.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Homework13 {
	public static void main(String[] args) {
		Homework13 h13 = new Homework13();
		h13.process();

	}

	public void process() {
		// 최초 텍스트 파일을 스트링으로 통으로 바꿈
		String txt = readTxtFile();
		// 내가 가공한 book을 반환해서 북에 넣는다.
		Book book = getData(txt);
		System.out.println(book);

	}

	public Book getData(String allText) {
		// 해당 메소드에 변수 만듬.
		Book book = new Book();
		
						
		String[] txtList = allText.split("\n");
//		System.out.println(Arrays.toString(txtList));
		for(String text : txtList) {
			text = text.trim();
			if(text.contains("<h2 class=\"gd_name\">")) {
				text = text.replace("<h2 class=\"gd_name\">", "");
				text = text.replace("</h2>", "");
//				System.out.println(text);
				book.name = text;
			}
			
			if(text.contains("<h3 class=\"gd_nameE\">")) {
				text = text.replace("<h3 class=\"gd_nameE\">", "");
				text = text.replace("</h3>", "");
//				System.out.println(text);
				book.nameE = text;
			}
			
			if(text.contains(" target=\"_blank\">")) {
				text = text.replace("<a href=\"https://www.yes24.com/Product/Search?domain=ALL&query=%25EA%25B8%2580%25EB%25A1%259C%25EB%25A6%25AC%25EC%2595%2584%25EC%258C%25A4&authorNo=468595&author=글로리아쌤\" target=\"_blank\">", "");
				text = text.replace("</a> 저", "");
//				System.out.println(text);
				book.author = text;
			}
			
			if(text.contains("'Pcode','003_003')\">")) {
				text = text.replace("<span class=\"gd_pub\"><a href='javascript:void(0);' onclick=\"openUrl('https://www.yes24.com/Product/Search?domain=ALL&query=%25EC%259B%2585%25EC%25A7%2584%25EC%25A7%2580%25EC%258B%259D%25ED%2595%2598%25EC%259A%25B0%25EC%258A%25A4&mkEntrNo=99444','Pcode','003_003')\">", "");
				text = text.replace("</a></span>", "");
//				System.out.println(text);
				book.pub = text;
			}
			
			
			if(text.contains("class=\"gd_date\">")) {
				text = text.replace("<span class=\"gd_date\">", "");
				text = text.replace("</span>", "");
//				System.out.println(text);
				book.date = text;
			}
			
			
			
//			System.out.println(text);
//			System.out.println("-------");
		}
		
		return book;
	}

	public String readTxtFile() {

		byte[] f = null;
		try {
			f = Files.readAllBytes(Paths.get("book.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new String(f);
	}
}

class Book {
	String name;
	String nameE;
	String author;
	String pub;
	String date;

	public void name(String txt) {
//		String name = ;
//		if (txt.contains("<h2 class=\"gd_name\">")) {
//			String cut = "</h2>";
//			cut = cut.replace("</h2>", "");
//			String cut2 = "<h2 class=\"gd_name\">";
//			cut2 = cut2.replace("<h2 class=\"gd_name\">", "");
//
//			System.out.println(cut2);
//
//		}
	}

	@Override
	public String toString() {
		return "Book [책 이름=" + name + ", 서브제목=" + nameE + ", 작가=" + author + ", 출판사=" + pub + ", 출판일=" + date
				+ "]";
	}

}
