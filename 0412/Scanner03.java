import java.util.Scanner;

public class Scanner03 {
	public static void main(String[] args) {
		Scanner scan01 = new Scanner(System.in);
		Scanner scan02 = new Scanner(System.in);
		
		System.out.print("�⵵ " );
		int year = scan01.nextInt();
		
		System.out.print("�̸� ");
		String str01 = scan02.nextLine();
		
		System.out.printf("%d, %s %n",year, str01);
	}
}
