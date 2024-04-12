package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		
		// for문으로 리스트의 요소를 하나씩 꺼냄
		for (int i = 0; i < aniList.size(); i++) {
			
			Animal ani = aniList.get(i); // 요소를 꺼내서 Animal변수형에
			
			if (ani instanceof Human) { // 인스턴스 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
				
			} else if (ani instanceof Tiger) {// 인스턴스 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger형으로 다운캐스팅
				t.hunting();
				
			} else if (ani instanceof Eagle) { // 인스턴스 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Ealge형으로 다운캐스팅
				e.flying();
			}
		} 
		
	}

}
