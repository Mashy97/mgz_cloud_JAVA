
public class Method03 {
	//�޼ҵ� ����
	public static void printArray(int [] temp) {
		//���� ����� ������ ���
		for(int i=0;i<5;i++) {
			System.out.printf("%d\t",temp[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int [] arr = {1,5,2,6,7};
		
		printArray(arr);
		//�޼ҵ� ȣ��
	}
}
