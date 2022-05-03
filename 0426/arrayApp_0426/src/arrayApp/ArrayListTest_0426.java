package arrayApp;

import java.util.ArrayList;

public class ArrayListTest_0426 {
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
		
		list.add(new Account("1111","일길동","0000",1000));
		list.add(new Account("2222","이길동","0000",2000));
		list.add(new Account("3333","삼길동","0000",3000));
	}
}
