package collectionApp;

import java.util.ArrayList;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart("java");
		
		cart.addCart(new Item(1,"Ƽ��",1,1000000));
		cart.addCart(new Item(2,"��ǻ��",2,1000000));
		cart.addCart(new Item(1,"Ƽ��",5,1000000));
		cart.addCart(new Item(2,"��ǻ��",10,1000000));
		cart.addCart(new Item(3,"�����",3,1000000));
		cart.addCart(new Item(4,"�����",12,1000000));
		
		ArrayList<Item> items = cart.getItems();
		System.out.println("-----��ü ���-----");
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}
		
		System.out.println("-----���� ����-----");
		cart.updateCart(3,7);
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}
		
		
		
		
		System.out.println("-----�κ� ����-----");
		cart.removeCart(0);
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}
	

		System.out.println("-----��ü ����-----");
		cart.emptyCart();
		for(Item item : items) {
			System.out.printf("%s%n",item);		
		}

	}
}
