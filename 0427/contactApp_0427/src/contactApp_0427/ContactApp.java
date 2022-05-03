package contactApp_0427;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//=== 주소록 관리 프로그램 ===
//	1. 연락처 등록
//	2. 연락처 검색
//	3. 연락처 삭제
//	4. 연락처 변경
//	5. 전체 연락처 정보 조회
//	6. 종료
public class ContactApp {
	private static HashMap<String, Contact> map = new HashMap<String, Contact>();
	int index = 0;
	//	1. 연락처 등록
	public static void addContact()	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름 :" );
		String name = sc.nextLine();
		
		System.out.printf("전화번호 :" );
		String phone = sc.nextLine();
		
		System.out.printf("이메일 : ");
		String email = sc.nextLine();
		
		map.put(name, new Contact(name, phone,email));
		System.out.println("연락처 정보가 등록되었습니다.");
		
	}
	//	2. 연락처 검색
	public static void findContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름 :" );
		String name = sc.nextLine();
		
		Contact c = map.get(name);
		if(c==null) {
			System.out.println("검색하고자 하는 이름을 정확히 입력하세요.");
		}else {
			System.out.println(c);
		}
	}
	// 	3. 연락처 삭제
	public static void removeContact() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("이름 :" );
		String name = sc.nextLine();
		Contact c = map.get(name);
		map.remove(c.getName());	
		}
	//	4. 연락처 변경
	public static void modifyContact() {
	Scanner sc = new Scanner(System.in);

	System.out.printf("이름 :" );
	String name = sc.nextLine();
	Contact c = map.get(name);
	
	System.out.println("변경할 전화번호로 다시 입력하세요.");
	String phone = sc.nextLine();
	c.setPhone(phone);
	
	System.out.println("변경할 이메일로 다시 입력하세요.");
	String email = sc.nextLine();
	c.setEmail(email);
	
	System.out.println("변경 완료");
	
	}
	// 	5. 전체 연락처 정보 조회
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
			System.out.println("=======주소록 관리 프로그램 =======");
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 검색");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 연락처 변경");
			System.out.println("5. 전체 연락처 정보 조회");
			System.out.println("6. 종료");
			System.out.println("메뉴를 선택하세요.");

			
		
			
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
