package study06.homework.card;

import java.util.Random;

public class Deck {

	private Card[] cardList;

	public Deck() {
		cardList = new Card[52];
		int cnt = 0;
		String[] types = { "♠", "◇", "♡", "♣" };
		for (String type : types) {
			for (int i = 1; i <= 13; i++) {
				Card c = new Card(i, type);
				cardList[cnt++] = c;
			}
		}

	}

	// 카드 섞기
	public void shuffle() {
		Random ran = new Random();
		for (int i = 0; i < 10000; i++) {
				int rand = ran.nextInt(cardList.length);
				Card temp = cardList[i];
				cardList[i] = cardList[rand] ;
				cardList[rand] = temp; 
				
		}
		
	}

	public int cardSize() {
		return cardList.length;
	}

	public Card getCard(int num) {
		Card c = cardList[num];
 
		Card[] temp = new Card[cardList.length - 1];
		int add = 0;
		for (int i = 0; i < temp.length; i++) {
			if (i == num)
				add++;
			temp[i] = cardList[i];
		}
		cardList = temp;
		return c;

	}
}
