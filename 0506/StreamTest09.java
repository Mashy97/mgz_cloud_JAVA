package functionApp_0502;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest09 {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<Account>();
		list.add(new Account("1111","일길동","0000",1000));
		list.add(new Account("2222","일이동","0000",2000));
		list.add(new Account("3333","삼길동","0000",3000));
		list.add(new Account("4444","사길동","0000",4000));
		list.add(new Account("5555","오길동","0000",5000));
		
		
		list.stream().sorted(Comparator.comparing(Account::getName)).forEach(System.out::println);
		
		
	}
}
