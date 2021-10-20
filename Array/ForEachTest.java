package Array_10_20;

public class ForEachTest {

	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		
		for(int e: ar) {
			System.out.println(e + " ");
		}
		System.out.println();
		
		int sum = 0;
		
		//배열 요소의 전체 합 출력
		for(int e: ar) {
			sum += e;
		}
		System.out.println("sum: " + sum);

	}

}
