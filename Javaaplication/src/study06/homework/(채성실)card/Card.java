package study06.homework.card;

public class Card {
	private int num;
	private String type;
	
	public Card(int num, String type) {
		this.num = num;
		this.type = type;
	}
	
	@Override
	public String toString() {
		String num = this.num+"";
		if(this.num==1) num="A";
		if(this.num==11) num="J";
		if(this.num==12) num="Q";
		if(this.num==13) num="K";
		return type+num;
	}
	
	public int card2(){
		return num;
	}
}
