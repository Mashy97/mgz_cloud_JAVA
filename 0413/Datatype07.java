// �پ��� ������ Ÿ�Կ� ����� ������ ���� ��� ����
public class Datatype07 {
	public static void main(String[] args) {
		String name = "��â��";
		int age = 26;
		String gender = "male";
		boolean isMarried = false;
		double height = 175.5;
		
		
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("���� = "+gender);
		System.out.println("��ȥ ���� = "+isMarried);
		System.out.println("Ű = "+height);
		
		
		
//		 System.out.println("�̸��� "+ name + ", ���̴� "+age);
		System.out.printf("�̸��� %s, ���̴� %d, ������ %s, ��ȥ ���δ� %b, Ű�� %.1f %n",name,age,gender,isMarried,height);
	}
}
