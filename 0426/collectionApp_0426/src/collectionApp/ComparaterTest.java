package collectionApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparaterTest {
	
	public static void printItems(ArrayList<Item> list) {
		for(Item item : list) {
			System.out.printf("%s%n",item);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<Item>();
		
		list.add(new Item(1,"TV",1,1000000));
		list.add(new Item(5,"Audio",1,3000000));
		list.add(new Item(2,"Radio",2,1000000));
		list.add(new Item(3,"Notebook",1,2000000));
		list.add(new Item(4,"Video",1,6000000));
	
		
		printItems(list);
		ItemNoComparator comparator = new ItemNoComparator();
		Collections.sort(list,comparator);
		System.out.println("============================");
		printItems(list);
		
		//제품명순으로 오름차순 
		Comparator<Item> comparator01 = new Comparator<Item>() {
 
			@Override
			public int compare(Item o1, Item o2) {
				return -o1.getName().compareTo(o2.getName());
			}
			
		};
		Collections.sort(list, comparator01);
		System.out.println("============================");
		printItems(list);
	}
}
