package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		// 부모타입 변수 선언 = 자식클래스 인스턴스 생성
		Parents child = new Child("한국", "고", "길동");
		
		// child변수는 Parents클래스의 멤버변수만 사용할 수 있음
		System.out.println(child.lastName);
		System.out.println(child.nationality);
		
		// child변수로 자식클래스의 이름은 사용할 수 없음
		// System.out.println(child.firstName);
		
	}

}

class Parents {
	String nationality;
	String lastName;
	
	public Parents(String nationlity, String lastName) {
		this.nationality = nationlity;
		this.lastName = lastName;
	}
}

class Child extends Parents {
	String firstName;
	
	// 국적, 성, 이르믕ㄹ 입력받아 인스턴스를 생성하는 생성자
	public Child(String nationlity, String lastName, String firstName) {
		// 부모에 디폴트 생성자가 없으므로 super() 코드는 사용할 수 없음
		super(nationlity, lastName);
		
		this.firstName = firstName;
	}
}