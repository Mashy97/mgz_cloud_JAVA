// ������ �迭 - �ϱ浿, �̱浿, ��浿 
public class Array02 {
	public static void main(String[] args) {
		String [] names = new String[3]; // �迭 ����
		
		names[0] = "�ϱ浿";	//�迭 �� �Է�
		names[1] = "�̱浿"; 	
		names[2] = "��浿";
		
		for(int i=0;i<3;i++)	//�迭 �� ���
			System.out.printf("names[%s] : %s%n",i,names[i]);
		
		
	}
}
