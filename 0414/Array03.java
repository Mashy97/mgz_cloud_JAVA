// 배열 초기화 예제
public class Array03 {
	public static void main(String[] args) {
		int [] scores = {100, 90, 50, 30, 80};

			for(int i=0;i<5;i++) {	//배열 값 출력
				System.out.printf("scores[%s] : %s%n",i,scores[i]);
			}
		int total = 0;
		double average;
		
			for(int j=0;j<5;j++) {
				total += scores[j];
			}
				average = total/scores.length;
				System.out.printf("total = %d, average = %.1f",total,average);
				// System.out.printf("total = %d, average = %d, total, total/scores.length); 
	}
}
