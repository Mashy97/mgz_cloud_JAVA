package functionApp_0502;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> func = (num)->num*num;
		int result = func.apply(5);
		System.out.println(result);
		
		Function<String, String> func01 = (str01)->str01.toUpperCase();
		String str01 = func01.apply("java");
		System.out.println(str01);
	
		Function<String, Integer> func02 = (str02)->str02.length();
		int length = func02.apply("ÀÚ¹Ù");
		System.out.println(length);
	
		
		UnaryOperator<Integer> operator = (num)->num*num;
		result = func.apply(5);
		System.out.println(result);
		
	}
}
