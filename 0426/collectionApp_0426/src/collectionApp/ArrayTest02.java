package collectionApp;

import java.util.ArrayList;

public class ArrayTest02 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<Car>();
		
		list.add(new Car ("소나타","흰색",1,60));
		list.add(new Car ("그랜저","블랙",1,70));
		list.add(new Car ("제네시스","회색",1,80));
	
//		for(Car temp: list) {
//			System.out.println(temp.color);
//		}

		// 인덱스 번혹다 1에 자동차를 추가한다.
		list.add(1,new Car("아벤떼", "흰색",1,70));
		for(Car temp : list) {
		System.out.println(temp.toString());
	}
	}
}

