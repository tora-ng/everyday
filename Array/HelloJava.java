import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String word = sc.next();
			String[] name = word.split("-"); // �� ���α׷����� "."���� ������ �ʴ� ����?? �𸣰���

			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
				
				
//				String YesOrNo = sc.next();
//				System.out.println("��� YES :: �ߴ� NO");
//				if(YesOrNo == "YES" ||YesOrNo == "yes")
//					continue;
//				else break;
			}
		}
	}

}
/*
 * "Hello.java" ���ڿ����� ���ϸ�� Ȯ������ java�� �и���Ű�� ���α׷��� ¥�ÿ�. While��, Scanner ���
 * 
 * 
 * �Է�: Hello.java ���: �����̸���: Hello �̸� Ȯ���ڴ� java �Դϴ�.
 * 
 * �Է�: Java.avi ���: ���� �̸���: Java �̸� Ȯ���ڴ� avi �Դϴ�.
 */