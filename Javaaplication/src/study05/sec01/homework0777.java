
package study05.sec01;

import java.util.Scanner;

public class homework0777 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework0777 obj = new homework0777();
		obj.process();
	}

	public void process() {

//		6개의 단어가 제공되며
//		이중 임의의 단어가 선택된다
//		
//		사용자는 이를 보고 원래의 단어를 입력한다.
//		
//		사용자가 단어를 맞출때까지 반복하며 단어를 맞추었을때 시도 횟수 출력

		String[] words = { "time", "person", "year", "way", "world", "hand" };
		String sel = "";
		int rand = (int) (Math.random() * words.length);
		sel = words[rand];
		// 랜덤으로 words 에 값을 추출해서 넣을것.

		// 글자 섞기
		// 문자열 -> 문자 배열
		char[] chars = sel.toCharArray();

		for (int i = 0; i < 10000; i++) {
			int ran = (int) (Math.random() * chars.length);
			char temp = chars[0];
			chars[0] = chars[ran];
			chars[ran] = temp;
		}
		String a = "";
		for (int i = 0; i < chars.length; i++) {
			a += chars[i];
		}
		
		int cnt = 0;
		while (true) {
			System.out.println(a);
			// char 배열 출력하기
			String answer = sc.next();
			if (answer.equals(sel)) {
				break;
			}
			
			else {
				System.out.println("틀렸습니다 ㅋㅋ");
			}
			cnt++;

			// answer 값이 맞다면 while문 종료
		}
		System.out.println(cnt + "번 asd틀렸습니다.");

	}
}
