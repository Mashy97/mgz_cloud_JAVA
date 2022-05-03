// Scanner 예제 02
import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요" );
		
		String str01 = scan.nextLine();
		
		System.out.printf("당신의 이름은 %s입니다.%n",str01);
	}
}
