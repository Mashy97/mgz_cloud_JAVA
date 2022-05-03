import java.util.Scanner;

public class Scanner03 {
	public static void main(String[] args) {
		Scanner scan01 = new Scanner(System.in);
		Scanner scan02 = new Scanner(System.in);
		
		System.out.print("년도 " );
		int year = scan01.nextInt();
		
		System.out.print("이름 ");
		String str01 = scan02.nextLine();
		
		System.out.printf("%d, %s %n",year, str01);
	}
}
