package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.nationality = "한국"; // 부모 클래스에서 물려받음
		
		child.lastName = "윤"; // 부모 클래스에서 물려받음
		
		child.firstName = "다훈";
	}

}

// 부모 클래스
class Parents {
	String nationality; // 국적
	String lastName; // 성
}

// 자식 클래스
class Child extends Parents { // 클래스 이름 뒤쪽으로 키워드쓰고 부모의 이름 명시
	String firstName; // 이름
}