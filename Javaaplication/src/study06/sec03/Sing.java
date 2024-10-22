package study06.sec03;

public class Sing {
	// 가수, 가사, 노래제목, 작곡가, 발매연도
	
	String singer;
	String lyrics;
	String title;
	String songwriter;
	String releaseYear;
	
	/**
	 * @param singer 가수
	 * @param lyrics 가사
	 * @param title 제목
	 * @param songwriter 작곡가
	 * @param releaseYear 발매연도
	 */
	public Sing(String singer, String lyrics, String title, String songwriter, String releaseYear) {
		this.singer = singer;
		this.lyrics = lyrics;
		this.title = title;
		this.songwriter = songwriter;
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "Sing [singer=" + singer + ", lyrics=" + lyrics + ", title=" + title + ", songwriter=" + songwriter
				+ ", releaseYear=" + releaseYear + "]";
	}
}
