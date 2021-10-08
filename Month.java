
public class Month {

	public static void main(String[] args) {

		int month= 3;

		switch (month) {
		case 1, 2, 3, 4:
			System.out.println("봄입니다.");
			break;
		case 5, 6, 7, 8:
			System.out.println("여름입니다.");
			break;
		case 9, 10, 11, 12:
			System.out.println("겨울입니다.");
			break;
		default: System.out.println("출력이 안 됩니다");
			break;
		}
		
	}
}

/*
swithc 문에서 아래의 프로그래밍을 짜시오.
1234 월 봄입니다.출력
5678 월 여름입니다.출력
9 10 11 12 월 겨울 입니다. 출력
*/