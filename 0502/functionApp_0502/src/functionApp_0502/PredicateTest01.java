package functionApp_0502;

import java.util.function.Predicate;

public class PredicateTest01 {

	public static void main(String[] args) {
	
			Predicate<Integer> func = (num) -> num %2 == 0;
			boolean result = func.negate().test(1);
			System.out.println(result);
			
			Predicate<Integer> func01 = (num) -> num %2 == 0;
			Predicate<Integer> func02 = (num) -> num %3 == 0;
			result = func01.and(func02).test(8);
			System.out.println(result);
			
			result = func01.or(func02).test(8);
			System.out.println(result);
	}
}
