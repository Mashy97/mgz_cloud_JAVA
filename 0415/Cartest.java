
public class Cartest {
	public static void main(String[] args) {
		Car car01 = new Car ("제네시스", "블랙", 2, 100);
		Car car02 = new Car ("소나타", "흰색",1,60);
		
		System.out.printf("car01 = %s%n", car01);
		System.out.printf("car02 = %s%n", car02);
		
		System.out.printf("색상 = %s%n",car01.color);
		System.out.printf("속도 = %d%n",car02.speed);
		
	}
}
