class Box{
	private String conts; // = "Camera"
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts; // = "Camera" ���� Camera�� ������
	}
}
public class ToString {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString()); //String Ÿ�� "1234"
		//println ���� String �Լ��� ����.
		System.out.println(stb); //��ü�� ���� ���̴�.
		//println ���� Object �Լ��� ���� (StringBuilder stb�� ���� ������)
		// ^�� ������ �� ������ �Լ��� ��� ������ �� ���ΰ�?
		//: �Լ��� ���� �� ������ Ÿ���� StringBuilder stb �̷��� �ִ´�
		
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		
		System.out.println(box);
		//8���� ������Ÿ���� ������ �ڷ����� println ���� Object�� ���´�
		//F3 ġ�� ������ �ᱹ ���������δ� toString���� ȣ���ϰ� �Ǿ��ִ�.
		//������ �� ���ٴ� �� println()�Լ����� box�� �޾Ƴ��ٴ� �̾߱��.
		//���� box�� null�̸� �� F3���� �� ���� null �κ��� ã�Ƴ���.

	}

}
