import java.util.Scanner;

public class Switch02_sc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("������ �Է��ϼ���.(0 ~ 100)");
		
	
		int score = scan.nextInt();
		
		if (score<0 || score>100) {
			System.out.println("0 ~ 100 ������ ���ڸ� �Է��ϼ���.");
			System.exit(0);
		} 
		
		switch (score / 10) {
		case 10:
		case 9: System.out.println("A�����Դϴ�."); break;
		case 8: System.out.println("B�����Դϴ�."); break;
		case 7: System.out.println("C�����Դϴ�."); break;
		case 6: System.out.println("D�����Դϴ�."); break;
		default: System.out.println("F�����Դϴ�.");
		}
	}
}
