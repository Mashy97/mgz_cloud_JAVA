
public class Switch01 {
	public static void main(String[] args) {
		
		int weekday = 1; // 1~ 7 = 월~ 금
		
		switch(weekday){
			case 1: System.out.println("월요일");break;
			case 2: System.out.println("화요일");break;
			case 3: System.out.println("수요일");break;
			case 4: System.out.println("목요일");break;
			case 5: System.out.println("금요일");break;
			case 6: System.out.println("토요일");break;
			case 7: System.out.println("일요일");break;
			default: System.out.println("1 ~ 7 사이의 숫자를 입력하세요");
			
		}
	}
}
