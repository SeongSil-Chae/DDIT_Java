import java.util.Iterator;
import java.util.Scanner;

public class Array_prac {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Array_prac obj = new Array_prac();
		obj.process();
	}

	public void process() {

		// 로또 만들기.

		// 로또 45개 배열 만들기
		int[] arr = new int[45];		
		// 1~45까지 값 담기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1; 
		}
		// 배열 섞기

		for (int i = 0; i < 10000; i++) {
			int ran = (int)(Math.random()*arr.length);
			int temp = arr[0];
			arr[0]= arr[ran];
			arr[ran] = temp;
			
		}
		// 6개짜리 배열 만들기
		int[] lotto = new int[6];
		// System.arraycopy 이용해서 잘라 넣기
		System.arraycopy(arr, 0, lotto, 0, 6);
		// 6개 배열 정렬하기.
		for(int l : lotto) System.out.print(l+"\t");
		
		
		
		
}
}