// 타입 변환에 대한 예제
public class Datatype_conversion02 {
	public static void main(String[] args) {
	
		int num01 = 500;
		byte num02 = (byte)num01;
		System.out.println("num01 = "+num01+" num02 = "+num02);
		
		
		String binary = Integer.toBinaryString(num01);
		System.out.println("binary : "+binary);
	}

}
