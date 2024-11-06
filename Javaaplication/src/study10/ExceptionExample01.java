package study10;

public class ExceptionExample01 {
	public static void main(String[] args) {
	ExceptionExample01 obj = new ExceptionExample01();
	obj.method1();
		

	}
	
	public void method1() {
		int [] arr = new int[5];
		
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}

