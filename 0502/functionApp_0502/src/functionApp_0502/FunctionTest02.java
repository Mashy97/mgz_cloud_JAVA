package functionApp_0502;

import java.util.function.Function;

public class FunctionTest02 {
	public static void main(String[] args) {
		Function<Integer, Boolean> func01 = (num) -> num % 2 ==0;
		Function<Boolean, String> func02 = (flag) -> "result : "+flag;
		
		String str = func01.andThen(func02).apply(10);
		System.out.println(str);
		
		str = func02.compose(func01).apply(10);
		System.out.println(str);
	}
}
