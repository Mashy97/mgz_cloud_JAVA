
public class StringTest01_0425 {
	public static void main(String[] args) {
		String str01 = new String ("Hello, JAVA");
		String str02 = new String ("Hello, JAVA");
//		System.out.println("str01 = "+str01.toString());
		
		
		if(str01 == str02) {
			System.out.println("주소가 같습니다.");
		}
		else { 
			System.out.println("주소가 다릅니다.");
		}
		
		if(str01.equals(str02)) {
			System.out.println("문자열이 같습니다.");
		}
		else { 
			System.out.println("문자열이 다릅니다.");
		}
		
		int temp01 = str01.length();
		System.out.println(temp01);
	
		char temp02 = str02.charAt(0);
		System.out.println(temp02);
		
		String temp03 = str01.substring(0,5);
		System.out.println(temp03);
		
		temp03 = str02.substring(7);
		System.out.println(temp03);
		
		String str03 = "JAVA Spring Jpa";
		String[] temp04 = str03.split(" ");
		for (String str : temp04) {
			System.out.printf("%s%n",str);
		}
		
		String str04 = "Hello, ";
		String str05 = "JAVA!!";
		
		String temp05 = str04 + str05;
		System.out.println(str04);
		System.out.println(str05);
		System.out.println(temp05);
		
	}
}
