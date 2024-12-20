package study06.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework14 {
	Scanner sc = new Scanner(System.in);
	int lottoLength = 6;
	int maxNo = 8;

	public static void main(String[] args) {
		Homework14 obj = new Homework14();
		obj.process();
	}
	public void process() {
		// 로또 숫자가 1~8 범위일때 로또 클래스를 구하시오.
		// 당첨 번호를 회차별로 생성하고
		// 당첨 번호와 숫자가 모두 같다면 상금 3만원을 지급

		// 보유급액보다 큰 값은 입력 불가능.

		int money = 50000;
		while (money >= 0) {
			System.out.println("구매할 금액을 입력하시오.");
			// 사용자가 사용할 돈 입력
			int intoMoney = sc.nextInt();

			// 입력 하는 값이 0이면 집에 갈거임 ;
			if (intoMoney == 0) {
				System.out.println("종료");
				break;
				
			}
			if(intoMoney>money) {
				System.out.println("돈 없으니 꺼저ㅕ");
				continue;
			}

			// 보유금액 - 지불금액
			money -= intoMoney;

			// 로또발급 : intoMoney/1000 = 로또 나와야댐
			int lottoCnt = intoMoney / 1000;
			// 로또를 원하는 갯수만큼 뽑을려고 2차원 배열 생성
			int[][] myLotto = new int[lottoCnt][lottoLength];
			// 로또 갯수를 입력값에 따라 반복문으로 넣기
			for (int i = 0; i < lottoCnt; i++) {
				myLotto[i] = generateLotto();
				System.out.println(array2String(myLotto[i]));
			}
			
			// 이번회차 로또 당첨 번호.
			int[] winLotto = generateLotto();
			System.out.println(array2String2(winLotto));
			// myLotto 가 winLotto와 같다면 money 3만원 입금
			int winnerCnt = 0;
			for (int[] lot : myLotto) {
				int cnt = 0;
				for (int i = 0; i < lottoLength; i++) {
					// lot [i] 와 winLotto [i] 가 마지막 까지 같은지
					if (lot[i] == winLotto[i]) {
						cnt++;
					}

				}
				if (cnt == lottoLength) {
					money += 30000;
					winnerCnt++;
				}
			}
			System.out.println("남은금액 : " + money);
			System.out.println("당첨 횟수 : " + winnerCnt);
		}
	}

	public String array2String2(int[] arr) {
		String result = "이번회차 당첨 로또 번호 = [";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != arr.length - 1) {
				result += ", ";
			}
		}
		result += "]";

		return result;

	}

	public String array2String(int[] arr) {
		String result = "내가 뽑은 로또 번호 = [";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != arr.length - 1) {
				result += ", ";
			}
		}
		result += "]";

		return result;

	}

	// 당첨번호 랜덤 생성
	public int[] winningLotto() {
		int[] winlotto = new int[lottoLength];
		for (int i = 0; i < winlotto.length; i++) {
			int ran = new Random().nextInt(maxNo) + 1;
			winlotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (ran == winlotto[j]) {
					i--;
					break;
				}
			}
		}
		return winlotto;
	}

	// 로또 6개짜리 인트 배열 만들기
	public int[] generateLotto() {
		int[] lotto = new int[lottoLength];

		// 로또 8개 출력
		// 중복으로 나오면 다시 추출
		for (int i = 0; i < lotto.length; i++) {
			int ran = new Random().nextInt(maxNo) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (ran == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

}

class Lotto {

}
