package Array_10_20;

public class ArrayString {

	public static void main(String[] args) {
		String[] sr = new String[3];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");

		int cnum = 0;
		for (int i = 0; i < sr.length; i++) {
			cnum += sr[i].length();

		}
		System.out.println("ÃÑ ¹®ÀÚÀÇ ¼ö: " + cnum);
	}

}
