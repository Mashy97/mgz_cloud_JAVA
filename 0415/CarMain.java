
public class CarMain {
	
	public static void main(String[] args) {
		
		Car car01 = new Car("���׽ý�", "��", 2, 100);
		System.out.printf("car01 : %s%n", car01);
		
		Car car02 = new Car("�ҳ�Ÿ", "���", 1, 60);
		System.out.printf("car02 : %s%n", car02);
		
		System.out.printf("�ҳ�Ÿ �ڵ����� �ӵ� : %d%n", car02.speed);
		car02.accelerate(20);
		System.out.printf("�ҳ�Ÿ �ڵ����� �ӵ� : %d%n", car02.speed);
	
		System.out.printf("���׽ý� �ڵ����� �ӵ� : %d%n", car01.speed);
		car01.decelerate(40);
		System.out.printf("���׽ý� �ڵ����� �ӵ� : %d%n", car01.speed);
	}
	
		
}
