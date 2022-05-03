package wrapperApp;

public class WrapperTest {
	
	public static int add(int num01, int num02) {
		return num01+num02;
	}
	public static void main(String[] args) {
		Integer obj01 = new Integer.valueOf(10);
		Integer obj02 = new Integer.valueOf(20);
		
		int result = add(obj01,obj02);
		System.out.println(result);
	}
}
