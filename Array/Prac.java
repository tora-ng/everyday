package Array_10_20;

public class Prac {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		for (int i : ar) { //for-each¹® »ç¿ë
			System.out.println(i);
		}
	}

}
