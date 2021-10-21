
public class TwoDimenArray {

	public static void main(String[] args) {
		
		int[][] arr= new int[3][4];
		int num = 1;
		
		//배열에 값을 저장
		for(int i = 0; i < arr.length; i++) { //여기가 i < arr.lenght가 되는 이유는, arr(2000번지)를 찾아가서 배열의 개수를 세어 보면 3이기 때문에 3이 들어감
			for(int j = 0; j < arr[i].length; j++) { //여기가 j < arr[i].length인 이유는 arr[0]에서 번지를 찾아가 배열의 개수를 세어보면 4이기 때문에 4가 들어감
				arr[i][j] = num;
				num++;
			}
		}
		
		//배열에 저장된 값을 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
