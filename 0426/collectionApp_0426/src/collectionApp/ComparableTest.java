package collectionApp;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	
	public static void printAccounts(ArrayList<Account> list) {
		for (Account account : list) {
			System.out.printf("%s%n",account);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
		
		list.add(new Account("1111","일길동","0000",1000));
		list.add(new Account("2222","이길동","0000",2000));
		list.add(new Account("3333","삼길동","0000",3000));
		list.add(new Account("4444","사길동","0000",4000));
		list.add(new Account("5555","오길동","0000",5000));
		
		printAccounts(list);
	
		Collections.sort(list);
		System.out.println("=======================");
		
		printAccounts(list);
		
		
		//고객명으로 오름차순으로 정리
	}
	
}
