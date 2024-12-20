package study06.sec01;

public class Homework10 {

	public static void main(String[] args) {
		
		// 학생 객체 5명(s0~s4) 만들고 값을 입력
		Student s0 = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student[] stuList = new Student[5];
		
		s0.name = "김일번";
		s0.kor = 80;
		s0.eng = 90;
		s0.Math = 95;
		s0.sum = 0;
		s0.avg = 0;
		s0.rank = 1;
		
		s1.name = "김이번";
		s1.kor = 70;
		s1.eng = 80;
		s1.Math = 90;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;
		
		s2.name = "김삼번";
		s2.kor = 66;
		s2.eng = 60;
		s2.Math = 95;
		s2.sum = 0;
		s2.avg = 0;
		s2.rank = 1;
		
		s3.name = "김사번";
		s3.kor = 100;
		s3.eng = 75;
		s3.Math = 85;
		s3.sum = 0;
		s3.avg = 0;
		s3.rank = 1;
		
		s4.name = "김오번";
		s4.kor = 55;
		s4.eng = 99;
		s4.Math = 77;
		s4.sum = 0;
		s4.avg = 0;
		s4.rank = 1;
		
		
		// stuList에 학생 객체 담기
		stuList[0] = s0;
		stuList[1] = s1;
		stuList[2] = s2;
		stuList[3] = s3;
		stuList[4] = s4;
		
		
		// 총점 평균 구하기
		for(int i =0; i<stuList.length; i++) {
			stuList[i].sum = stuList[i].kor + stuList[i].eng + stuList[i].Math;
	
			// 위랑 같은 이야기
//			for(student stu : stuList) {
//				stu.sum = stu.kor + stu.eng + stu.Math;
//				stu.avg = stu.sum/3.0;
//			}
		
		stuList[i].avg = stuList[i].sum/3.0;
		}
		// 등수 구하기.
		for(int i=0; i<stuList.length; i++) {
			for(int j=0; j<stuList.length; j++) {
				if(stuList[i].sum<stuList[j].sum) {
					stuList[i].rank++;
				}
			}
		}
		
		// 위랑 같음 등수구하기
//		for(Student student : stuList) {
//			for(Student student2 : stuList) {
//				if(student.sum<student2.sum) {
//					student.rank++;
//				}
//			}
//		}

		
		// 출력하기
		for (int i = 0; i < stuList.length; i++) {
			System.out.print(stuList[i] + "\t");

			System.out.println();
		}
		// 정렬하기
		for(int i=0; i<stuList.length; i++) {
			for(int j=0; j<stuList.length; j++) {
				System.out.println(""+i +" "+ j);  // 애매하면 찍어보기
				if(stuList[i].sum>stuList[j].sum) {
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
//		위랑 같음.
//		for(Student stu : stuList) {
//			System.out.println(stu);
//		}
	}

}

class Student {
	// 이름 국 영 수 총점 평균 등수 를 필드로 만들것.
	String name;
	int kor;
	int eng;
	int Math;
	int sum;
	double avg;
	int rank=1;
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", Math=" + Math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
	// toString 만들기
	
}
