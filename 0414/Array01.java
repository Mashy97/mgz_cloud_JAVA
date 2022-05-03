// 1차원 배열에 대한 예제
public class Array01 {
	public static void main(String[] args) {
		int [] scores = new int[5];
		System.out.printf("scores : %s%n",scores); // 메모리속 스코어 위치

		/*
		 * System.out.printf("scores[0] : %d%n",scores[0]);
		 * System.out.printf("scores[1] : %d%n",scores[1]);
		 * System.out.printf("scores[2] : %d%n",scores[2]);
		 * System.out.printf("scores[3] : %d%n",scores[3]);
		 * System.out.printf("scores[4] : %d%n",scores[4]);
		 */ 
		
		for(int i=0;i<5;i++)
			System.out.printf("scores[%d] : %d%n",i,scores[i]);
		
		System.out.printf("scores의 배열의 길이 : %d%n",scores.length);
		
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 50;
		scores[3] = 30;
		scores[4] = 80;
		
		for(int i=0;i<5;i++)
			System.out.printf("scores[%d] : %d%n",i,scores[i]);
 	}
}
