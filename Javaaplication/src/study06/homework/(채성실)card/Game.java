package study06.homework.card;

import java.util.Random;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		//  컴퓨터가 랜덤으로 뽑은 카드와
		// 내가 뽑은 카드의 숫자를 비교하고 내 숫자가 더 크다면 이겼다를 출시하시오.
		// 내 카드값과 컴터 카드 값 표시
		Deck d = new Deck();
		int com = 0;
		int m2 = 0;
		// 컴퓨터 랜덤값
		int ran = (int)(Math.random()*d.cardSize());
		Card c = d.getCard(ran);
//		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		Card m = d.getCard(answer);

		int comNum = c.card2();
		int m3 = m.card2();
		
		if(comNum>m3) {
			System.out.println("컴터가 이김");
		}
		else if(m3>comNum) {
			System.out.println("내가 이김");
		}
		else {
			System.out.println("컴터랑 나랑 비김");
		}
		
		System.out.println("컴퓨터 값 : "+c);
		System.out.println("내 값 : "+m);

		
	}
}
