package functionApp_0502;

public class ScopeTest01 {
	public static void main(String[] args) {
		String str = "Hello, Java";

		CustomerInterface<Integer> i = (a,b) -> {
		System.out.println(str);
		return a+b;
	};
		int result = i.mycall(2, 5);
		System.out.println(result);
		{
			int temp = 10;

		}
		{
			int temp = 10;
		}
	}
}
