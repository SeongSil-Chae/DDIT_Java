package study06.sec06;

public class SingleTon {
	private static SingleTon instance;
	
	static int a;
	
	private SingleTon() {
		a++;
	}

	public static SingleTon getInstance() {
		if (instance == null)
			instance = new SingleTon();
		return instance;
	}

	
}
