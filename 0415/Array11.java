// method�� Ȱ���Ͽ� �迭 ����ϱ� 
public class Array11 {
	
	public static void printArray(int[] scores) {
		for(int i=0;i<scores.length;i++) {
			System.out.printf(" %d%n",scores[i]);
		}
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		int [] scores = new int[5];
						// �޸𸮼� ���ھ� ��ġ

	printArray(scores);
	
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 50;
		scores[3] = 30;
		scores[4] = 80;
		
	printArray(scores);
	
	}
}
