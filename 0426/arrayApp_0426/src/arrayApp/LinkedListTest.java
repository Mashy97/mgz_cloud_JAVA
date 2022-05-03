package arrayApp;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList<Account> list = new LinkedList<Account>();
		
		list.add(new Account("1111","일길동","0000",1000));
		list.add(new Account("2222","이길동","0000",2000));
		list.add(new Account("3333","삼길동","0000",3000));
	
		for(Account temp: list) {
			System.out.printf("%s%n",temp);
		}
	list.add(1,new Account("4444","사길동","0000",4000));
	for(Account temp: list) {
		System.out.printf("%s%n",temp);
	}
	list.remove(1);	
	for(Account temp: list) {
		System.out.printf("%s%n",temp);
	}
	}
}
