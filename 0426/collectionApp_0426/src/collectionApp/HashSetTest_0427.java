package collectionApp;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest_0427 {
	
	public static void print(HashSet<Account> sets) {
//		for(Account temp : sets) {
//			System.out.printf("%s%n",temp);
//		}
		
		Iterator<Account> i = sets.iterator();
		while(i.hasNext()) {
			Account ac = i.next();
			System.out.printf("%s%n",ac);
		}
	}
	
	
	public static void main(String[] args) {
		HashSet<Account> sets = new HashSet<Account>();
		
		
		Account obj01 = new Account ("1111","�ϱ浿","0000",1000);
		Account obj02 = new Account ("2222","�̱浿","0000",2000);
		Account obj03 = new Account ("3333","��浿","0000",3000);
		Account obj04 = new Account ("1111","�ϱ浿","0000",1000);

		
		System.out.printf("%d%n",obj01.hashCode());
		System.out.printf("%d%n",obj02.hashCode());
		System.out.printf("%d%n",obj03.hashCode());
		System.out.printf("%d%n",obj04.hashCode());
		
		sets.add(obj01);
		sets.add(obj02);
		sets.add(obj03);
		sets.add(obj04);
		
		print(sets);
		
		
	}
}
