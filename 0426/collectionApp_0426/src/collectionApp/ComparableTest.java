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
		
		list.add(new Account("1111","�ϱ浿","0000",1000));
		list.add(new Account("2222","�̱浿","0000",2000));
		list.add(new Account("3333","��浿","0000",3000));
		list.add(new Account("4444","��浿","0000",4000));
		list.add(new Account("5555","���浿","0000",5000));
		
		printAccounts(list);
	
		Collections.sort(list);
		System.out.println("=======================");
		
		printAccounts(list);
		
		
		//�������� ������������ ����
	}
	
}
