
public class CarApp {
	public static void main(String[] args) {
		
		// �ڵ��� ����ȸ�縦 ��ȸ�Ͽ� ����Ͻÿ�.
		String company = Car.getCompany();
		System.out.printf("����ȸ�� :%s%n",Car.company);
		
		
		Car car01 = new Car("���׽ý�", "��",2,100);
		Car car02 = new Car("�ҳ�Ÿ", "ȭ��Ʈ",1,60);
	}
}
