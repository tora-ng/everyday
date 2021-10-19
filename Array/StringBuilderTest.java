public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");
		
		//12345678
		stbuf.append(45678); //���ڿ� �����̱�
		System.out.println(stbuf.toString());
		
		//345678
		stbuf.delete(0, 2); //���ڿ� �Ϻ� ����
		System.out.println(stbuf.toString());
		
		//AB678
		stbuf.replace(0, 3, "AB"); //���ڿ� �Ϻ� ��ü
		System.out.println(stbuf.toString());
		
		//876BA
		stbuf.reverse(); //���ڿ� ���� ������
		System.out.println(stbuf.toString());
		
		//
		String sub = stbuf.substring(2, 4); //�Ϻθ� ���ڿ� ��ȯ
		System.out.println(sub);
	}

}
