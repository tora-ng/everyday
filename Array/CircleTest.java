package Array_10_20;

class Circle {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	Circle(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}
	public double getArrArea(Circle[] circleArr) {
		double sum = 0;
		for (int i = 0; i < circleArr.length; i++) {
			sum = sum + circleArr[i].getArea();
			System.out.println("반지름" + circleArr[i].getR());
		}
		return sum;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(3);

		Circle[] circleArr = new Circle[5];

		// 원 입력
		/*
		 * circleArr[0] = new Circle(1); circleArr[1] = new Circle(1); circleArr[2] =
		 * new Circle(1); circleArr[3] = new Circle(1); circleArr[4] = new Circle(1); 이걸
		 * for문으로 돌린다.
		 */
		for (int i = 0; i < circleArr.length; i++) {
			int r = (int) (Math.random() * 100) + 1;
			circleArr[i] = new Circle(r);
		}
		System.out.println("총넓이"+ circleArr[0].getArrArea(circleArr));

//		double sum = 0;
//		for (int i = 0; i < circleArr.length; i++) {
//			sum = sum + circleArr[i].getArea();
//			System.out.println("반지름" + circleArr[i].getR());
//		}
//		System.out.println("총 넓이: " + sum);
//	 //이 부분을 함수로 만들기 - getArrArea()
	}
}
//Circle 배열 5개 선언, 해당 객체에 인덱스 순서대로 반지름 설정 Circle의 촌넓이의 합 구하기
//파라미터를 Circle 배열로 받아서 해당 배열에 들어있는 Circle들에 총 넓이를 리턴하는 함수를 만드시오.
