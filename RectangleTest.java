import java.util.Scanner;

class Rectangle{
	private int width;
	private int height;
	
	Rectangle(int width1, int height1){
		this.width = width1;
		this.height = height1;
	}
	public int setArea() {
		return width *  height;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		System.out.println("가로 세로의 길이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int width1 = sc.nextInt();
		int height1 = sc.nextInt();
		
		int area = width1 * height1;
		
		
		System.out.println(area);

	}

}

Rectangle 클래스 작성

int 값 두개 입력

출력
가로 세로 입력 하세요.
100 
200
넓이는 20000 입니다.
