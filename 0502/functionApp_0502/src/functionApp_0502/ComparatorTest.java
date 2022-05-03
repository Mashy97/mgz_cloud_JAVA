package functionApp_0502;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
		list.add(new Account("1111","일길동","0000",1000));
		list.add(new Account("2222","이길동","0000",2000));
		list.add(new Account("3333","삼길동","0000",3000));
		list.add(new Account("4444","사길동","0000",4000));
		list.add(new Account("5555","오길동","0000",5000));
		
		Comparator<Account> func = (o1, o2) -> o1.getName().compareTo(o2.getName());
		
		
		Collections.sort(list, func);
		
		Consumer<Account> func1 = (obj) -> system.out.println(obj);
		
		list.forEach(func1);
		
	}
}
