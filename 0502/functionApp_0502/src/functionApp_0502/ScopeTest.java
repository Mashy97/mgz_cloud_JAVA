package functionApp_0502;

public class ScopeTest {
	public static void main(String[] args) {
		String str = "Hello, Java";
		CustomerInterface<Integer> i = new CustomerInterface<Integer>() {
			
			@Override
			public Integer mycall(int a, int b) {
				// TODO Auto-generated method stub
				String str = "Hi, Java";
				System.out.println(str);
				return a+b;
			}
		};
		int result = i.mycall(2, 5);
		System.out.println(result);
	}
	
	
}
