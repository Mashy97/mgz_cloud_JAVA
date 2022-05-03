import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0과 100사이의 숫자를 입력하세요.");
		
		int num = scan.nextInt();
		
		System.out.printf("입력된 수는 %d 입니다.%n",num);
		
		if(num<0 ||num>100) {
			System.out.println("0과 100사이의 숫자가 아닙니다.");
		}
	}
}
