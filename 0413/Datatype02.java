// 기본 자료형 - 정수형
public class Datatype02 {
public static void main (String[] args) {
	
		int num01 = 10;
		String num02 = Integer.toOctalString(num01);
		System.out.println("num2 = "+num02);
	
		String num03 = Integer.toHexString(num01);
		System.out.println("num03 = "+num03);
		
		String num04 = Integer.toBinaryString(num01);
		System.out.println("num04 = "+num04);
		
		int num05 = 012;
		System.out.println("num05 = "+num05);
		
		int num06 = 0xa;
		System.out.println("num06 = "+num06);
		
		int num07 = 0b1010;
		System.out.println("num07 = "+num07);
		
		long num08 = 100L;
		System.out.println("num08 = "+num08);
		
		byte num09 = 127;
		System.out.println("num09 = "+num09);
		
		
	}
}
