
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

//1과 10000 사이의 숫자중 5의 배수이자 7의 배수인 수의 갯수는(프로그램밍 하시오)