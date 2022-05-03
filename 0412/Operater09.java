//대입 연산자에 대한 예제 +=, -=, *=, /=, %=
public class Operater09 {
	public static void main(String[] args) {
		
		int num01=5, num02=10;
		
		num01 += num02;
		System.out.printf("num01 = %d, num02 = %d%n",num01, num02);
		
		
		num01 = 5; 
		num01 -= num02;
		System.out.printf("num01 = %d, num02 = %d%n",num01, num02);

		num01 = 5; 
		num01 *= num02;
		System.out.printf("num01 = %d, num02 = %d%n",num01, num02);
		
		num01 = 5;
		num02 /= num01;
		System.out.printf("num01 = %d, num02 = %d%n",num01, num02);
		
		num02 = 10;
		num02 %= num01;
		System.out.printf("num01 = %d, num02 = %d%n",num01, num02);
		}
}