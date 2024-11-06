package study10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Homework18 {

	public static void main(String[] args) {
		Homework18 obj = new Homework18();
		obj.process();

	}

	public void process() {
		// 주사위 2개를 던진 눈금의 합을 히스토그램으로 그리시오.
		// 백분율로 출력한다.
		// 어딘가 닮아야한다.
		// 주사위는 6 두번 던져 합한걸로 한다.
		int num = 1000;

		int[] sum = new int[num];
		for (int i = 0; i < sum.length; i++) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			sum[i] = a + b;
		}

		int[] hist = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < sum.length; i++) {
			hist[sum[i] - 2]++;
		}

		System.out.println(Arrays.toString(hist));

		for (int i = 0; i < hist.length; i++) {
			System.out.println();
			System.out.print(i + 2 + " = " + "\t");
			for (int j = 0; j < (double) hist[i] / num * 100; j++) {
				System.out.print("■");
			}
		}
	}
}
