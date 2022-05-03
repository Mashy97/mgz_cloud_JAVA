package functionApp_0502;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<Account>();
		list.add(new Account("1111","�ϱ浿","0000",1000));
		list.add(new Account("2222","�ϱ浿","0000",2000));
		list.add(new Account("3333","��浿","0000",3000));
		list.add(new Account("4444","��浿","0000",4000));
		list.add(new Account("5555","���浿","0000",5000));
		
		
		Stream<Account> stream = list.stream();
		Stream<Account> stream01 = stream.filter(g->g.getName().startsWith("��"));
		stream01.forEach(System.out::println);
		
//		list.stream().filter(g -> g.getName().startsWith("��")).forEach(System.out::println);
		list.stream().map(account -> String.format("%,d��",account.getBalance())).forEach(System.out::println);
	
		list.stream().map(account ->{
			account.setName(account.getName().substring(0,1));
			return account;
			
		}).forEach(System.out::println);
	
	}
}
