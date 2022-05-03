package functionApp_0502;

public class Test02 {
	public static void main(String[] args) {
		
		CustomerInterface<Integer> i = (num01, num02) -> num01 * num02;
		
		System.out.printf("%s%n",i.mycall(10,10));
		i.printDefault();
		CustomerInterface.printStatic();
	}
}
