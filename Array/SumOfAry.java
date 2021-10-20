package Array_10_20;

public class SumOfAry {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = SumOfAry(ar);
	}

	static int SumOfAry(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}

	static int[] makeNewIntAry(int len) {
		int[] ar = new int[len];
		return ar;
	}
	
	static int[] makeNewIntAry2(int len) {
		return new int[len];
	}

}
