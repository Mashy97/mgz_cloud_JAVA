import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("������ �Է��ϼ��� : ");	
		String gender = scan.nextLine();
		
		System.out.println("�Է� : "+gender);
		/*
		 * char ch = gender.charAt(0); // charAt ���
		 * 
		 * if(ch == 'M'|| ch =='m') { System.out.println("�����Դϴ�."); } else {
		 * System.out.println("�����Դϴ�."); }
		 */
		
		
//		equalsIgnoreCase -> ��ҹ��� ������� ����
		if(gender.equalsIgnoreCase("M")) {
			System.out.println("������ �����Դϴ�.");
		} 
		else {
		System.out.println("������ �����Դϴ�.");
		}
		
		
	}
}
