package inheritance;

class Man {
	String name;

//	Man(String name){
//		this.name = name;
//	}
// 이걸 넣고 싶으면 아래 this.name = name; 대신 super(name);을 넣어 준다.
// 그렇지 않을 경우에 오류가 나게 되는데, 생성자가 이미 호출되었기 때문에 에러가 나는 것
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}

}

//super, super() 함수
class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		this.name = name; //super.name = name;은 부모 거를 표현하는 방법 둘 다 가능

		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

public class MyBusinessMan {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");

		man.tellYourInfo();

	}
}
