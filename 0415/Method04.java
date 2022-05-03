import java.util.Scanner;

public class Method04 {
	
	public static boolean isEven(int num01) {
		if ((num01/2)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		boolean result = isEven(x);
		
		
		if(result){
			System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
	}
	

