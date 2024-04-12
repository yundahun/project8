package downcasting;

public class Ex1 {

	public static void main(String[] args) {
		
		// 부모타입으로 형변환
		Animal animal = new Human();
		
		if (animal instanceof Human) {
			
			Human human = (Human) animal;
			
			human.readBook();
		}
		
		// 타입을 확인해야하는 이유: 컴파일 오류는 안나고 런타임 오류가 남
		Tiger tiger = (Tiger) animal;
		
		Eagle eagle  = (Eagle) animal;
	}

}

// 동물 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// 사람 클래스
class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

// 호랑이 클래스
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

// 독수리 클래스
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}