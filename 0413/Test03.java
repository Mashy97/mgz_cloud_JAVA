// num�� ���ڰ� ¦���̸� "¦���Դϴ�." ��� Ȧ���̸� "Ȧ���Դϴ�." ���

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num_01 = scan.nextInt();
		int	num_02 = num_01 % 2 ;
			
		if(num_02==0) {
			System.out.printf("%d�� ¦���Դϴ�.%n",num_01);
		}
		else {
			System.out.printf("%d�� Ȧ���Դϴ�.%n",num_01);
		}
		
	}
}
