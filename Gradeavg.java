
public class Gradeavg {

	public static void main(String[] args) {
		
		int kor = 30;
		int eng = 30;
		int math = 60;
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("������ ������ " + total + "�Դϴ�");
		System.out.println("��� ������ " + avg + "�Դϴ�");
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		if (90 <= avg) {
			System.out.println("����� ������ ���Դϴ�");
		} else if (80 <= avg) {
			System.out.println("����� ������ ���Դϴ�");
		} else if (70 <= avg) {
			System.out.println("����� ������ ���Դϴ�");
		}  else if (60 <= avg) {
			System.out.println("����� ������ ���Դϴ�");
		}  else {
			System.out.println("����� ������ ���Դϴ�");
		}
	}

}

//������ ���� ��� �� ����̾簡���
