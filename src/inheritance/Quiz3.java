package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
		
		BallPen ball = new BallPen();
		ball.vold = 2;
		ball.remain = 100;
		ball.color = "파랑색";
		ball.showInfo();
		
		System.out.println();
		
		FounttainPen founttain = new FounttainPen();
		founttain.vold = 3;
		founttain.remain = 80;
		founttain.brand = "몽블랑";
		founttain.showInfo();
	}

}

class Pen {
	int vold;
	int remain;
}

class BallPen extends Pen {
	String color;
	
	public void showInfo() {
		System.out.println("펜의 굵기는 "+ vold + " 남은 양은 " + remain + " 펜의 색깔은 " + color + "입니다.");
	}
}

class FounttainPen extends Pen {
	String brand;
	
	public void showInfo() {
		System.out.println("펜의 굵기는 "+ vold + " 남은 양은 " + remain + " 펜의 브랜드는 " + brand + "입니다.");
	}
}