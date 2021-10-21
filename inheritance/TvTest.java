/*
===========
[1번] 32인치 1024컬러 - main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
[2번] 192.1.1.2 주소에 32인치, 2048컬러 - ColorTV를 상속받는 IPTV 클래스를 작성하라.
===========
 */
package inheritance;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	protected int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color; // 생성자
	}

//	public void printProperty() {
//		System.out.println(super.getSize() + "인치 " + this.color + "컬러");
		// 그냥 size를 넣으면 안 되니까 함수를 이용!!
//	}
}

class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size,color);	//여기에는 부모 걸 다 써야 함!!	 그리고 내 거 처리하기 전에 부모 생성자가 먼저 와야 함.
		this.ip = ip;

	}

	public void printProperty() {
		System.out.println(this.ip + "주소에 " + getSize() + "인치 " + super.color + "컬러");

	}
}

public class TvTest {

	public static void main(String[] args) {

//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

		iptv.printProperty();
	}
}


