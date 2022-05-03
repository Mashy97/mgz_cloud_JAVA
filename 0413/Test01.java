// gender가 'M'이면 "남자입니다." 출력 'F'면 "여자입니다." 출력 

public class Test01 {
	public static void main(String[] args) {
		
			char gender = 'M';
			
		if(gender == 'M' ) {
			System.out.printf("성별은 남자입니다.");
		}
		else if(gender == 'F' ) {
			System.out.printf("성별은 여자입니다.");
		}
		else {
			System.out.println("M 또는 F를 입력해주세요.");
		}
		
	}
}
