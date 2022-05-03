import java.util.Random;

public class RandomTest03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		for (int i =1; i<= 100; i++) {
//			int temp = ran.nextInt();
			int temp = ran.nextInt(101);
			System.out.println(temp);
		}
	}
}
