package Array_10_20;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		Arrays.fill(ar1, 7); //�迭  ar1�� 7�� �ʱ�ȭ
		System.arraycopy(ar1, 0, ar2, 3, 4); //�迭 ar1�� ar2�� �κк���

		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " "); //7�� �ʱ�ȭ�߱� ������ �� 7�� ����
		System.out.println();

		for (int i = 0; i < ar2.length; i++)
			System.out.print(ar2[i] + " ");
	}

}