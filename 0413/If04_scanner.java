import java.util.Scanner;

public class If04_scanner {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int score = scan.nextInt(); // score�� 0 ~ 100
		
		
		if (score>=90) {
			System.out.println("A�Դϴ�.");
		} 
		else if(score>=80) {
			System.out.println("B�Դϴ�.");
		}
		else if(score>=70) {
			System.out.println("C�Դϴ�.");
		}
		else if (score>=60) {
			System.out.println("D�Դϴ�.");
		}
		else {
			System.out.println("F�Դϴ�.");
		}
	}
}
