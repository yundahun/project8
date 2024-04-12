package polymorphism;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new GoldCustomer("다훈"));
		
		for (Customer customer : customerList) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
	}

}

class GoldCustomer extends Customer {
	double saleRatio; // 할인률
	
	public GoldCustomer(String customerName) {
		
		super(customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
//		System.out.println("GoldCustomer() 생성자 호출");
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}
}
