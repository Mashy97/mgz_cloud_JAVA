package functionApp_0502;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<Account>();
		list.add(new Account("1111","일길동","0000",1000));
		list.add(new Account("2222","일길동","0000",2000));
		list.add(new Account("3333","삼길동","0000",3000));
		list.add(new Account("4444","사길동","0000",4000));
		list.add(new Account("5555","오길동","0000",5000));
		
		
		Stream<Account> stream = list.stream();
		Stream<Account> stream01 = stream.filter(g->g.getName().startsWith("일"));
		stream01.forEach(System.out::println);
		
//		list.stream().filter(g -> g.getName().startsWith("일")).forEach(System.out::println);
		list.stream().map(account -> String.format("%,d원",account.getBalance())).forEach(System.out::println);
	
		list.stream().map(account ->{
			account.setName(account.getName().substring(0,1));
			return account;
			
		}).forEach(System.out::println);
	
	}
}
