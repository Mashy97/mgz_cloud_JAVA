package contactApp_0427;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//=== �ּҷ� ���� ���α׷� ===
//	1. ����ó ���
//	2. ����ó �˻�
//	3. ����ó ����
//	4. ����ó ����
//	5. ��ü ����ó ���� ��ȸ
//	6. ����
public class ContactApp {
	private static HashMap<String, Contact> map = new HashMap<String, Contact>();
	int index = 0;
	//	1. ����ó ���
	public static void addContact()	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("�̸� :" );
		String name = sc.nextLine();
		
		System.out.printf("��ȭ��ȣ :" );
		String phone = sc.nextLine();
		
		System.out.printf("�̸��� : ");
		String email = sc.nextLine();
		
		map.put(name, new Contact(name, phone,email));
		System.out.println("����ó ������ ��ϵǾ����ϴ�.");
		
	}
	//	2. ����ó �˻�
	public static void findContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("�̸� :" );
		String name = sc.nextLine();
		
		Contact c = map.get(name);
		if(c==null) {
			System.out.println("�˻��ϰ��� �ϴ� �̸��� ��Ȯ�� �Է��ϼ���.");
		}else {
			System.out.println(c);
		}
	}
	// 	3. ����ó ����
	public static void removeContact() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("�̸� :" );
		String name = sc.nextLine();
		Contact c = map.get(name);
		map.remove(c.getName());	
		}
	//	4. ����ó ����
	public static void modifyContact() {
	Scanner sc = new Scanner(System.in);

	System.out.printf("�̸� :" );
	String name = sc.nextLine();
	Contact c = map.get(name);
	
	System.out.println("������ ��ȭ��ȣ�� �ٽ� �Է��ϼ���.");
	String phone = sc.nextLine();
	c.setPhone(phone);
	
	System.out.println("������ �̸��Ϸ� �ٽ� �Է��ϼ���.");
	String email = sc.nextLine();
	c.setEmail(email);
	
	System.out.println("���� �Ϸ�");
	
	}
	// 	5. ��ü ����ó ���� ��ȸ
	private static void findContactAll() {
		Set<String> keys = map.keySet();
		for (String key : keys) {
			Contact contact = map.get(key);
			System.out.println(contact);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isExit = false;
		do {
			System.out.println("=======�ּҷ� ���� ���α׷� =======");
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó �˻�");
			System.out.println("3. ����ó ����");
			System.out.println("4. ����ó ����");
			System.out.println("5. ��ü ����ó ���� ��ȸ");
			System.out.println("6. ����");
			System.out.println("�޴��� �����ϼ���.");

			
		
			
			int item =Integer.parseInt(sc.nextLine());
			Menu[] menues = Menu.values();
			Menu menu = menues[item-1];
			switch(menu) {
				case ADD:
					addContact();
				break;
				case FIND:	
					findContact();
				break;
				case REMOVE:
					removeContact();
				break;
				case MODIFY:
					modifyContact();
				break;
				case FINDALL:
					findContactAll();
				break;
				case EXIT:
				isExit = true;
				break;
			}
			
		} while (!isExit);
	}
}
