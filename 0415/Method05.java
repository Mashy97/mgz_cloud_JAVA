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
		System.out.println("x�� �Է��ϼ���.");
		int x = scan.nextInt();
		System.out.println("y�� �Է��ϼ���.");
		int y = scan.nextInt();
		
		boolean result = equalsInt(x,y);
		if(result == true ) {
			System.out.printf("%d �� %d�� ���� ���Դϴ�.",x,y);
		} 
		else {
			System.out.printf("%d �� %d�� �ٸ� ���Դϴ�.",x,y);
		}
		
	}
}
