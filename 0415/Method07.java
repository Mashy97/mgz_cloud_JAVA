
public class Method07 {
	
	public static void divide(int num01, int num02) {
		if(num02==0) {
			return;
		}
		System.out.printf("%d / %d = %d%n", num01, num02, (num01/ num02));
	}
	
	
	
	public static void main(String[] args) {
			divide(10,0);
	}
}
