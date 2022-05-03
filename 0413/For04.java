import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("숫자를 입력하세요 : ");
		
		int j = scan.nextInt();
	
		for (int i = 1; i<10;i++) {
			System.out.printf("%d * %d = %d%n",j,i,j*i);
		}
	
	}

}
