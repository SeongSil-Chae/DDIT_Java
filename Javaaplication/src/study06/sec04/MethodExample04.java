package study06.sec04;

public class MethodExample04 {
	public static void main(String[] args) {
		MethodExample04 obj = new MethodExample04();
		obj.process();
	}
	
	public void process () {
		int[] arr= {1,2,3};  // sum 다음 배열도 가능.
		System.out.println(sum(1,2,3,4,5));
	}
	// ... 표시는 인트값은 몇개올지 모른다 라는뜻
	public int sum(int...arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}