package collectionApp;

import java.util.ArrayList;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart("java");
		
		cart.addCart(new Item(1,"티비",1,1000000));
		cart.addCart(new Item(2,"컴퓨터",2,1000000));
		cart.addCart(new Item(1,"티비",5,1000000));
		cart.addCart(new Item(2,"컴퓨터",10,1000000));
		cart.addCart(new Item(3,"냉장고",3,1000000));
		cart.addCart(new Item(4,"모니터",12,1000000));
		
		ArrayList<Item> items = cart.getItems();
		System.out.println("-----전체 출력-----");
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}
		
		System.out.println("-----수량 변경-----");
		cart.updateCart(3,7);
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}
		
		
		
		
		System.out.println("-----부분 제거-----");
		cart.removeCart(0);
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}
	

		System.out.println("-----전체 제거-----");
		cart.emptyCart();
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}

	}
}
