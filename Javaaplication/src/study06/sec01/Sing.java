package study06.sec01;

public class Sing {
	// 가수, 가사, 노래제목, 작곡가, 발매연도
	
	String singer;
	String lyrics;
	String title;
	String songwriter;
	String releaseYear;
	@Override
	public String toString() {
		return "Sing [singer=" + singer + ", lyrics=" + lyrics + ", title=" + title + ", songwriter=" + songwriter
				+ ", releaseYear=" + releaseYear + "]";
	}
}
