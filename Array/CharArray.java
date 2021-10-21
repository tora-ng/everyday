package StudyPrac;

public class CharArray {

	public static void main(String[] args) {
		char[] alpabet = new char[26];
		
		for(int i = 0; i < alpabet.length; i++) {
			//0 - A
			//1 - (char) A + 1 ...
			alpabet[i] = (char)('A' + i); //char + 정수는 정수(int형)로 오기 때문에 형변환을 해 줘야 한다.
			System.out.println(alpabet[i]);
		}
		for(char ch : alpabet) {
			System.out.println(ch);
		}
		
	}

}

/*
char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력 해보자. 
알파벳은 26개.
*/