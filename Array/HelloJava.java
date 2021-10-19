import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String word = sc.next();
			String[] name = word.split("-"); // 이 프로그램에서 "."으로 나뉘지 않는 이유?? 모르겠음

			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
				
				
//				String YesOrNo = sc.next();
//				System.out.println("계속 YES :: 중단 NO");
//				if(YesOrNo == "YES" ||YesOrNo == "yes")
//					continue;
//				else break;
			}
		}
	}

}
/*
 * "Hello.java" 문자열에서 파일명과 확장자인 java를 분리시키는 프로그램을 짜시오. While문, Scanner 사용
 * 
 * 
 * 입력: Hello.java 출력: 파일이름은: Hello 이며 확장자는 java 입니다.
 * 
 * 입력: Java.avi 출력: 파일 이름은: Java 이며 확장자는 avi 입니다.
 */