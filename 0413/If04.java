
//A( 90~100 ), B( 80~89 ), C( 70~79 ), D( 60~69 ), F( 0~59 )
public class If04 {
	public static void main(String[] args) {
		

		int score = 95;
		
		
		if (score>=90) {
			System.out.println("A�Դϴ�.");
		} 
		else if(score>=80) {
			System.out.println("B�Դϴ�.");
		}
		else if(score>=70) {
			System.out.println("C�Դϴ�.");
		}
		else if (score>=60) {
			System.out.println("D�Դϴ�.");
		}
		else {
			System.out.println("F�Դϴ�.");
		}
	}
}
