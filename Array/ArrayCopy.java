package Array_10_20;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		Arrays.fill(ar1, 7); //배열  ar1을 7로 초기화
		System.arraycopy(ar1, 0, ar2, 3, 4); //배열 ar1을 ar2로 부분복사

		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " "); //7로 초기화했기 때문에 다 7로 나옴
		System.out.println();

		for (int i = 0; i < ar2.length; i++)
			System.out.print(ar2[i] + " ");
	}

}
