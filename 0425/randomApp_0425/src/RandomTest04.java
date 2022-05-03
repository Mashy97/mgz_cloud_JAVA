import java.util.Random;

public class RandomTest04 {
	public static void main(String[] args) {
		int x=0;
		Random ran = new Random();
		for (int i = 1; i<=500;i++) {
			boolean temp = ran.nextBoolean();
			if(temp) {
				x++;
			}
		}
		System.out.println("¾Õ¸é : "+x+" µŞ¸é : "+(500-x));
	}
}
