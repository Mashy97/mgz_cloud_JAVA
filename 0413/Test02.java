//gender가 'M' 또는 'm'이면 "남자입니다." 출력 'F' 또는 'f'면 "여자입니다." 출력

public class Test02 {
	public static void main(String[] args) {
		
		char gender = 'm';
		
	if(gender == 'M' || gender =='m') {
		System.out.printf("성별은 남자입니다.");
	}
	else if(gender =='F'|| gender =='f') {
		System.out.printf("성별은 여자입니다.");
	}
	else {
		System.out.println("M 또는 F를 입력해주세요.");
	}
	
}
}
