package collectionApp;

import java.util.ArrayList;

public class Cart  {
		private String userID;
		private ArrayList<Item> items = new ArrayList<Item>();
		private int index = 0;
		Cart(String userID){
			this.userID = userID;
		}
	
		public void addCart(Item item) {
			boolean isExist = false;
			for(Item temp: items) {
				if(temp.getNum()== item.getNum()) {
					temp.setQuantity(temp.getQuantity()+item.getQuantity());
					isExist = true;
					break;
				}
			}
		if(!isExist) {
			items.add(item);
		}
	} 	
		public ArrayList<Item> getItems(){
			return items;
		}
		//장바구니 수량 변경
		public void updateCart(int num,int x) {
			boolean isExist = false;
			for(Item temp: items) {
				if(temp.getNum()==num) {
					temp.setQuantity(x);
					isExist = true;
					break;
				}
			}
			
		}
		
		public void removeCart(int x) {
			items.remove(x);
		}
		
		public void emptyCart() {
			items.clear();
		}
		
}

