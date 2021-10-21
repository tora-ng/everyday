package StudyPrac;

class ArrMax {
	private int[] arr;

	public ArrMax() { // ArrMax(int arrLength)도 가능
		// 랜덤으로 배열 저장을 바로 함
		arr = new int[5]; // arr = new int[arrLength] 도 가능

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;

		}
	}

	// max 값을 담아 줄 변수를 선언해야 함
	// int max = 5;
	// 3, 4, 5, 2, 5
	public void printMax() {
		int max = arr[0]; // 일단 첫번째 값을 max 값으로 넣음

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (max < arr[i]) {
				max = arr[i]; // 값을 넣었을 때 큰 값을 만나면 '그 값'을 max에 넣음

			}
		}
		System.out.println("최대값은 " + max + "입니다.");
	}
}

public class NumArrayPro {

	public static void main(String[] args) {
		ArrMax arrMax = new ArrMax();
		arrMax.printMax(); // arrMax와 관련된 값을 가지고 printMax에 접근한다.

	}

}

/*
- 5개의 숫자를 랜덤 으로 받아 배열로 저장
- 5개의 숫자 중 가장 큰 값을 출력
 */