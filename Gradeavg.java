
public class Gradeavg {

	public static void main(String[] args) {
		
		int kor = 30;
		int eng = 30;
		int math = 60;
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("점수의 총합은 " + total + "입니다");
		System.out.println("평균 점수는 " + avg + "입니다");
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		if (90 <= avg) {
			System.out.println("당신의 성적은 수입니다");
		} else if (80 <= avg) {
			System.out.println("당신의 성적은 우입니다");
		} else if (70 <= avg) {
			System.out.println("당신의 성적은 미입니다");
		}  else if (60 <= avg) {
			System.out.println("당신의 성적은 양입니다");
		}  else {
			System.out.println("당신의 성적은 가입니다");
		}
	}

}

//국영수 총점 평균 및 수우미양가출력
