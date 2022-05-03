package functionApp_0502;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
		list.add(new Account("1111","�ϱ浿","0000",1000));
		list.add(new Account("2222","�̱浿","0000",2000));
		list.add(new Account("3333","��浿","0000",3000));
		list.add(new Account("4444","��浿","0000",4000));
		list.add(new Account("5555","���浿","0000",5000));
		
		Comparator<Account> func = (o1, o2) -> o1.getName().compareTo(o2.getName());
		
		
		Collections.sort(list, func);
		
		Consumer<Account> func1 = (obj) -> system.out.println(obj);
		
		list.forEach(func1);
		
	}
}
