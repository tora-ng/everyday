
public class ArrayTest {

	public static void main(String[] args) {
		//���̰� 5�� int�� 1���� �迭�� ����
		int[] ar1 = new int[5]; //20byte
		
		//���̰� 5�� double�� 1���� �迭�� ����
		double[] ar2 = new double[7]; //56byte
		
		//�迭�� ���������� �ν��Ͻ� ���� �и�
		float[] ar3;
		ar3 = new float[9]; //36byte
		
		//�迭�� �ν��Ͻ� ���� ����
		System.out.println("�迭 ar1�� ����: " + ar1.length); //�Լ��� str.length();�̷��� ���µ� ��� �Լ��� �ƴ� �����̱� ������ ar1.length �̷��� ����
		System.out.println("�迭 ar2�� ����: " + ar2.length);
		System.out.println("�迭 ar3�� ����: " + ar3.length);
	}

}
