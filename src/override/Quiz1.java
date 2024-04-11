package override;

public class Quiz1 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.eat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
	}

}

class Animal {
	
	public void eat() {
		System.out.println("먹이를 먹는다");
	}
	
	public void sound() {
		System.out.println("짖는다");
	}
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 짖는다");
	}
	
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("강아지는 고기를 먹는다");
	}

	@Override
	public void sound() {
		System.out.println("강아지는 멍멍하고 짖는다");
	}

}

