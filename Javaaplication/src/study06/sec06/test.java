package study06.sec06;

public class test {
	private static test instance;

	private test() {

	}

	public static test getInstance() {
		if (instance == null)
			instance = new test();
		return instance;
	}

	
}
