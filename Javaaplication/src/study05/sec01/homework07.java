package study05.sec01;

import java.util.Scanner;

public class homework07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework07 obj = new homework07();
		obj.process();
	}

	public void process() {
		
//		6개의 단어가 제공되며
//		이중 임의의 단어가 선택된다
//		
//		사용자는 이를 보고 원래의 단어를 입력한다.
//		
//		사용자가 단어를 맞출때까지 반복하며 단어를 맞추었을때 시도 횟수 출력
		
		String[] words = {"time", "person", "year", "way","world","hand"};
		
		// 랜덤으로 words  에 값을 추출해서 넣을것.
		String sel = "";
		int random = (int)(Math.random()*words.length);
			sel+= words[random];
		//방법 2	// String sel = words[(int)(Math.random()*words.length)];
			
		// 글자 섞기
		// 문자열 -> 문자 배열
		char[] chars = sel.toCharArray(); // [t,i,m,e]
		
		for (int i = 0; i < 10000; i++) {
			int ran = (int)(Math.random()*chars.length); //2
			char temp = chars[0]; //t
			chars[0] = chars[ran]; // [m,i,m,e]
			chars[ran] = temp;  // [m,i,t,e]
			// [ ]
			
		} 
		// char 타입인 chars(섞인단어) 
		String a = "";
		for(int i=0; i<chars.length; i++) {
			a+=chars[i];
			//char -> String 으로 변경 해줬고
		}
		int count=0;
		while(true) {
			// char 배열 출력하기
//			System.out.println(a);
//			String answer = sc.next();		
//			if(sel.equals(answer)) {
//			break;
			
			for (int i = 0; i < chars.length; i++) {
				System.out.print(chars[i]);
			}
			System.out.println();
			
			System.out.println("정답 : ");
			String answer = sc.next();
			
			if(answer.equals(sel)) {
				break;
			}
			
			}
			count++;
			// answer 값이 맞다면 while문 종료
		}
//		System.out.println("총 몇번? "+count);
		
	}

