import java.util.Scanner;

public class Dowhile02 {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			boolean flag = true;
			
			do {
				System.out.println("Input name [quit]");
				String name = scan.nextLine();
				if (name.equals("quit")) {
					break;
				}
				System.out.printf("����� �̸��� %s�Դϴ�.%n",name);
			} while (true);
			
			
		}
}
