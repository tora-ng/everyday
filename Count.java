
public class Count {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j<10; j++) {
				int result = i * j;
					
				if ((result % 2 == 0)&&(result % 3 == 0)) {
					count++;
					System.out.println(i + "*" + j + " = " + (result)+ " ���� : "+count);
				}
			}
				System.out.println( );				
		}
		System.out.println("�� ����: " +count);	
	}
}

//������� 2�� ������� 3�� ����� ���� ����