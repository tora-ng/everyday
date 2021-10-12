
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
				System.out.print("*"); //출력을 안에서 했음
			}
			 System.out.println( );
			 
		} return;
	}
}

	
	
	
	
/*
 아래를 함수로 만드시오.

starPrint3(5) 

출력
   
    *   
   ***
  *****
 *******
*/