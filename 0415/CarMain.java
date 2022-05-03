
public class CarMain {
	
	public static void main(String[] args) {
		
		Car car01 = new Car("제네시스", "블랙", 2, 100);
		System.out.printf("car01 : %s%n", car01);
		
		Car car02 = new Car("소나타", "흰색", 1, 60);
		System.out.printf("car02 : %s%n", car02);
		
		System.out.printf("소나타 자동차의 속도 : %d%n", car02.speed);
		car02.accelerate(20);
		System.out.printf("소나타 자동차의 속도 : %d%n", car02.speed);
	
		System.out.printf("제네시스 자동차의 속도 : %d%n", car01.speed);
		car01.decelerate(40);
		System.out.printf("제네시스 자동차의 속도 : %d%n", car01.speed);
	}
	
		
}
