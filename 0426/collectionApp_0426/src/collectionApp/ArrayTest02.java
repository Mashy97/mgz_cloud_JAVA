package collectionApp;

import java.util.ArrayList;

public class ArrayTest02 {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<Car>();
		
		list.add(new Car ("�ҳ�Ÿ","���",1,60));
		list.add(new Car ("�׷���","��",1,70));
		list.add(new Car ("���׽ý�","ȸ��",1,80));
	
//		for(Car temp: list) {
//			System.out.println(temp.color);
//		}

		// �ε��� ��Ȥ�� 1�� �ڵ����� �߰��Ѵ�.
		list.add(1,new Car("�ƺ���", "���",1,70));
		for(Car temp : list) {
		System.out.println(temp.toString());
	}
	}
}

