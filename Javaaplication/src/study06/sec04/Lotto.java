package study06.sec04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Lotto {
	
	int lottoLength = 6;
	int maxNo = 45;
	public static void main(String[] args) {
		Lotto l = new Lotto();
		l.process();
		
	}
	
	
	public void process() {
		int [] lotto = generateLotto();
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
//		int [][] l5 = lottoPaper();
//		for(int[] is : l5) {
//			System.out.println(Array2String(is));
//		}
		
		int [][][] bun = lottoBundle(15000);
		for(int[][] is : bun) {
			System.out.println("===========================");
			for(int[] is2 : is) {
				System.out.println(Array2String(is2));
			}
		}
//		lotto = arraySort(lotto);
//		System.out.println(Array2String(lotto));
//		
	}
	
	public String Array2String(int[] arr) {
		String result ="★☆★☆ 명당 자리에서 뽑은 로또 번호 : \n";
		for(int i=0; i<arr.length; i++) {
			result+=arr[i];	
			if(i!=arr.length-1) {
				result+=", ";
			}
		}
		result += "\n"+"  날이면 날마다 오는게 아니다 ★☆★☆ ";
		
		return result;
		
	}
	
	public int[][][] lottoBundle(int money){
		
		int papers = money/5000;
		if(money%5000!=0) papers++;
		
		int[][][] bundle = new int[papers] [5] [lottoLength] ;
		for (int i = 0; i < bundle.length; i++) {
			if(i==bundle.length-1 && money%5000!=0) bundle[i] = lottoPaper((money%5000)/1000);
//			if(i==bundle.length-1) {
//				if(money%5000!=0) {
//					int line = (money%5000)/1000;
//					bundle[i] = lottoPaper(line);
//				}
//			}
			else bundle[i] = lottoPaper();
		}
		
		return bundle;
	}
	
	public int[][] lottoPaper(int line){
		int[][]paper = new int [line][lottoLength];
		
		for(int i =0; i<paper.length; i++) {
			paper[i] = generateLotto();
		}
		
		return paper;
	}
	
	public int[][] lottoPaper() {
//		int[][]paper = new int [5][lottoLength];
//		
//		for(int k=0; k<paper.length; k++) {
//			paper[k] = generateLotto();
//
//		}
//		
		return lottoPaper(5);
		
	}
	
	// 로또 6개자리 인트 배열 만들기
	 public int[] arraySort(int[] array) {
		 
		 for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] <array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		 
		 return array;
	 }
	
	// Lotto 6개짜리 int 배열 만들기
	
	public int[] generateLotto() {
		int[] lotto = new int[lottoLength];
		
		// 로또 45개 출력
		// 중복으로 나오면 다시 추출 
		for (int i = 0; i < lotto.length; i++) {
			int ran = new Random().nextInt(maxNo)+1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if(ran == lotto [j]) {
					i--;
					break;
				}
			}
		}
		
		return lotto;
	}
	
}
