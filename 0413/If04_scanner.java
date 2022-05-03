import java.util.Scanner;

public class If04_scanner {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		int score = scan.nextInt(); // score는 0 ~ 100
		
		
		if (score>=90) {
			System.out.println("A입니다.");
		} 
		else if(score>=80) {
			System.out.println("B입니다.");
		}
		else if(score>=70) {
			System.out.println("C입니다.");
		}
		else if (score>=60) {
			System.out.println("D입니다.");
		}
		else {
			System.out.println("F입니다.");
		}
	}
}
