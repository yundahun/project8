package polymorphism;

public class Quiz1 {

	public static void main(String[] args) {
		
		runCar(new Bus());
		runCar(new SportsCar());
		
	}
	
	 // 1번 부모타입의 매개변수 사용
	public static void runCar(Car car) {
		car.run();
	}
	
	// 2번 각각 자식타입의 매개변수 사용
//	public static void runCar(Bus bus) {
//		bus.run();
//	}
//	public static void runCar(SportsCar sportsCar) {
//		sportsCar.run();
//	}
}

class Car {
	
	public void run() {
		System.out.println("자동차가 달린다.");
	}
}

class Bus extends Car {

	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
	
}

class SportsCar extends Car {

	@Override
	public void run() {
		System.out.println("스포츠카가 달린다.");
	}
	
}