import java.util.Scanner;

public class Switch01_sc {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���(1~ 7)");
		int weekday = scan.nextInt();
		
		switch(weekday){
			case 1: System.out.println("������");break;
			case 2: System.out.println("ȭ����");break;
			case 3: System.out.println("������");break;
			case 4: System.out.println("�����");break;
			case 5: System.out.println("�ݿ���");break;
			case 6: System.out.println("�����");break;
			case 7: System.out.println("�Ͽ���");break;
			default: System.out.println("1 ~ 7 ������ ���ڸ� �Է��ϼ���");
			
		}
	}
}
