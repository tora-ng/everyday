package Array_10_20;

class Box5 {
	private int boxNum;
	private String contents;

	public Box5(int boxNum, String str) {
		this.boxNum = boxNum;
		this.contents = str;
	}

	public int getBoxNum() {
		return boxNum;
	}

	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}

	public String toString() {
		return contents;
	}

}

public class ForEachTest2 {

	public static void main(String[] args) {
		Box5[] ar = new Box5[5];
		ar[0] = new Box5(101, "Coffee");
		ar[1] = new Box5(202, "Computer");
		ar[2] = new Box5(303, "Apple");
		ar[3] = new Box5(404, "Dress");
		ar[4] = new Box5(505, "Fairy-tale book");

		for (Box5 e : ar) {
			if (e.getBoxNum() == 505)
				System.out.println(e);
		}

	}

}

//505을 만나면 그 문구를 출력하는 
