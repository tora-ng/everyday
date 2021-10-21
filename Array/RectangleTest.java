package everys;

import java.util.Scanner;

class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}


	public static int getArrRec(Rectangle[] rec) { // rec에 대한 데이터 타입을 적어 줘야 한다.
		int sum = 0;
		for (Rectangle rectangle : rec) {
			sum += rectangle.getArea();
		}
		return sum;
	}
}

public class RectangleTest {
	
	public static void main(String[] args) {

		Rectangle[] rec = new Rectangle[2];

		rec[0] = new Rectangle(100, 200);
		rec[1] = new Rectangle(10, 20);

		int area = Rectangle.getArrRec(rec); // rec 배열을 넣으면 해당 배열의 모든 사각형의 넓이를 구할 수 있다.
		System.out.println("합계 넓이는: " + Rectangle.getArrRec(rec));

	}

}
/*
 * int[] arr = new int[2];
 * 
 * System.out.println("가로와 세로의 값을 입력하세요."); Scanner sc = new Scanner(System.in);
 * int width = sc.nextInt(); int heigth = sc.nextInt();
 * 
 * for (int i = 0; i < arr.length; i++) { int area = width * heigth; } for (int
 * i = 0; i < arr.length; i++) { }
 * 
 * Rectangle rectangle = new Rectangle(width, heigth); rectangle.show(); }
 * 
 * }
 * 
 * /* Rectangle 을 배열로 3개 선언
 * 
 * 해당 객체에 인덱스 순서대로 가로 세로 설정 - 이번에는 반드시 scanner 로 입력 받을것
 * 
 * 해당 배열에 있는 Rectangle 의 총넓이의 합을 구하시오.
 * 
 * 또한 아래의 함수도 만들것(static 으로 만들것) - 파라미터를 Rectangle 배열로 받아서 해당 배열에 들어 잇는
 * Rectangle 들에 총 넓이를 리턴 하는 함수를 만드시오.
 */