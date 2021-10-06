
public class Grade {

	public static void main(String[] args) {
		
		int kor = 50;
		int eng = 70;
		int math = 95;

		int sum = kor + eng + math;
		double avg = (double)sum / 3;

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
	}

}

/*
아래를 프로그래밍 하시오.
국어 : 50
영어 : 70
수학 : 95

총점과 평균을 구하시오.
-단 평균은 소숫점 까지 나오도록 하시오
*/
