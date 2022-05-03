// 논리 연산자에 대한 예제
public class Operater03 {
	public static void main(String[] args) {
		boolean flag01 = false ,flag02 = true;
		
		boolean result = flag01 || flag02;
		System.out.printf("result = %b%n", result);
		
		result = flag01 && flag02;
		System.out.printf("result = %b%n", result);
	
		boolean flag03 = true;
		result = !flag03;
		System.out.printf("result = %b%n", result);
	}
}
