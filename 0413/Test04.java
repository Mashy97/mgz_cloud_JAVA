import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0�� 100������ ���ڸ� �Է��ϼ���.");
		
		int num = scan.nextInt();
		
		System.out.printf("�Էµ� ���� %d �Դϴ�.%n",num);
		
		if(num<0 ||num>100) {
			System.out.println("0�� 100������ ���ڰ� �ƴմϴ�.");
		}
	}
}
