
public class Test_0414_02 {
public static void main(String[] args) {
		
		//배열 선언 및 생성
		int[] ssn = {1, 9, 1, 2, 1, 7, 1, 2, 3, 4, 5, 6, 6};
		
		int[] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		
		int total = 0;
		for (int i = 0; i < check.length; i++) {
			total += ssn[i] * check[i];
		}
		
		int result = total % 11;
		result = 11 - result;
		
		if (result >= 10) {
			result %= 10; //result = result % 10;    
		}
		
		if (result != ssn[ssn.length - 1]) {
			System.out.println("유효하지 않는 주민번호입니다.");
			System.exit(0);
		}	
		
		if (ssn[6] == 1 || ssn[6] == 3) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
		
		int age = 0;
		if (ssn[6] == 1 || ssn[6] == 2) {
			age = 2022 - (1900 + (ssn[0] * 10 + ssn[1]));
		} else {
			age = 2022 - (2000 + (ssn[0] * 10 + ssn[1]));
		}		
		System.out.println(age);
		
	}
}
