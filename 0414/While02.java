import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		System.out.print("Enter input data : ");
		
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {
			String token = scan.next();
			System.out.printf("%s%n",token);
		}
		
	}
}
