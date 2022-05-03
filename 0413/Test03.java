// num의 숫자가 짝수이면 "짝수입니다." 출력 홀수이면 "홀수입니다." 출력

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num_01 = scan.nextInt();
		int	num_02 = num_01 % 2 ;
			
		if(num_02==0) {
			System.out.printf("%d은 짝수입니다.%n",num_01);
		}
		else {
			System.out.printf("%d은 홀수입니다.%n",num_01);
		}
		
	}
}
