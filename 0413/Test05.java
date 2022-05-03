import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("성별을 입력하세요 : ");	
		String gender = scan.nextLine();
		
		System.out.println("입력 : "+gender);
		/*
		 * char ch = gender.charAt(0); // charAt 사용
		 * 
		 * if(ch == 'M'|| ch =='m') { System.out.println("남자입니다."); } else {
		 * System.out.println("여자입니다."); }
		 */
		
		
//		equalsIgnoreCase -> 대소문자 상관없이 같음
		if(gender.equalsIgnoreCase("M")) {
			System.out.println("성별은 남자입니다.");
		} 
		else {
		System.out.println("성별은 여자입니다.");
		}
		
		
	}
}
