package kr.or.ddit.day02;

public class MyArr2 {
	public static void main(String[] args) {
		int [][] arr ={{2,3,7},{5,6,9,8}};
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}				
}