
public class Num {

	public static void main(String[] args) {

		int count = 0;
		
		for (int i =1; i <= 10000; i++) {
			if ((i % 5 != 0) || (i % 7 != 0)) {
				continue;
			}
			count++;
			System.out.println(count);
			
		}
	}

}

//1�� 10000 ������ ������ 5�� ������� 7�� ����� ���� ������(���α׷��� �Ͻÿ�)