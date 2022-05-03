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
				System.out.printf("당신의 이름은 %s입니다.%n",name);
			} while (true);
			
			
		}
}
