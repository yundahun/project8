package polymorphism;
// Ex2에 있는 클래스 사용
import java.util.ArrayList;

public class Ex4 {
	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		Customer customer1 = new Customer("둘리"); // 일반 회원 생성
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜"); // vip 회원 생성
		Customer customer5 = new VIPCustomer("고길동");
		
		customerList.add(customer1); // 리스트에 회원추가
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for (Customer customer : customerList) {
			customer.calcPrice(10000);
		}
		
		for (Customer customer : customerList) {
			customer.showInfo(); // 고객정보 출력 
			
		}
		
	}
}
