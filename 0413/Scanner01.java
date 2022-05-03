// Scanner 예제 01
import java.util.Scanner;
public class Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("현재 년도를 입력하세요 ");
			
			Scanner scan = new Scanner(System.in);
			int year = scan.nextInt();
			
			System.out.printf("현재 연도는 %d 입니다.", year);
	}
			
}
