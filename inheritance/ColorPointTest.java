//package inheritance;
//
//class Point {
//	private int x, y;
//
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	protected void move(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//}
//
//public class ColorPoint extends Point{
//	String color;
//	
//	public void setXY(int x, int y) {
//		
//	}
//	public void setColor(String color) {
//			
//	}
//	
//}
//
//
//public class ColorPointTest {
//
//	public static void main(String[] args) {
//
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str + "입니다. ");
//	}
//
//}

/*
 * 2차원 상의 한 점을 표현하는 Point 클래스 Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
 */