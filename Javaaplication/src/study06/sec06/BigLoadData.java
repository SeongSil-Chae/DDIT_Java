package study06.sec06;

public class BigLoadData {
	private static BigLoadData instance;

	public BigLoadData() {
		
		
		
		try {
			for(int i=0; i<5; i++) {
				System.out.print(".");
				Thread.sleep(1000);
				
			}
			System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static BigLoadData getInstance() {
		if (instance == null)
			instance = new BigLoadData();
		return instance;
	}

	
}
