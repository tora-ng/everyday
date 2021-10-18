import java.util.Scanner;

class Circle {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public double setArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("반지름 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		double area = radius * radius * Math.PI;
		
		System.out.println(area);
	

	}

}
int 값을 하나 입력 받아
원의 넓이를 구하는 프로그램을 짜시오.
단 Circle 은 객체로 만들것.

출력 예)
반지름을 입력 하세요.
100
314.78678 입니다.
