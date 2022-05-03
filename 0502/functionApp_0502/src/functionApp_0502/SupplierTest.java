package functionApp_0502;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<String> func = () -> "Hello, Java!!";
		
		String result = func.get();
		System.out.println(result);
	}
}
