
public class starPrint3 {

	public static void main(String[] args) {
		
		starPrint3(5);
	}
	
	public static void starPrint3(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i)-1; j++) {
				System.out.print("*"); //����� �ȿ��� ����
			}
			 System.out.println( );
			 
		} return;
	}
}

	
	
	
	
/*
 �Ʒ��� �Լ��� ����ÿ�.

starPrint3(5) 

���
   
    *   
   ***
  *****
 *******
*/