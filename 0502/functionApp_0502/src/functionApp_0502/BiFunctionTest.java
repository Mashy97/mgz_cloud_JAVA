package functionApp_0502;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> func = (a, b) -> a+b;
		
		int result =func.apply(10,20);
		System.out.println(result);
		
		Account obj01 = new Account("1111","일길동","0000",1000);
		Account obj02 = new Account("2222","이길동","0000",2000);
		BiPredicate<Account, Account> func01 = (o1,o2)->o1.equals(o2);
		boolean result01 = func01.test(obj01, obj02);
		System.out.println(result01);
		
		BiConsumer<Integer, Integer> func02 = (a,b) -> System.out.println(a+b);
		func02.accept(1,2);
		
	}
}
