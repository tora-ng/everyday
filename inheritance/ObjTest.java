//package inheritance;
//
//class TV1 {
//	private int size;
//
//	public TV1(int size) {
//		this.size = size;
//	}
//
//	// private -> default -> protected -> public
//
//	protected int getSize() {
//		return size;
//	}
//}
//
//
//class ColorTV extends TV1 {
//	private int color;
//
//	public ColorTV(int size, int color) {
//		super(size);
//		this.color = color;
//	}
//
//	public void printProperty() {
//		System.out.println(super.getSize() + "인치" + this.color + "컬러");
//	}
//
//}
//
//class IPTV extends ColorTV{
//	private String ip;
//	
//	public IPTV(String ip , int size, int color) {		
//		super(size, color);		
//		this.ip = ip;		
//	}
//	
//	public void printProperty(){
//		System.out.print(ip + " 주소 ");
//		super.printProperty();
//		
//	}
//	
//}
//
//public class ObjTest {
//
//	public static void main(String[] args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
//
//		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
//		iptv.printProperty();
//
//	}
//
//}
