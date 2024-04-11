package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		
		BasicTV basicTV = new BasicTV();
		basicTV.power = true;
		basicTV.cha = 7;
		basicTV.vol = 20;
		System.out.println(basicTV.power);
		System.out.println(basicTV.cha);
		System.out.println(basicTV.vol);
		
		SmartTV smartTV = new SmartTV();
		smartTV.power = true;
		smartTV.cha = 11;
		smartTV.vol = 30;
		smartTV.ip = "192.168.0.111";
		System.out.println(smartTV.power);
		System.out.println(smartTV.cha);
		System.out.println(smartTV.vol);
		System.out.println(smartTV.ip);
		
	}

}

// 베이직티비 클래스
class BasicTV {
	Boolean power;
	int cha;
	int vol;
}

// 스마트티비 클래스
class SmartTV extends BasicTV {
	String ip;
}