// �������� �迭
public class Array08 {
	public static void main(String[] args) {
		int [][] arr = new int [4][];
		
		System.out.printf("arr = %s%n", arr);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf("%s%n",arr[i]);
//		}
		//�迭 ��ҿ� �� �Ҵ�
		arr[0] = new int [2];
		arr[1] = new int [3];
		arr[2] = new int [3];
		arr[3] = new int [4];
		
		//for ���� �̿��Ͽ� �迭 ��� ����ϱ�
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf("%d\t",arr[i][j]);
//			}
//		}
		//
		arr[0][0] = 100;
		arr[0][1] = 100;
		arr[1][0] = 90;
		arr[1][1] = 90;
		arr[1][2] = 90;
		arr[2][0] = 80;
		arr[2][1] = 80;
		arr[2][2] = 80;
		arr[3][0] = 70;
		arr[3][1] = 70;
		arr[3][2] = 70;
		arr[3][3] = 70;
		//for each ���� �̿��Ͽ� �迭 ��� ����ϱ�
		for(int[] temp01: arr) {
			for(int temp02: temp01) {
				System.out.printf("%d%n",temp02);
			}
			System.out.println();
		}
	
	}
}
