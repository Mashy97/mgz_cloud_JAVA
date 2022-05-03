import java.util.Scanner;

public class Method05 {
	
	public static boolean equalsInt(int num01, int num02) {
		if (num01 == num02) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x를 입력하세요.");
		int x = scan.nextInt();
		System.out.println("y를 입력하세요.");
		int y = scan.nextInt();
		
		boolean result = equalsInt(x,y);
		if(result == true ) {
			System.out.printf("%d 와 %d는 같은 값입니다.",x,y);
		} 
		else {
			System.out.printf("%d 와 %d는 다른 값입니다.",x,y);
		}
		
	}
}
