
public class Month {

	public static void main(String[] args) {

		int month= 3;

		switch (month) {
		case 1, 2, 3, 4:
			System.out.println("���Դϴ�.");
			break;
		case 5, 6, 7, 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9, 10, 11, 12:
			System.out.println("�ܿ��Դϴ�.");
			break;
		default: System.out.println("����� �� �˴ϴ�");
			break;
		}
		
	}
}

/*
swithc ������ �Ʒ��� ���α׷����� ¥�ÿ�.
1234 �� ���Դϴ�.���
5678 �� �����Դϴ�.���
9 10 11 12 �� �ܿ� �Դϴ�. ���
*/