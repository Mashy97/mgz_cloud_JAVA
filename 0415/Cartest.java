
public class Cartest {
	public static void main(String[] args) {
		Car car01 = new Car ("���׽ý�", "��", 2, 100);
		Car car02 = new Car ("�ҳ�Ÿ", "���",1,60);
		
		System.out.printf("car01 = %s%n", car01);
		System.out.printf("car02 = %s%n", car02);
		
		System.out.printf("���� = %s%n",car01.color);
		System.out.printf("�ӵ� = %d%n",car02.speed);
		
	}
}
