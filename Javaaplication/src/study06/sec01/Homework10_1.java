package study06.sec01;

public class Homework10_1 {

	public static void main(String[] args) {

		// 학생 객체 5명(s0~s4) 만들고 값을 입력

		Student[] stuList = new Student[5];


		// stuList에 학생 객체 담기
		for (int i = 0; i < stuList.length; i++) {
			int num1 = (int) (Math.random() * 100) + 1;
			int num2 = (int) (Math.random() * 100) + 1;
			int num3 = (int) (Math.random() * 100) + 1;
			// 클래스 선언
			Student student = new Student();
			
			// 선언한 클래스에 값 넣기
			student.name = "채성실 + " + i;
			student.kor = num1;
			student.eng = num2;
			student.Math = num3;
			student.sum = student.kor + student.eng + student.Math;
			student.avg = student.sum / 3;
		
			student.rank = 1;

			// 마지막 배열에 넣어주기
			stuList[i] = student;
			
		}

		// 총점 평균 구하기
		for (int i = 0; i < stuList.length; i++) {
			stuList[i].sum = stuList[i].kor + stuList[i].eng + stuList[i].Math;

			stuList[i].avg = stuList[i].sum / 3.0;
		}
		// 등수 구하기.
		for (int i = 0; i < stuList.length; i++) {
			for (int j = 0; j < stuList.length; j++) {
				if (stuList[i].sum < stuList[j].sum) {
					stuList[i].rank++;
				}
			}
		}

		// 출력하기
		for (int i = 0; i < stuList.length; i++) {
			System.out.print(stuList[i] + "\t");

			System.out.println();
		}
		// 정렬하기
		for (int i = 0; i < stuList.length; i++) {
			for (int j = 0; j < stuList.length; j++) {
				System.out.println("" + i + " " + j); // 애매하면 찍어보기
				if (stuList[i].sum < stuList[j].sum) {
					Student temp = stuList[i];
					stuList[i] = stuList[j];
					stuList[j] = temp;
				}
			}
		}
		// 출력하기
		for (int i = 0; i < stuList.length; i++) {
			System.out.print(stuList[i] + "\t");

			System.out.println();
		}
	}

}
