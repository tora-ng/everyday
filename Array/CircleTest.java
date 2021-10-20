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
			System.out.println("������" + circleArr[i].getR());
		}
		return sum;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(3);

		Circle[] circleArr = new Circle[5];

		// �� �Է�
		/*
		 * circleArr[0] = new Circle(1); circleArr[1] = new Circle(1); circleArr[2] =
		 * new Circle(1); circleArr[3] = new Circle(1); circleArr[4] = new Circle(1); �̰�
		 * for������ ������.
		 */
		for (int i = 0; i < circleArr.length; i++) {
			int r = (int) (Math.random() * 100) + 1;
			circleArr[i] = new Circle(r);
		}
		System.out.println("�ѳ���"+ circleArr[0].getArrArea(circleArr));

//		double sum = 0;
//		for (int i = 0; i < circleArr.length; i++) {
//			sum = sum + circleArr[i].getArea();
//			System.out.println("������" + circleArr[i].getR());
//		}
//		System.out.println("�� ����: " + sum);
//	 //�� �κ��� �Լ��� ����� - getArrArea()
	}
}
//Circle �迭 5�� ����, �ش� ��ü�� �ε��� ������� ������ ���� Circle�� �̳����� �� ���ϱ�
//�Ķ���͸� Circle �迭�� �޾Ƽ� �ش� �迭�� ����ִ� Circle�鿡 �� ���̸� �����ϴ� �Լ��� ����ÿ�.
