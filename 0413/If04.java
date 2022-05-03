
//A( 90~100 ), B( 80~89 ), C( 70~79 ), D( 60~69 ), F( 0~59 )
public class If04 {
	public static void main(String[] args) {
		

		int score = 95;
		
		
		if (score>=90) {
			System.out.println("A입니다.");
		} 
		else if(score>=80) {
			System.out.println("B입니다.");
		}
		else if(score>=70) {
			System.out.println("C입니다.");
		}
		else if (score>=60) {
			System.out.println("D입니다.");
		}
		else {
			System.out.println("F입니다.");
		}
	}
}
