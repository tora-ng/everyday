
public class TrueFalse {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		boolean bool;
		
		bool = (1 < num1) && (num1 < 100);
		System.out.println(bool);
		
		bool = ((num2 % 2)==0 || (num2 % 3)==0);
		System.out.println(bool);

	}

}
